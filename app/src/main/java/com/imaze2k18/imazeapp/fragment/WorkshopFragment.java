package com.imaze2k18.imazeapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.imaze2k18.imazeapp.Activity.Main2Activity;
import com.imaze2k18.imazeapp.Adapter.GridAdapter;
import com.imaze2k18.imazeapp.R;

import java.util.ArrayList;
import java.util.List;

public class WorkshopFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    GridView gridview;
    TextView textView;
    String[] values = {
            "Block Chain & Crypto Currency",
            "PLC SCADA",
            "GIS",
            "Vibration Management & Analysis"
    };
    int[] images= {
            R.drawable.bitcoin,
            R.drawable.plc,
            R.drawable.gis,
            R.drawable.vibration
    };

    List<ArrayList<String>> list;
    ArrayList<String> array;
    View view;
    Intent i;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_workshop, container, false);
        super.onCreate(savedInstanceState);
        gridview=(GridView)view.findViewById(R.id.gridview);
        GridAdapter gridAdapter=new GridAdapter(this.getContext(),values,images);
        gridview.setAdapter(gridAdapter);
        list=new ArrayList<>();
        array=new ArrayList<>();
        array.add(getResources().getString(R.string.intro));
        array.add(getResources().getString(R.string.w1_intro));
        array.add(getResources().getString(R.string.sch));
        array.add(getResources().getString(R.string.day1));
                array.add(getResources().getString(R.string.w1_day1));
        array.add(getResources().getString(R.string.day2));
                array.add(getResources().getString(R.string.w1_day2));
                list.add(array);
                array=new ArrayList<>();
        array.add(getResources().getString(R.string.intro));
        array.add(getResources().getString(R.string.w5_intro));
        array.add(getResources().getString(R.string.sch));
        array.add(getResources().getString(R.string.day1));
        array.add(getResources().getString(R.string.w5_day1));
        array.add(getResources().getString(R.string.day2));
        array.add(getResources().getString(R.string.w5_day2));
        list.add(array);
        array=new ArrayList<>();
        array.add(getResources().getString(R.string.intro));
        array.add(getResources().getString(R.string.w7_intro));
        array.add(getResources().getString(R.string.sch));
        array.add(getResources().getString(R.string.day1));
        array.add(getResources().getString(R.string.w7_day1));
        array.add(getResources().getString(R.string.day2));
        array.add(getResources().getString(R.string.w7_day2));
        list.add(array);
        array=new ArrayList<>();
        array.add(getResources().getString(R.string.intro));
        array.add(getResources().getString(R.string.w8_intro));
        array.add(getResources().getString(R.string.sch));
        array.add(getResources().getString(R.string.day1));
        array.add(getResources().getString(R.string.w8_day1));
        array.add(getResources().getString(R.string.day2));
        array.add(getResources().getString(R.string.w8_day2));
        list.add(array);
        //array=new ArrayList<>();

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                i=new Intent(getContext(),Main2Activity.class);
                i.putExtra("key",list.get(position));
                startActivity(i);
            }
        });
        return view;
    }
}