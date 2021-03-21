package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;

import com.example.bloodbank.SignUpTask.LoginActivity;

public class WelcomeActivity extends AppCompatActivity {
    private Button startJournyButton;
    private ImageSwitcher imageSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        startJournyButton = findViewById(R.id.startJournyBttn);

        startJournyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(WelcomeActivity.this, SplashScreen.class));
            }
        });

    }
}