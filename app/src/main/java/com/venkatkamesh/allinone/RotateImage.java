package com.venkatkamesh.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class RotateImage extends AppCompatActivity {
    ImageView rotate_fuck;
    Button abtn1, abtn2, abtn3, abtn4, abtn5, abtn6, abtn7, abtn8, abtn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_image);
        abtn1 =(Button)findViewById(R.id.abtn1);
        abtn2 =(Button)findViewById(R.id.abtn2);
        abtn3 =(Button)findViewById(R.id.abtn3);
        abtn4 =(Button)findViewById(R.id.abtn4);
        abtn5 =(Button)findViewById(R.id.abtn5);
        abtn6 =(Button)findViewById(R.id.abtn6);
        abtn7 =(Button)findViewById(R.id.abtn7);
        abtn8 =(Button)findViewById(R.id.abtn8);
        abtn9 =(Button)findViewById(R.id.abtn9);
        rotate_fuck = (ImageView)findViewById(R.id.rotate_fuck);
        abtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_ok );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });

        abtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });

        abtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.flip );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });


        abtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.grow_from_bottom );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });


        abtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });
        abtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });
        abtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });
        abtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });
        abtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in );
                rotate_fuck.startAnimation(startRotateAnimation);
            }
        });
    }
}
