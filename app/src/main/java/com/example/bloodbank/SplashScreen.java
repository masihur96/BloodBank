package com.example.bloodbank;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.bloodbank.SignUpTask.SignUpActivity;

public class SplashScreen extends AppCompatActivity {


    private ImageSwitcher imageSwitcher;
    public TextSwitcher textSwitcher, boldTextSwitcher;
    private TextView nextButton,startButton;
    private CardView cardView;

    String[] splashBoldText = {"Save Life",};

    String[] splashText = {
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diem nonumy eirmod tempor invidunt ut labore at dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et",};


    int[] splashImage = {
          R.drawable.splash_screen_two,
    };
    int position = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        cardView = findViewById(R.id.mainCardView);
        cardView.setCardBackgroundColor(getResources().getColor(R.color.red));
        boldTextSwitcher = findViewById(R.id.splash_bold_text);
        textSwitcher = findViewById(R.id.textSwitcher);

        imageSwitcher = findViewById(R.id.imageSwitcher);

        nextButton = findViewById(R.id.nextButtonId);
        startButton = findViewById(R.id.startButtonId);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(SplashScreen.this);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                imageSwitcher.setBackgroundResource(R.drawable.splash_screen_one);
                return imageView;
            }
        });

        boldTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @SuppressLint({"ResourceAsColor"})
            @Override
            public View makeView() {
                TextView textView = new TextView(SplashScreen.this);
                textView.setTextSize(30);
                textView.setTextColor(getResources().getColor(R.color.white));
                textView.setText("Donat Blood");
                textView.setGravity(Gravity.LEFT);
                return textView;
            }
        });

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @SuppressLint("ResourceAsColor")
            @Override
            public View makeView() {
                TextView textView = new TextView(SplashScreen.this);
                textView.setTextSize(20);
                textView.setTextColor(getResources().getColor(R.color.white));
                textView.setGravity(Gravity.LEFT);
                textView.setText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sect diem nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sect diam voluptua. At vero eos et accusam et");
                return textView;
            }
        });




        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nextButton.setVisibility(View.GONE);
                startButton.setVisibility(View.VISIBLE);
                cardView.setCardBackgroundColor(getResources().getColor(R.color.purple_500));

                if((position<splashImage.length-1)&& (position<splashText.length-1)){

                    position = position+1;
                    imageSwitcher.setBackgroundResource(splashImage[position]);
                    textSwitcher.setText(splashText[position]);
                    boldTextSwitcher.setText(splashBoldText[position]);

                }
            }
        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SplashScreen.this, SignUpActivity.class));

            }
        });


    }
}