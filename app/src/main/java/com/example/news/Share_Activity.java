package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Share_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        getSupportActionBar().hide();
    }
}