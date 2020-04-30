package com.example.myapplication.util;

public class ButtonUtils {

    /**
     * Invalid button.
     */
    private static final int INVALID_BUTTON_ID = 0;

    /**
     * First button, reference to Toast button.
     */
    private static final int TOAST_BUTTON_ID = 1;

    /**
     * Second button, reference to Dialog button.
     */
    private static final int DIALOG_BUTTON_ID = 2;

    /**
     * Third button, reference to New Activity button.
     */
    private static final int NEW_ACTIVITY_BUTTON_ID = 3;

    public enum MainActivityButton {
        INVALID_BUTTON(INVALID_BUTTON_ID),
        TOAST_BUTTON(TOAST_BUTTON_ID),
        DIALOG_BUTTON(DIALOG_BUTTON_ID),
        NEW_ACTIVITY_BUTTON(NEW_ACTIVITY_BUTTON_ID);
        private final int mButtonId;

        MainActivityButton(final int id) {
            mButtonId = id;
        }

        /**
         * @param buttonId This param represent the current ID of the button has been tapped.
         * @return The result of the comparison, in case of finding a result, return the correct ID
         * and, in case of not finding, the result is INVALID_BUTTON
         */
        public static MainActivityButton compareId(final int buttonId) {
            MainActivityButton returnValue = INVALID_BUTTON;

            for (final MainActivityButton mainActivityButton : MainActivityButton.values()) {
                if (mainActivityButton.mButtonId == buttonId) {
                    returnValue = mainActivityButton;
                }
            }

            return returnValue;
        }
    }
}
