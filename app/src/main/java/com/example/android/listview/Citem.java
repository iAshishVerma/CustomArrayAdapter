package com.example.android.listview;

/**
 * Created by ANKIT on 04-11-2017.
 */

public class Citem {

    private String text;
    private int Image;


    Citem(String txt,int Img){
        text=txt;
        Image=Img;

    }

    public String getText(){
        return text;
    }
    public int getImage(){
        return Image;
    }
}
