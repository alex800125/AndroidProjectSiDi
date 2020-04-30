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
     * @param buttonId This param represent the current ID of the button has been tapped.
     */
    public void handleButtonClicked(final int buttonId) {
        final ButtonUtils.MainActivityButton mainActivityButton = ButtonUtils.MainActivityButton.compareId(buttonId);

        switch (mainActivityButton) {
            case TOAST_BUTTON:
                mView.showToast();
                break;

            case DIALOG_BUTTON:
                mView.showDialog();
                break;

            case NEW_ACTIVITY_BUTTON:
                mView.showSettingScreen();
                break;

            case INVALID_BUTTON:
            default:
                mView.logError(UIConstantsUtils.ERROR_MESSAGE);
                break;
        }
    }
}
