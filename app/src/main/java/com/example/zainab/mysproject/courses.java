package com.example.zainab.mysproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.USER_NAME);

        TextView textView = (TextView) findViewById(R.id.textView3);

        textView.setText("Welcome "+username);
    }
}
