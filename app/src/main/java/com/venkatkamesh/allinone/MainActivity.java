package com.venkatkamesh.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonok;
    Button greeting;
    Button buttoncalculator;
    Button menuactivity, sms_ok, animation_ok;
    Button music;
    String tag = "LifeCycleEvents";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonok = (Button)findViewById(R.id.buttonok);
        buttonok.setOnClickListener(this);
        greeting = (Button)findViewById(R.id.greeting);
        greeting.setOnClickListener(this);
        buttoncalculator = (Button)findViewById(R.id.buttoncalculator);
        buttoncalculator.setOnClickListener(this);
        music =(Button)findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.MusicPlayer"));
            }
        });
        animation_ok =(Button)findViewById(R.id.animation_ok);
        animation_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.RotateImage"));
            }
        });
        sms_ok =(Button)findViewById(R.id.sms_ok);
        sms_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.Sms"));
            }
        });
        menuactivity =(Button)findViewById(R.id.menuactivity);
        menuactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.mainmenuok"));
            }
        });
        Log.d(tag, "In the onCreate() event");
    }
    public void onStart()
    {
        Toast.makeText(getApplicationContext(),"start", Toast.LENGTH_LONG).show();
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }
    public void onRestart()
    {
        Toast.makeText(getApplicationContext(),"Restart",Toast.LENGTH_LONG).show();
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }
    public void onResume()
    {
        Toast.makeText(getApplicationContext(),"Resume",Toast.LENGTH_LONG).show();
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }
    public void onPause()
    {
        Toast.makeText(getApplicationContext(),"pause",Toast.LENGTH_LONG).show();
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }
    public void onStop()
    {
        Toast.makeText(getApplicationContext(),"stop",Toast.LENGTH_LONG).show();
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy()
    {
        Toast.makeText(getApplicationContext(),"Destroy",Toast.LENGTH_LONG).show();
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }
    private void buttonclick()
    {
        startActivity(new Intent("com.venkatkamesh.allinone.toast2") );
    }
    private void buttongreeting(){
        startActivity(new Intent("com.venkatkamesh.allinone.Greeting"));
    }
    private void buttoncalculator(){
        startActivity(new Intent("com.venkatkamesh.allinone.MenuShow"));
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonok:
                buttonclick();
                break;
            case R.id.greeting:
                buttongreeting();
                break;
            case R.id.buttoncalculator:
                buttoncalculator();
                break;
        }
    }
}
