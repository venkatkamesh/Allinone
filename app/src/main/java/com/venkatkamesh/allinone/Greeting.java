package com.venkatkamesh.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Greeting extends AppCompatActivity {

    private EditText firstname;
    private EditText lastname;
    private TextView resultok;

    public void yupdone(View view) {
        String First_Name = firstname.getText().toString();
        String Second_name = lastname.getText().toString();
        resultok.setText("Greetings" + " " + First_Name + " " + Second_name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
            firstname=(EditText) findViewById(R.id.firstname);
            lastname=(EditText) findViewById(R.id.lastname);
            resultok=(TextView) findViewById(R.id.resultok);
    }
}
