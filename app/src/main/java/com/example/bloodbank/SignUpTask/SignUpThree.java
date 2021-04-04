package com.example.bloodbank.SignUpTask;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bloodbank.R;


public class SignUpThree extends Fragment {

    public Button nextButonThree;
    private TextView A_Positive,A_Negative,B_Possitive,B_Negative,O_Possitive,O_Negative,AB_Possitive,AB_NEgative;
    public SignUpThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_three, container, false);
        nextButonThree = view.findViewById(R.id.nextsignUpThree);
        A_Positive= view.findViewById(R.id.A_possitive);
        A_Negative= view.findViewById(R.id.A_Negative);
        B_Possitive= view.findViewById(R.id.B_possitive);
        B_Negative= view.findViewById(R.id.B_Negative);
        O_Possitive= view.findViewById(R.id.O_possitive);
        O_Negative= view.findViewById(R.id.O_Negative);
        AB_Possitive= view.findViewById(R.id.AB_possitive);
        AB_NEgative= view.findViewById(R.id.AB_Negative);

        A_Positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.WHITE);
                A_Positive.setBackgroundResource(R.drawable.oval_shap);
                A_Negative.setTextColor(Color.RED);
                A_Negative.setBackgroundResource(R.drawable.group_button_border);

                B_Possitive.setTextColor(Color.RED);
                B_Possitive.setBackgroundResource(R.drawable.group_button_border);
                B_Negative.setTextColor(Color.RED);
                B_Negative.setBackgroundResource(R.drawable.group_button_border);

                AB_Possitive.setTextColor(Color.RED);
                AB_Possitive.setBackgroundResource(R.drawable.group_button_border);
                AB_NEgative.setTextColor(Color.RED);
                AB_NEgative.setBackgroundResource(R.drawable.group_button_border);

                O_Possitive.setTextColor(Color.RED);
                O_Possitive.setBackgroundResource(R.drawable.group_button_border);
                O_Negative.setTextColor(Color.RED);
                O_Negative.setBackgroundResource(R.drawable.group_button_border);
            }
        });
        A_Negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.RED);
                A_Positive.setBackgroundResource(R.drawable.group_button_border);
                A_Negative.setTextColor(Color.WHITE);
                A_Negative.setBackgroundResource(R.drawable.oval_shap);

                B_Possitive.setTextColor(Color.RED);
                B_Possitive.setBackgroundResource(R.drawable.group_button_border);
                B_Negative.setTextColor(Color.RED);
                B_Negative.setBackgroundResource(R.drawable.group_button_border);

                AB_Possitive.setTextColor(Color.RED);
                AB_Possitive.setBackgroundResource(R.drawable.group_button_border);
                AB_NEgative.setTextColor(Color.RED);
                AB_NEgative.setBackgroundResource(R.drawable.group_button_border);

                O_Possitive.setTextColor(Color.RED);
                O_Possitive.setBackgroundResource(R.drawable.group_button_border);
                O_Negative.setTextColor(Color.RED);
                O_Negative.setBackgroundResource(R.drawable.group_button_border);
            }
        });
        B_Possitive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.RED);
                A_Positive.setBackgroundResource(R.drawable.group_button_border);
                A_Negative.setTextColor(Color.RED);
                A_Negative.setBackgroundResource(R.drawable.group_button_border);

                B_Possitive.setTextColor(Color.WHITE);
                B_Possitive.setBackgroundResource(R.drawable.oval_shap);
                B_Negative.setTextColor(Color.RED);
                B_Negative.setBackgroundResource(R.drawable.group_button_border);

                AB_Possitive.setTextColor(Color.RED);
                AB_Possitive.setBackgroundResource(R.drawable.group_button_border);
                AB_NEgative.setTextColor(Color.RED);
                AB_NEgative.setBackgroundResource(R.drawable.group_button_border);

                O_Possitive.setTextColor(Color.RED);
                O_Possitive.setBackgroundResource(R.drawable.group_button_border);
                O_Negative.setTextColor(Color.RED);
                O_Negative.setBackgroundResource(R.drawable.group_button_border);
            }
        });
        B_Negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.RED);
                A_Positive.setBackgroundResource(R.drawable.group_button_border);
                A_Negative.setTextColor(Color.RED);
                A_Negative.setBackgroundResource(R.drawable.group_button_border);

                B_Possitive.setTextColor(Color.RED);
                B_Possitive.setBackgroundResource(R.drawable.group_button_border);
                B_Negative.setTextColor(Color.WHITE);
                B_Negative.setBackgroundResource(R.drawable.oval_shap);

                AB_Possitive.setTextColor(Color.RED);
                AB_Possitive.setBackgroundResource(R.drawable.group_button_border);
                AB_NEgative.setTextColor(Color.RED);
                AB_NEgative.setBackgroundResource(R.drawable.group_button_border);

                O_Possitive.setTextColor(Color.RED);
                O_Possitive.setBackgroundResource(R.drawable.group_button_border);
                O_Negative.setTextColor(Color.RED);
                O_Negative.setBackgroundResource(R.drawable.group_button_border);
            }
        });
        AB_Possitive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.RED);
                A_Positive.setBackgroundResource(R.drawable.group_button_border);
                A_Negative.setTextColor(Color.RED);
                A_Negative.setBackgroundResource(R.drawable.group_button_border);

                B_Possitive.setTextColor(Color.RED);
                B_Possitive.setBackgroundResource(R.drawable.group_button_border);
                B_Negative.setTextColor(Color.RED);
                B_Negative.setBackgroundResource(R.drawable.group_button_border);

                AB_Possitive.setTextColor(Color.WHITE);
                AB_Possitive.setBackgroundResource(R.drawable.oval_shap);
                AB_NEgative.setTextColor(Color.RED);
                AB_NEgative.setBackgroundResource(R.drawable.group_button_border);

                O_Possitive.setTextColor(Color.RED);
                O_Possitive.setBackgroundResource(R.drawable.group_button_border);
                O_Negative.setTextColor(Color.RED);
                O_Negative.setBackgroundResource(R.drawable.group_button_border);
            }
        });
        AB_NEgative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.RED);
                A_Positive.setBackgroundResource(R.drawable.group_button_border);
                A_Negative.setTextColor(Color.RED);
                A_Negative.setBackgroundResource(R.drawable.group_button_border);

                B_Possitive.setTextColor(Color.RED);
                B_Possitive.setBackgroundResource(R.drawable.group_button_border);
                B_Negative.setTextColor(Color.RED);
                B_Negative.setBackgroundResource(R.drawable.group_button_border);

                AB_Possitive.setTextColor(Color.RED);
                AB_Possitive.setBackgroundResource(R.drawable.group_button_border);
                AB_NEgative.setTextColor(Color.WHITE);
                AB_NEgative.setBackgroundResource(R.drawable.oval_shap);

                O_Possitive.setTextColor(Color.RED);
                O_Possitive.setBackgroundResource(R.drawable.group_button_border);
                O_Negative.setTextColor(Color.RED);
                O_Negative.setBackgroundResource(R.drawable.group_button_border);
            }
        });
        O_Possitive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.RED);
                A_Positive.setBackgroundResource(R.drawable.group_button_border);
                A_Negative.setTextColor(Color.RED);
                A_Negative.setBackgroundResource(R.drawable.group_button_border);

                B_Possitive.setTextColor(Color.RED);
                B_Possitive.setBackgroundResource(R.drawable.group_button_border);
                B_Negative.setTextColor(Color.RED);
                B_Negative.setBackgroundResource(R.drawable.group_button_border);

                AB_Possitive.setTextColor(Color.RED);
                AB_Possitive.setBackgroundResource(R.drawable.group_button_border);
                AB_NEgative.setTextColor(Color.RED);
                AB_NEgative.setBackgroundResource(R.drawable.group_button_border);

                O_Possitive.setTextColor(Color.WHITE);
                O_Possitive.setBackgroundResource(R.drawable.oval_shap);
                O_Negative.setTextColor(Color.RED);
                O_Negative.setBackgroundResource(R.drawable.group_button_border);
            }
        });
        O_Negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Positive.setTextColor(Color.RED);
                A_Positive.setBackgroundResource(R.drawable.group_button_border);
                A_Negative.setTextColor(Color.RED);
                A_Negative.setBackgroundResource(R.drawable.group_button_border);

                B_Possitive.setTextColor(Color.RED);
                B_Possitive.setBackgroundResource(R.drawable.group_button_border);
                B_Negative.setTextColor(Color.RED);
                B_Negative.setBackgroundResource(R.drawable.group_button_border);

                AB_Possitive.setTextColor(Color.RED);
                AB_Possitive.setBackgroundResource(R.drawable.group_button_border);
                AB_NEgative.setTextColor(Color.RED);
                AB_NEgative.setBackgroundResource(R.drawable.group_button_border);

                O_Possitive.setTextColor(Color.RED);
                O_Possitive.setBackgroundResource(R.drawable.group_button_border);
                O_Negative.setTextColor(Color.WHITE);
                O_Negative.setBackgroundResource(R.drawable.oval_shap);
            }
        });
        nextButonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new SignUpFour();

                FragmentTransaction ft = getFragmentManager().beginTransaction();

                ft.replace(R.id.signUpFramLayout, new SignUpFour());
                ft.addToBackStack(null);
                ft.commit();

            }
        });



        return view;
    }
}