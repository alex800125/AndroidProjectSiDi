package com.example.myapplication;

import android.util.Log;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    private static String TAG = "MainPresenter";

    MainPresenter(MainContract.View view) {
        Log.d(TAG, "Setting the view");
        this.view = view;
    }

    public void handleButtonClicked(int buttonId) {
        Log.d(TAG, "Enter in the handleButtonClicked function");
        switch (buttonId) {
            case Buttons.toast_button:
                view.showToast();
                break;

            case Buttons.dialog_button:
                Log.d(TAG, "Dialog button");
                break;

            case Buttons.new_activity_button:
                Log.d(TAG, "Missing the start new Activity and receive the result when it reaches the end;");
                // https://developer.android.com/training/basics/intents/result
                break;

            default:
                Log.e(TAG, "No recognized button");
                break;
        }
    }
}
