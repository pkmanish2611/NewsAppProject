package com.example.samachar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class wellcomescr extends AppCompatActivity {
    private static int SPlASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcomescr);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent userIntent;
                userIntent = new Intent(wellcomescr.this,lang.class);
                startActivity(userIntent);
                finish();

            }
        },SPlASH_TIME_OUT);
    }
}
