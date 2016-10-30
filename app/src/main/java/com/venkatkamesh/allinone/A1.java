package com.venkatkamesh.allinone;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;



public class A1 extends AppCompatActivity {

    private TextView tvResult;

    public void getUserName(View view){
        Intent intent = new Intent(getBaseContext(),A2.class);
        startActivityForResult(intent,100);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if(requestCode == 100 && resultCode == RESULT_OK){
            tvResult.setText(intent.getStringExtra("username"));
            //Log.i("vinay","onActivityresul called "+ requestCode + " " + resultCode + " " + intent.getStringExtra("username"));

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }
}
