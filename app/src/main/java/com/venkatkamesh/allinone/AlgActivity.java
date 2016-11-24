package com.venkatkamesh.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AlgActivity extends AppCompatActivity {
    private EditText etAry;
    private RadioGroup radioGrp;
    private RadioButton radioButton;
    private TextView tvArySize;
    private int ArraySize;
    private int[] array;
    private int[] temp;
    private GridLayout GLY;
    private Button btnBS, btnSS, btnMS, btnIS, btnQS, btnHS, btnBM;

    public void Action(View view){
        radioGrp=(RadioGroup)findViewById(R.id.radioGrp);
        int selectedId = radioGrp.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selectedId);
        String str = (String) radioButton.getText();
        try{
            ArraySize = Integer.parseInt(etAry.getText().toString());
        }catch(NumberFormatException e){
            Toast.makeText(getBaseContext(), "Enter the Number!!!", Toast.LENGTH_SHORT).show();
        }

        if(ArraySize>0) {
            GLY.setVisibility(View.VISIBLE);
            switch (str) {
                case "BestCase":
                    array = new int[ArraySize];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = i + 1;
                    }
                    temp = array;
                    tvArySize.setText("Array Generated for Best Case is " + ArraySize);
                    break;
                case "AvgCase":
                    array = new int[ArraySize];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 1000);
                    }
                    temp = array;
                    tvArySize.setText("Array Generated for Average Case is " + ArraySize);
                    break;
                case "WorstCase":
                    array = new int[ArraySize];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = array.length - i;
                    }
                    temp = array;
                    tvArySize.setText("Array Generated for Worst Case is " + ArraySize);
                    break;

            }
        }else{
            Toast.makeText(getBaseContext(), "Enter Number More than Zero.", Toast.LENGTH_SHORT).show();
        }
    }

    public void sorting(View view){
        MySortAsyncTask mySortAsyncTask = new MySortAsyncTask(this, view.getId());
        mySortAsyncTask.execute(temp);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg);

        GLY=(GridLayout)findViewById(R.id.GLY);
        GLY.setVisibility(View.INVISIBLE);
        etAry=(EditText)findViewById(R.id.etAry);
        tvArySize=(TextView)findViewById(R.id.tvArySize);
        btnBS=(Button)findViewById(R.id.btnBS);
        btnSS=(Button)findViewById(R.id.btnSS);
        btnMS=(Button)findViewById(R.id.btnMS);
        btnIS=(Button)findViewById(R.id.btnIS);
        btnQS=(Button)findViewById(R.id.btnQS);
        btnHS=(Button)findViewById(R.id.btnHS);
        btnBM=(Button)findViewById(R.id.btnBM);
    }
}

