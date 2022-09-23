package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView)findViewById(R.id.tvMain);
    }

    public void onBtnChangeTextClick(View view) {
        tvMain.setText("Hi!");
    }

    public void onBtnChangeTextColorClick(View view) {
        tvMain.setTextColor(Color.BLUE);
    }
}