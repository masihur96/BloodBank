package com.example.bloodbank;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeFragment extends Fragment {

    SliderView sliderView;
    private SliderAdapter adapter;


    CircleImageView postIV,bookIV,donarsIV;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);




         sliderView = view . findViewById(R.id.imageSlider);
         adapter = new SliderAdapter(getContext());
         sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        postIV = view.findViewById(R.id.postRequestCIV);
        postIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FrameLayout frameLayout = view.findViewById(R.id.homeFrameLayout);
                frameLayout.setVisibility(View.VISIBLE);
                LinearLayout campainLayout = view.findViewById(R.id.campainLayout);
                campainLayout.setVisibility(View.INVISIBLE);
                CardView sliderCardView = view.findViewById(R.id.sliderCV);
                sliderCardView.setVisibility(View.INVISIBLE);
                TextView menuTV = view.findViewById(R.id.menuTV);
                menuTV.setVisibility(View.INVISIBLE);
                LinearLayout menuLayout = view.findViewById(R.id.menuItemLayout);
                menuLayout.setVisibility(View.INVISIBLE);
                TextView requestTV = view.findViewById(R.id.requestTV);
                requestTV.setVisibility(View.INVISIBLE);
                LinearLayout requestLayout = view.findViewById(R.id.requestLayout);
                requestLayout.setVisibility(View.INVISIBLE);
                TextView statisticTV = view.findViewById(R.id.statisticTV);
                statisticTV.setVisibility(View.INVISIBLE);
                TextView statisticNewTV = view.findViewById(R.id.statisticNewTV);
                statisticNewTV.setVisibility(View.INVISIBLE);
                ImageView statisticIV = view.findViewById(R.id.statisticIV);
                statisticIV.setVisibility(View.INVISIBLE);
                FragmentManager fragmentManager1 = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.homeFrameLayout,new PostFragment());
                fragmentTransaction1.commit();
            }
        });

        bookIV = view.findViewById(R.id.bookCIV);
        bookIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrameLayout frameLayout = view.findViewById(R.id.homeFrameLayout);
                frameLayout.setVisibility(View.VISIBLE);
                LinearLayout campainLayout = view.findViewById(R.id.campainLayout);
                campainLayout.setVisibility(View.INVISIBLE);
                CardView sliderCardView = view.findViewById(R.id.sliderCV);
                sliderCardView.setVisibility(View.INVISIBLE);
                TextView menuTV = view.findViewById(R.id.menuTV);
                menuTV.setVisibility(View.INVISIBLE);
                LinearLayout menuLayout = view.findViewById(R.id.menuItemLayout);
                menuLayout.setVisibility(View.INVISIBLE);
                TextView requestTV = view.findViewById(R.id.requestTV);
                requestTV.setVisibility(View.INVISIBLE);
                LinearLayout requestLayout = view.findViewById(R.id.requestLayout);
                requestLayout.setVisibility(View.INVISIBLE);
                TextView statisticTV = view.findViewById(R.id.statisticTV);
                statisticTV.setVisibility(View.INVISIBLE);
                TextView statisticNewTV = view.findViewById(R.id.statisticNewTV);
                statisticNewTV.setVisibility(View.INVISIBLE);
                ImageView statisticIV = view.findViewById(R.id.statisticIV);
                statisticIV.setVisibility(View.INVISIBLE);
                FragmentManager fragmentManager1 = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.homeFrameLayout,new MapFragment());
                fragmentTransaction1.commit();
            }
        });

        donarsIV = view.findViewById(R.id.donorsCIV);
        donarsIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrameLayout frameLayout = view.findViewById(R.id.homeFrameLayout);
                frameLayout.setVisibility(View.VISIBLE);
                LinearLayout campainLayout = view.findViewById(R.id.campainLayout);
                campainLayout.setVisibility(View.INVISIBLE);
                CardView sliderCardView = view.findViewById(R.id.sliderCV);
                sliderCardView.setVisibility(View.INVISIBLE);
                TextView menuTV = view.findViewById(R.id.menuTV);
                menuTV.setVisibility(View.INVISIBLE);
                LinearLayout menuLayout = view.findViewById(R.id.menuItemLayout);
                menuLayout.setVisibility(View.INVISIBLE);
                TextView requestTV = view.findViewById(R.id.requestTV);
                requestTV.setVisibility(View.INVISIBLE);
                LinearLayout requestLayout = view.findViewById(R.id.requestLayout);
                requestLayout.setVisibility(View.INVISIBLE);
                TextView statisticTV = view.findViewById(R.id.statisticTV);
                statisticTV.setVisibility(View.INVISIBLE);
                TextView statisticNewTV = view.findViewById(R.id.statisticNewTV);
                statisticNewTV.setVisibility(View.INVISIBLE);
                ImageView statisticIV = view.findViewById(R.id.statisticIV);
                statisticIV.setVisibility(View.INVISIBLE);
                FragmentManager fragmentManager1 = getChildFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.homeFrameLayout,new MapFragment());
                fragmentTransaction1.commit();

            }
        });

        List<SliderItem> sliderItemList = new ArrayList<>();
        //dummy data
        for (int i = 0; i < 5; i++) {
            SliderItem sliderItem = new SliderItem();
            sliderItem.setDescription("Slider Item " + i);
            if (i % 2 != 0) {
            //    sliderItem.toString();
                sliderItem.setImageUrl("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
            } else {
                sliderItem.setImageUrl("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
            }
            sliderItemList.add(sliderItem);
        }
        adapter.renewItems(sliderItemList);

        return view;
    }

}