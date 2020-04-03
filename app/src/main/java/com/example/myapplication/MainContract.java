package com.example.myapplication;

public interface MainContract {

    interface View {
        void showToast();
    }

    interface Presenter {
        void handleButtonClicked(int buttonId);
    }
}
