package com.example.bloodbank.SignUpTask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bloodbank.R;


public class SignUpTwo extends Fragment {
    public Button nextButonTwo;
    public SignUpTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_sign_up_two, container, false);

        nextButonTwo = view.findViewById(R.id.nextsignUpTwo);

        nextButonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new SignUpThree();

                FragmentTransaction ft = getFragmentManager().beginTransaction();

                ft.replace(R.id.signUpFramLayout, new SignUpThree());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


        return view;
    }
}