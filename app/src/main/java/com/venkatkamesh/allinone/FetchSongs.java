package com.venkatkamesh.allinone;

import java.io.File;
import java.util.ArrayList;

    class FetchSongs {
    private boolean fetchstatus=false;

    private ArrayList<File> songs=new ArrayList<File>();
    FetchSongs(){

    }
    ArrayList<File> findSongs(File root){
        ArrayList<File> al=new ArrayList<File>();
        File[] files=root.listFiles();
        for (File singleFile : files){
            if(singleFile.isDirectory() && !singleFile.isHidden()){
                al.addAll(findSongs(singleFile));
            }
            else {
                if(singleFile.getName().endsWith(".mp3")){
                    al.add(singleFile);
                }
            }
        }
        fetchstatus=true;
        songs=al;
        return al;
    }
    boolean getfetchstatus(){
        return fetchstatus;
    }
    ArrayList<File> getsonglist(){
        return songs;
    }
}
