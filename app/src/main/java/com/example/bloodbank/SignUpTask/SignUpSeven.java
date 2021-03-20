package com.example.bloodbank.SignUpTask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bloodbank.R;

public class SignUpSeven extends Fragment {

    public Button nextButonSeven;


    public SignUpSeven() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_seven, container, false);

        nextButonSeven = view.findViewById(R.id.nextsignUpSeven);

        nextButonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new SignUpEight();

                FragmentTransaction ft = getFragmentManager().beginTransaction();

                ft.replace(R.id.signUpFramLayout, new SignUpEight());
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        return view;
    }
}