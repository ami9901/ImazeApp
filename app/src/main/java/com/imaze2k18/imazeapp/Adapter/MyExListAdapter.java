package com.imaze2k18.imazeapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.imaze2k18.imazeapp.R;
import com.imaze2k18.imazeapp.logging.L;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 04/03/2018.
 */

public class MyExListAdapter extends BaseExpandableListAdapter {
    List<String> dept;
    Context context;
    Map<String,List<String>> events;
    public MyExListAdapter(Context context, List<String> dept, Map<String,List<String>> events){
        this.context=context;
        this.dept=dept;
        this.events=events;
    }

    @Override
    public int getGroupCount() {
        return dept.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return events.get(dept.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return dept.get(groupPosition) ;
    }

    @Override
    public Object getChild(int groupPosition, int ChildPosition) {
        return events.get(dept.get(groupPosition)).get(ChildPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int ChildPosition) {
        return ChildPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
    LayoutInflater inflater;
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup Parent) {
        String dept=(String)getGroup(groupPosition);
        if(convertView==null)
        {
            inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = LayoutInflater.from(context).inflate(R.layout.parent,Parent,false);
        }
        TextView txtparent=(TextView)convertView.findViewById(R.id.header);
        txtparent.setText(dept);

        ImageView img=(ImageView)convertView.findViewById(R.id.image_parent);
        String str = dept.replace(" ", "").toLowerCase();
        L.m(str);
        int resourceImage = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        img.setImageResource(resourceImage);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int ChildPosition, boolean isLastChild, View convertView, ViewGroup Parent) {
        String events = (String)getChild(groupPosition,ChildPosition);
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.child,Parent,false);
            inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }
        TextView txtchild=(TextView)convertView.findViewById(R.id.child);
        txtchild.setText(events);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int ChildPosition) {
        return true;
    }

}
