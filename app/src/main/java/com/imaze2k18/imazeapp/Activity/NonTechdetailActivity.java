package com.imaze2k18.imazeapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.imaze2k18.imazeapp.R;

public class NonTechdetailActivity extends AppCompatActivity {

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_techdetail);

        txt1=(TextView)findViewById(R.id.txt_detail);
        Intent inte =getIntent();;
        String i =inte.getStringExtra("my_key1");
        txt1.setText(Html.fromHtml(i));
        txt1.setTextSize(16);
    }
}
