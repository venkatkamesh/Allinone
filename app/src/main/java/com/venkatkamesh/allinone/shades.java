package com.venkatkamesh.allinone;

import android.graphics.ColorMatrixColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class shades extends AppCompatActivity {

    ImageView shadeok;
    ImageButton shadebtn, shadebtn1, shadebtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shades);
        shadeok =(ImageView)findViewById(R.id.shadeok);
        shadebtn =(ImageButton)findViewById(R.id.shadebtn);
        shadebtn.setColorFilter(new ColorMatrixColorFilter(NEGATIVE));
        shadebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shadeok.setColorFilter(new ColorMatrixColorFilter(NEGATIVE));
            }
        });
        shadebtn1 =(ImageButton)findViewById(R.id.shadebtn1);
        shadebtn1.setColorFilter(new ColorMatrixColorFilter(BLACKWHITE));
        shadebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shadeok.setColorFilter(new ColorMatrixColorFilter(BLACKWHITE));
            }
        });
        shadebtn2 =(ImageButton)findViewById(R.id.shadebtn2);
        shadebtn2.setColorFilter(new ColorMatrixColorFilter(GREYSCALE));
        shadebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shadeok.setColorFilter(new ColorMatrixColorFilter(GREYSCALE));
            }
        });

    }
    private static final float[] NEGATIVE ={
            -1.0f,     0,     0,    0, 255, // red
            0, -1.0f,     0,    0, 255, // green
            0,     0, -1.0f,    0, 255, // blue
            0,     0,     0, 1.0f,   0  // alpha
    };
    private static final float[] BLACKWHITE ={
            0, 0, 0, 0, 255,
            0, 0, 0, 0, 255,
            0, 0, 0, 0, 255,
            1, 1, 1, -1, 0,
    };
    private static final float[] GREYSCALE ={
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 1, 0, 0,
            0, 0, 0, 1, 0
    };
}
