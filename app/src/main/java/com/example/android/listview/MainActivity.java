package com.example.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Citem> list = new ArrayList<>();
        list.add(new Citem("Ashish",R.drawable.ic_launcher_background));
        list.add(new Citem("IronMan",R.drawable.ic_launcher_background));
        list.add(new Citem("CaptainAmerica",R.drawable.ic_launcher_background));
        list.add(new Citem("Hawk Eye",R.drawable.ic_launcher_background));
        list.add(new Citem("BlackWidow",R.drawable.ic_launcher_background));
        list.add(new Citem("Thor",R.drawable.ic_launcher_background));

        AvengersAdapter adapter = new AvengersAdapter(this,list);

        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);






    }
}
