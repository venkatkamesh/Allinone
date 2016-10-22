package com.venkatkamesh.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuShow extends AppCompatActivity implements View.OnClickListener
{

    EditText num1;
    EditText num2;
    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    TextView outp;
    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_show);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        outp = (TextView) findViewById(R.id.outp);

        btnDiv.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        float numf = 0;
        float nums = 0;
        float result = 0;

        if (TextUtils.isEmpty(num1.getText().toString())
                || TextUtils.isEmpty(num2.getText().toString())) {
            return;
        }

        numf = Float.parseFloat(num1.getText().toString());
        nums = Float.parseFloat(num2.getText().toString());

        switch (view.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = numf + nums;
                break;
            case R.id.btnSub:
                oper = "-";
                result = numf - nums;
                break;
            case R.id.btnMult:
                oper = "*";
                result = numf * nums;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = numf / nums;
                break;
        }
        outp.setText( numf + " " + oper  + " " + nums + " = " + result);
    }
}
