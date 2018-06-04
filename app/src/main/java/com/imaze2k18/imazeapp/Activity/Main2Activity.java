package com.imaze2k18.imazeapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.imaze2k18.imazeapp.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<String> array;
    String a,b,c,d,e,f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent inte =getIntent();
        array=(ArrayList<String>) inte.getSerializableExtra("key");
        TextView head=findViewById(R.id.heading);
        TextView read=findViewById(R.id.readmore);
        TextView sch=findViewById(R.id.schedule);
        TextView text1= findViewById(R.id.text1);
        final TextView text2= findViewById(R.id.text2);
        TextView text3= findViewById(R.id.text3);
        final TextView text4= findViewById(R.id.text4);

        text2.setVisibility(View.GONE);
        text4.setVisibility(View.GONE);
       text1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(text2.getVisibility()==View.GONE)
                   text2.setVisibility(View.VISIBLE);
               else
                   text2.setVisibility(View.GONE);
           }
       });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text4.getVisibility()==View.GONE)
                    text4.setVisibility(View.VISIBLE);
                else
                    text4.setVisibility(View.GONE);
            }
        });
        if(array!=null)
        {
            a=array.get(0);
            b=array.get(1);
            c=array.get(2);
            d=array.get(3);
            e=array.get(4);
            f=array.get(5);
            g=array.get(6);
            head.setText(a);
            read.setText(b);
            sch.setText(c);
            text1.setText(d);
            text2.setText(e);
            text3.setText(f);
            text4.setText(g);
        }
    }
}
