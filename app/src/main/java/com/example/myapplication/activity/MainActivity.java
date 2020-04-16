package com.example.myapplication.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.myapplication.MainContract;
import com.example.myapplication.R;
import com.example.myapplication.presenter.MainPresenter;
import com.example.myapplication.util.LogTag;
import com.example.myapplication.util.ResourceUtils;

import com.example.myapplication.dialog.DialogFactory;

public class MainActivity extends AppCompatActivity implements MainContract.View, View.OnClickListener {

    private MainContract.Presenter mPresenter;

    private static final String TAG = "MainActivity";

    /**
     * Default number to request of third button
     */
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mPresenter = new MainPresenter(this);

        Button btn1 = findViewById(R.id.first_button);
        Button btn2 = findViewById(R.id.second_button);
        Button btn3 = findViewById(R.id.third_button);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    public void onClick(View view) {
        mPresenter.handleButtonClicked(view.getId());
    }

    /**
     * This function is responsible for the First Button Actions, called by the MainPresenter.
     */
    public void showToast() {
        Toast.makeText(this,
                ResourceUtils.getString(getResources(), R.string.message_first_button),
                Toast.LENGTH_LONG).show();
    }

    /**
     * This function is responsible for the Second Button Actions, called by the MainPresenter.
     */
    public void showDialog() {
        final AlertDialog alertDialog = DialogFactory.CustomDialog(this,
                ResourceUtils.getString(getResources(), R.string.title_second_button_dialog),
                ResourceUtils.getString(getResources(), R.string.message_second_button));
        alertDialog.show();
    }

    /**
     * This function is responsible for the Third Button Actions, called by the MainPresenter.
     */
    public void showSettingScreen() {
        Intent intent = new Intent(getApplicationContext(), SettingScreenActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    /**
     * This function is called when an error occurs in this class or in the MainPresenter.
     *
     * @param text The text contains the text that will be shown in the log.
     */
    public void logError(String text) {
        LogTag.e(TAG, text);
    }

    /**
     *
     * @param requestCode Contains the REQUEST_CODE, to differentiate from other results
     * @param resultCode Contains the result of the activity
     * @param data Contains the Intent original
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (RESULT_OK == resultCode) {
                Toast.makeText(this,
                        ResourceUtils.getString(getResources(), R.string.message_third_button),
                        Toast.LENGTH_LONG).show();
            }
        } else {
            logError("Error, there is only one REQUEST_CODE. This wrong value is = " + requestCode);
        }
    }
}
