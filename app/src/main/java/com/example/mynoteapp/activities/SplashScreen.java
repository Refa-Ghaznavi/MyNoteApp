package com.example.mynoteapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.mynoteapp.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // statues bar will be gone
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        // start login activity after 1 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    // user not logged in start login activity
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
        },1000);
    }
}