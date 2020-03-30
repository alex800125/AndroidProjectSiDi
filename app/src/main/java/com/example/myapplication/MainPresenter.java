package com.example.myapplication;

import android.content.Context;
import android.view.View;

public class MainPresenter extends MainActivity {

    public void onClickView(View view, Context context) {

        switch (view.getId()) {
            case R.id.first_button:
                firstButtonAction(context);
                break;

            case R.id.second_button:
                secondButtonAction(context);
                break;

            case R.id.third_button:
                thirdButtonAction();
                break;
        }
    }

    public void firstButtonAction(Context context) {
        MainActivity.showToast(context);
    }

    public void secondButtonAction(Context context) {
        new Dialog(context);
    }

    public void thirdButtonAction() {
        // Missing the start new Activity and receive the result when it reaches the end;
        // https://developer.android.com/training/basics/intents/result
    }
}
