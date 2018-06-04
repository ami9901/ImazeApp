package com.imaze2k18.imazeapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imaze2k18.imazeapp.R;

/**
 * Created by admin on 05/04/2018.
 */

public class ImazeteamFragment extends Fragment{
    private View view;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.teamdetails, container, false);
        return view;
    }
}
