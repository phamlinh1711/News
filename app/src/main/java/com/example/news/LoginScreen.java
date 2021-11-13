package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        getSupportActionBar().hide();

        final TextView txtRegister = (TextView) findViewById(R.id.gotoRegister);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, Register.class);
                startActivity(intent);
            }
        });

        final Button btnSignIn = (Button) findViewById(R.id.btnLogin);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHomePgae = new Intent(LoginScreen.this, HomePage.class);
                startActivity(intentHomePgae);
            }
        });

        final TextView txtForgot = (TextView) findViewById(R.id.forgotPasswword);
        txtForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentForgot = new Intent(LoginScreen.this, ForgetPassword.class);
                startActivity(intentForgot);
            }
        });
    }
}