package com.example.bloodbank;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class ProfileDetails extends Fragment {

    TextView budgesTV,donationTV,requestTV,infoTV,contactTV;
    CardView badgesCV,donationCV,infoCV;


    public ProfileDetails() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_details, container, false);


        budgesTV = view.findViewById(R.id.badgesTV);
        donationTV = view.findViewById(R.id.donationTV);
        requestTV = view.findViewById(R.id.requestTV);
        infoTV = view.findViewById(R.id.infoTV);
        contactTV = view.findViewById(R.id.contactTV);

        badgesCV = view.findViewById(R.id.badgesCV);
        donationCV = view.findViewById(R.id.donationRequestCV);
        infoCV = view.findViewById(R.id.infoContactCV);


        badgesCV.setVisibility(View.VISIBLE);
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        fragmentTransaction1.replace(R.id.badgetFramLayout,new BadgesFragment());
        fragmentTransaction1.commit();
        Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();


        budgesTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badgesCV.setVisibility(View.VISIBLE);
                donationCV.setVisibility(View.GONE);
                infoCV.setVisibility(View.GONE);
                budgesTV.setGravity(Gravity.CENTER);
                TransitionManager.beginDelayedTransition(badgesCV,new AutoTransition());

                FragmentManager fragmentManager = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                fragmentTransaction1.replace(R.id.badgetFramLayout,new BadgesFragment());
                fragmentTransaction1.commit();

            }
        });

        donationTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                donationCV.setVisibility(View.VISIBLE);
                badgesCV.setVisibility(View.GONE);
                infoCV.setVisibility(View.GONE);

                TransitionManager.beginDelayedTransition(donationCV,new AutoTransition());
                FragmentManager fragmentManager = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                fragmentTransaction1.replace(R.id.donationRequestFramLayout,new DonationFragment());
                fragmentTransaction1.commit();
            }
        });


        requestTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                donationCV.setVisibility(View.VISIBLE);
                badgesCV.setVisibility(View.GONE);
                infoCV.setVisibility(View.GONE);
                FragmentManager fragmentManager = getChildFragmentManager();
                TransitionManager.beginDelayedTransition(donationCV,new AutoTransition());
                FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                fragmentTransaction1.replace(R.id.donationRequestFramLayout,new RequestFragment());
                fragmentTransaction1.commit();

            }
        });


        infoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donationCV.setVisibility(View.GONE);
                badgesCV.setVisibility(View.GONE);
                infoCV.setVisibility(View.VISIBLE);
                TransitionManager.beginDelayedTransition(infoCV,new AutoTransition());

                FragmentManager fragmentManager = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                fragmentTransaction1.replace(R.id.infoContactFramLayout,new InfoFragment());
                fragmentTransaction1.commit();

            }
        });
        contactTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donationCV.setVisibility(View.GONE);
                badgesCV.setVisibility(View.GONE);
                infoCV.setVisibility(View.VISIBLE);
                TransitionManager.beginDelayedTransition(infoCV,new AutoTransition());

                FragmentManager fragmentManager = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                fragmentTransaction1.replace(R.id.infoContactFramLayout,new ContactFragment());
                fragmentTransaction1.commit();
             
            }
        });
        return view;
    }
}