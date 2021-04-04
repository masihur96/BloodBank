package com.example.bloodbank.SignUpTask;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bloodbank.HomeActivity;
import com.example.bloodbank.MainActivity;
import com.example.bloodbank.R;


public class SignUpEight extends Fragment {

    public TextView nextButonEight;

    public SignUpEight() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_eight, container, false);
        nextButonEight = view.findViewById(R.id.nextsignUpEight);

        nextButonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(getContext(), HomeActivity.class));


            }
        });

        return view;
    }
}