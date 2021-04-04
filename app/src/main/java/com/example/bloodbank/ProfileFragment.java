package com.example.bloodbank;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;
import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class ProfileFragment extends Fragment {

    TextView qrvalue,nameTV,idTV;
    ImageView qrImage,settingIV;
    Bitmap qrBits;

    FrameLayout frameLayout;

    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


         qrImage = view.findViewById(R.id.qrPlaceHolder);
        qrvalue = view.findViewById(R.id.nameTV);
        String data = qrvalue.getText().toString();
        if(data.isEmpty()){
            qrvalue.setError("Value Required.");
        }else {
            QRGEncoder qrgEncoder = new QRGEncoder(data,null, QRGContents.Type.TEXT,500);
            qrBits = qrgEncoder.getBitmap();
            qrImage.setImageBitmap(qrBits);
        }

        frameLayout = view.findViewById(R.id.profileFramLayout);
        idTV = view.findViewById(R.id.idTV);


        settingIV = view.findViewById(R.id.settingIV);
        settingIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frameLayout.setVisibility(View.VISIBLE);
                qrvalue.setVisibility(View.INVISIBLE);
                idTV.setVisibility(View.INVISIBLE);
                qrImage.setVisibility(View.INVISIBLE);

                FragmentManager fragmentManager1 = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.profileFramLayout,new ProfileDetails());
                fragmentTransaction1.commit();

            }
        });


        return view;
    }

}