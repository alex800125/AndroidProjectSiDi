package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainPresenter = new MainPresenter();

        final Button btn1 = findViewById(R.id.first_button);
        final Button btn2 = findViewById(R.id.second_button);
        final Button btn3 = findViewById(R.id.third_button);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    public void onClick(View v) {
        mainPresenter.onClickView(v, this);
    }

    public static void showToast(Context context) {
        Toast.makeText(context, R.string.first_button_message, Toast.LENGTH_SHORT).show();
    }
}
