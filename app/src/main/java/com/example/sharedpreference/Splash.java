package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (new User(Splash.this).getName() != "") {

                    startActivity(new Intent(Splash.this, Welcome.class));
                    finish();
                }
                else {
                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }
            }
        },2000);
    }
}