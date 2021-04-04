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


public class SignUpSix extends Fragment {

    public Button nextButonSix;

    public SignUpSix() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_six, container, false);
        nextButonSix = view.findViewById(R.id.nextsignUpSix);

        nextButonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new SignUpSeven();

                FragmentTransaction ft = getFragmentManager().beginTransaction();

                ft.replace(R.id.signUpFramLayout, new SignUpSeven());
                ft.addToBackStack(null);
                ft.commit();

            }
        });



        return view;
    }
}