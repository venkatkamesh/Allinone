package com.venkatkamesh.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class toast2 extends AppCompatActivity {

    Button bottomcenter;
    Button bottomleft;
    Button bottomright;
    Button topright;
    Button topleft;
    Button topcenter;
    Button center;
    Button centerleft;
    Button centerright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast2);
        bottomcenter = (Button)findViewById(R.id.bottomcenter);
        bottomleft = (Button)findViewById(R.id.bottomleft);
        bottomright = (Button)findViewById(R.id.bottomright);
        topright = (Button)findViewById(R.id.topright);
        topleft = (Button)findViewById(R.id.topleft);
        topcenter = (Button)findViewById(R.id.topcenter);
        center = (Button)findViewById(R.id.center);
        centerleft = (Button)findViewById(R.id.centerleft);
        centerright = (Button)findViewById(R.id.centerright);

        topleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Top Left",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,150);
                toast.show();
            }
        });


        topcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Top Center",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER,0,150);
                toast.show();
            }
        });


        topright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Top Right",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,150);
                toast.show();
            }
        });

        centerleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Center Left",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);
                toast.show();
            }
        });


        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Center center",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
                toast.show();
            }
        });


        centerright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Center Right",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.RIGHT,0,0);
                toast.show();
            }
        });


        bottomleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Bottom Left",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,0,0);
                toast.show();
            }
        });


        bottomright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Bottom Right",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
                toast.show();
            }
        });


        bottomcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Bottom center",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                toast.show();
            }
        });

    }
}
