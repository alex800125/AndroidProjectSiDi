package com.example.myapplication;

public interface MainContract {

    interface View {
        void showToast();

        void showDialog();

        void showSettingScreen();

        void logError(String text);
    }

    interface Presenter {
        void handleButtonClicked(int buttonId);
    }
}
