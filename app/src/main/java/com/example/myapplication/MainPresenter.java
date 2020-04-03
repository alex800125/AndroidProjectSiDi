package com.example.myapplication;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    MainPresenter(MainContract.View view) {
        this.view = view;
    }

    public void handleButtonClicked(int buttonId) {
        switch (buttonId) {
            case Buttons.toast_button:
                view.showToast();
                break;

            case Buttons.dialog_button:
                view.showDialog();
                break;

            case Buttons.new_activity_button:
                // Missing the start new Activity and receive the result when it reaches the end
                // https://developer.android.com/training/basics/intents/result
                break;

            default:
                view.logError("No recognized button");
                break;
        }
    }
}
