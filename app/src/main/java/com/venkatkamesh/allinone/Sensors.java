package com.venkatkamesh.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sensors extends AppCompatActivity {
    Button bluetoo,sen1,compass1,shake1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors);
        bluetoo =(Button)findViewById(R.id.bluetoo);
        bluetoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.NewActivityBluetooth"));
            }
        });
        sen1 = (Button)findViewById(R.id.sen1);
        sen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.Sensorsc"));
            }
        });
        compass1 = (Button)findViewById(R.id.compass1);
        compass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.NewActivity_Compass"));
            }
        });
        shake1 = (Button)findViewById(R.id.shake1);
        shake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.NewShakeSensor"));
            }
        });
    }
}
