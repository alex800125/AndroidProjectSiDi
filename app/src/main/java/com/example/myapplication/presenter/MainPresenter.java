package com.example.myapplication.presenter;

import com.example.myapplication.MainContract;
import com.example.myapplication.util.Buttons;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    /**
     * This function is responsible to receiving the call from MainPresenter and making a decision.
     *
     * @param buttonId This param represent the current id of the button has been tapped.
     */
    public void handleButtonClicked(int buttonId) {
        switch (buttonId) {
            case Buttons.toast_button:
                view.showToast();
                break;

            case Buttons.dialog_button:
                view.showDialog();
                break;

            case Buttons.new_activity_button:
                view.showSettingScreen();
                break;

            default:
                view.logError("No recognized button");
                break;
        }
    }
}
