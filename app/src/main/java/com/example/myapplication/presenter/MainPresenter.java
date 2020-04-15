package com.example.myapplication.presenter;

import com.example.myapplication.MainContract;
import com.example.myapplication.util.Buttons;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    private static final String ERROR_MESSAGE = "No recognized button";

    public MainPresenter(MainContract.View view) {
        this.mView = view;
    }

    /**
     * This function is responsible to receiving the call from MainPresenter and making a decision.
     *
     * @param buttonId This param represent the current id of the button has been tapped.
     */
    public void handleButtonClicked(int buttonId) {
        switch (buttonId) {
            case Buttons.toast_button:
                mView.showToast();
                break;

            case Buttons.dialog_button:
                mView.showDialog();
                break;

            case Buttons.new_activity_button:
                mView.showSettingScreen();
                break;

            default:
                mView.logError(ERROR_MESSAGE);
                break;
        }
    }
}
