package com.imaze2k18.imazeapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.imaze2k18.imazeapp.Activity.ProNight;
import com.imaze2k18.imazeapp.Activity.RangmanchDetails;
import com.imaze2k18.imazeapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightsFragment extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_nights, container, false);
        RelativeLayout r1=view.findViewById(R.id.r1);
        RelativeLayout r2=view.findViewById(R.id.r2);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(), RangmanchDetails.class);
                startActivity(i);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getContext(),ProNight.class);
                startActivity(i);
            }
        });
        return view;
    }

}
