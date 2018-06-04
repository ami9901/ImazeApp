package com.imaze2k18.imazeapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.imaze2k18.imazeapp.R;

public class RangmanchDetails extends AppCompatActivity {

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangmanch_details);
        Intent inte =getIntent();
        LinearLayout relate1= findViewById(R.id.r1);
        LinearLayout relate2= findViewById(R.id.r2);
        LinearLayout relate3= findViewById(R.id.r3);
        LinearLayout relate4= findViewById(R.id.r4);
        relate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),NightsInfo.class);
                i.putExtra("image",R.drawable.web1);
                i.putExtra("string",getResources().getString(R.string.web1));
                startActivity(i);
            }
        });
        relate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),NightsInfo.class);
                i.putExtra("image",R.drawable.web2);
                i.putExtra("string",getResources().getString(R.string.web2));
                startActivity(i);
            }
        });
        relate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),NightsInfo.class);
                i.putExtra("image",R.drawable.web3);
                i.putExtra("string",getResources().getString(R.string.web3));
                startActivity(i);
            }
        });
        relate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),NightsInfo.class);
                i.putExtra("image",R.drawable.web4);
                i.putExtra("string",getResources().getString(R.string.web4));
                startActivity(i);
            }
        });
    }

}
