package com.onkabetse.votesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.onkabetse.votesa.activities.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(()->{
            startActivity(new Intent(SplashScreen.this, LoginActivity.class));
            finish();
        },3000);
    }
}