package com.example.myapplication.presenter;

import com.example.myapplication.MainContract;
import com.example.myapplication.util.ButtonUtils;
import com.example.myapplication.util.UIConstantsUtils;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

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
            case ButtonUtils.toast_button:
                mView.showToast();
                break;

            case ButtonUtils.dialog_button:
                mView.showDialog();
                break;

            case ButtonUtils.new_activity_button:
                mView.showSettingScreen();
                break;

            default:
                mView.logError(UIConstantsUtils.ERROR_MESSAGE);
                break;
        }
    }
}
