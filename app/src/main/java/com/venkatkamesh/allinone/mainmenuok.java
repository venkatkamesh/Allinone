package com.venkatkamesh.allinone;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class mainmenuok extends AppCompatActivity {
    LinearLayout activity_fuck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenuok);
        Button lol = (Button) findViewById(R.id.lol);
        Button lol1 =(Button)findViewById(R.id.lol1);
        lol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.venkatkamesh.allinone.mainmenuok"));
            }
        });
        registerForContextMenu(lol);
        activity_fuck = (LinearLayout) findViewById(R.id.activity_mainmenuok_fuck);
    }

    @Override

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.bt1:
                activity_fuck.setBackgroundColor(Color.BLUE);
                break;
            case R.id.bt2:
                activity_fuck.setBackgroundColor(Color.RED);
                break;
            case R.id.bt3:
                activity_fuck.setBackgroundColor(Color.GREEN);
                break;
        }
        return super.onContextItemSelected(item);
    }
}
