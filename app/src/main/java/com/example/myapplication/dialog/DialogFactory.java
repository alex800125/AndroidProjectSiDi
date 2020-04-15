package com.example.myapplication.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.example.myapplication.R;
import com.example.myapplication.util.ResourceUtils;

public class DialogFactory {

    /**
     * @param context reference to Android context.
     * @return The result is a AlertDialog created, with the values shown fixed.
     */
    public static AlertDialog Dialog(final Context context) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(ResourceUtils.getString(context.getResources(), R.string.title_second_button_dialog));

        alertDialogBuilder
                .setMessage(ResourceUtils.getString(context.getResources(), R.string.message_second_button))
                .setCancelable(false)
                .setPositiveButton(ResourceUtils.getString(context.getResources(), R.string.info_yes), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // This command just closes the Dialog
                        dialog.cancel();
                    }
                })
                .setNegativeButton(ResourceUtils.getString(context.getResources(), R.string.info_no), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // This command just closes the Dialog
                        dialog.cancel();
                    }
                });

        return alertDialogBuilder.create();
    }
}
