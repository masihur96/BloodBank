package com.example.bloodbank.SignUpTask;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bloodbank.HomeActivity;
import com.example.bloodbank.MainActivity;
import com.example.bloodbank.R;

import static android.app.Activity.RESULT_OK;


public class SignUpEight extends Fragment {


    public Button nextButonEight;

    public ImageView uploadIV;
    public Uri uri;

    public SignUpEight() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_eight, container, false);
        nextButonEight = view.findViewById(R.id.nextsignUpEight);

        nextButonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(getContext(), HomeActivity.class));


            }
        });

        uploadIV = view.findViewById(R.id.uploadPhoto);

        uploadIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*" );
                startActivityForResult(intent,0);
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){

            if (requestCode== 0){

                uri  =data.getData();
                uploadIV.setImageURI(uri);


            }else {
                uri = data.getData();
                uploadIV.setImageURI(uri);
            }

        }
    }
    
}