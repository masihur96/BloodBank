package com.example.bloodbank.SignUpTask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bloodbank.R;


public class SignUpFour extends Fragment {

    public Button nextButonFour;
    public SignUpFour() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_four, container, false);

        nextButonFour = view.findViewById(R.id.nextsignUpFour);

        nextButonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new SignUpFive();

                FragmentTransaction ft = getFragmentManager().beginTransaction();

                ft.replace(R.id.signUpFramLayout, new SignUpFive());
                ft.addToBackStack(null);
                ft.commit();

            }
        });






   return view;
    }
}