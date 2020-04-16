package com.example.myapplication.util;

import android.util.Log;

public class LogTag {
    public static void d(final String TAG, final String message) {
        Log.d(TAG, message);
    }

    public static void e(final String TAG, final String message) {
        Log.e(TAG, message);
    }

    public static void e(final String TAG, final String message, final Throwable t) {
        Log.e(TAG, message, t);
    }

    public static void e(final String TAG, final String message, final Exception e) {
        Log.e(TAG, message, e);
    }
}
