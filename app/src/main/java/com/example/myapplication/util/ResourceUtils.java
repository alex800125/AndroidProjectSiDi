package com.example.myapplication.util;

import android.content.res.Resources;
import android.util.Log;

public final class ResourceUtils {

    private static final String TAG = "ResouceUtils";

    private static final String EMPTY_VALUE = "";

    /**
     * @param resources Reference to Android resources.
     * @param integerId The ID of the desired string (integer ID).
     * @return String value or empty string if integerId does not exist.
     */
    public static String getString(final Resources resources, final int integerId) {
        String result = EMPTY_VALUE;

        if (resources != null) {
            try {
                result = resources.getString(integerId);
            } catch (final Resources.NotFoundException nfe) {
                Log.e(TAG, "Error, this String not exists");
            }
        } else {
            Log.e(TAG, "Error, the resource can not be null");
        }

        return result;
    }
}
