package com.example.bloodbank.SignUpTask;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.bloodbank.R;

public class SignUpSeven extends Fragment {

    public Button nextButonSeven;

    String[] data = {"January","February","March","April","May","June","July","August","September","Octobor","November","December"};

    com.shawnlin.numberpicker.NumberPicker monthPicker,agePicker,datePicker;


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

        monthPicker = (com.shawnlin.numberpicker.NumberPicker) view.findViewById(R.id.month_picker);
        monthPicker.setDividerColor(Color.TRANSPARENT);
        monthPicker.setMinValue(1);
        monthPicker.setMaxValue(data.length);
        monthPicker.setDisplayedValues(data);
        monthPicker.setValue(7);

        datePicker = (com.shawnlin.numberpicker.NumberPicker) view.findViewById(R.id.date_picker);
        datePicker.setDividerColor(Color.TRANSPARENT);
        agePicker = (com.shawnlin.numberpicker.NumberPicker) view.findViewById(R.id.age_picker);
        agePicker.setDividerColor(Color.TRANSPARENT);

        return view;
    }
}