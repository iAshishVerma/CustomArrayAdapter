package com.example.android.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ANKIT on 04-11-2017.
 */

public class AvengersAdapter extends ArrayAdapter<Citem> {


    public AvengersAdapter(Context context, ArrayList<Citem> datasourcelist){
        super(context,0,datasourcelist);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewItem =convertView;
        if (listViewItem==null){

            listViewItem=LayoutInflater.from(getContext()).inflate(R.layout.singleitem,parent,false);
        }
        //the getItem method is called ipon the data source of the adapter i.e. the arraylist
        Citem currentItem=getItem(position);
        TextView textView=listViewItem.findViewById(R.id.textid);
        textView.setText(currentItem.getText());
        ImageView imageView=listViewItem.findViewById(R.id.imageid);
        imageView.setImageResource(currentItem.getImage());



        return listViewItem;
    }
}
