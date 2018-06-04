package com.imaze2k18.imazeapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;

import com.imaze2k18.imazeapp.R;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class DetailseventActivity extends AppCompatActivity {

    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsevent);



        txt1=(TextView)findViewById(R.id.txt_detail);
        Intent inte =getIntent();;
        String i =inte.getStringExtra("my_key");
        txt1.setText(Html.fromHtml(i));
    }
}
