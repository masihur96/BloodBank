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


public class SignUpOne extends Fragment {

    public Button nextButonOne;
    public SignUpOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up_one, container, false);

        nextButonOne = view.findViewById(R.id.nextsignUpOne);

        nextButonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new SignUpTwo();

              FragmentTransaction ft = getFragmentManager().beginTransaction();

                ft.replace(R.id.signUpFramLayout, new SignUpTwo());
                ft.addToBackStack(null);
                ft.commit();

            }
        });



        return view;
    }
}