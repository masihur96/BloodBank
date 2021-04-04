package com.example.bloodbank;

import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class PostFragment extends Fragment {
    Spinner bloodGroupSpinnerPost,iAmSpinner;

    public PostFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post, container, false);

        bloodGroupSpinnerPost = view.findViewById(R.id.bloodGroupSpinnerId);

        bloodGroupSpinnerPost.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        final ArrayList<String> BloodGroupList =new ArrayList<>();

        BloodGroupList.add("A+");
        BloodGroupList.add("A-");
        BloodGroupList.add("B+");
        BloodGroupList.add("B-");
        BloodGroupList.add("O+");
        BloodGroupList.add("O-");
        BloodGroupList.add("AB+");
        BloodGroupList.add("AB-");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,BloodGroupList);
        bloodGroupSpinnerPost.setAdapter(adapter);
        bloodGroupSpinnerPost.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(), "You are Selected : "+BloodGroupList.get(position), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        iAmSpinner = view.findViewById(R.id.iAmSpinnerId);
        iAmSpinner.getBackground().setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
        final ArrayList<String> iAmList =new ArrayList<>();

        iAmList.add("Brother");
        iAmList.add("Sister");
        iAmList.add("Father");
        iAmList.add("Mother");
        iAmList.add("Daughter");
        iAmList.add("Uncle");
        iAmList.add("Ant");
        iAmList.add("Other");


        ArrayAdapter<String> adapterIam = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,BloodGroupList);
        iAmSpinner.setAdapter(adapterIam);
        iAmSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(), "You are Selected : "+iAmList.get(position), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }
}