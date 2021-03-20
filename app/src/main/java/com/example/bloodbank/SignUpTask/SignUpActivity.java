package com.example.bloodbank.SignUpTask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.bloodbank.R;

public class SignUpActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.signUpFramLayout, new SignUpOne());
        ft.commit();


    }
}