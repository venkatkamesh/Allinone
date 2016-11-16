package com.venkatkamesh.allinone;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

import java.io.File;
import java.util.ArrayList;


public class MusicPlayer extends AppCompatActivity {

    ListView lv;
    String[] items;
    FetchSongs fs;
    ArrayList<File> mySongs;
    ProgressDialog dialog;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        lv=(ListView)findViewById(R.id.listView);
        fs=new FetchSongs();
        dialog=new ProgressDialog(this);
        dialog.setMessage("Please wait, Fetching Songs...");
        dialog.setCancelable(true);
        dialog.show();
 
        while(!fs.getfetchstatus()){
            mySongs=fs.findSongs(Environment.getExternalStorageDirectory());
        }
        if(mySongs!=null){
            dialog.dismiss();
        }

        mySongs = fs.getsonglist();

        items= new String[mySongs.size()];
        for (int i=0;i<mySongs.size();i++){
            items[i]=mySongs.get(i).getName().toString().replace(".mp3","");
        }

        ArrayAdapter<String> adp= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getApplicationContext(),Player.class);
                intent.putExtra("pos",i);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}

