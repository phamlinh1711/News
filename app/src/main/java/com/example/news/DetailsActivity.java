package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().hide();

        final ImageButton imgBack = (ImageButton) findViewById(R.id.imgDetailsBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(DetailsActivity.this, HomePage.class);
                startActivity(intentback);
            }
        });

        final ImageButton imgShare = (ImageButton) findViewById(R.id.sharebtn);
        imgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentShare = new Intent(DetailsActivity.this, Share_Activity.class);
                startActivity(intentShare);
            }
        });
    }
}