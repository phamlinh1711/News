package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        final ImageButton imgRegisterBack = (ImageButton) findViewById(R.id.imgRegisterBack);
        imgRegisterBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegisterBack = new Intent(Register.this, LoginScreen.class);
                startActivity(intentRegisterBack);
            }
        });
    }
}