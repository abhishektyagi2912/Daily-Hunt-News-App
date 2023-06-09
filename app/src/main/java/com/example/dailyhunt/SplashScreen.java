package com.example.dailyhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.airbnb.lottie.LottieAnimationView;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        lottieAnimationView = findViewById(R.id.lottie);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this,MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}