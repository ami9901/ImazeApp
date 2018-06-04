package com.imaze2k18.imazeapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.imaze2k18.imazeapp.R;

public class NightsInfo extends AppCompatActivity {

    int id;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nights_info);
        Intent i=getIntent();
        ImageView image=findViewById(R.id.img);
        TextView text=findViewById(R.id.txt);
        image.setBackground(getResources().getDrawable(id=i.getIntExtra("image",0)));
        text.setText(st=i.getStringExtra("string"));
    }
}
