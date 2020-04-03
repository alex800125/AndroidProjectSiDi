package com.example.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements MainContract.View, View.OnClickListener {

    private MainContract.Presenter presenter;

    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        presenter = new MainPresenter(this);

        Button btn1 = findViewById(R.id.first_button);
        Button btn2 = findViewById(R.id.second_button);
        Button btn3 = findViewById(R.id.third_button);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    public void onClick(View v) {
        presenter.handleButtonClicked(v.getId());
    }

    public void showToast() {
        Toast.makeText(this, R.string.first_button_message, Toast.LENGTH_LONG).show();
    }

    public void showDialog() {
        final AlertDialog alertDialog = new DialogFactory().Dialog(this);
        alertDialog.show();
    }

    public void logError(String text) {
        Log.e(TAG, text);
    }
}
