package com.imaze2k18.imazeapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.imaze2k18.imazeapp.R;
import com.imaze2k18.imazeapp.fragment.WorkshopFragment;

/**
 * Created by admin on 30/03/2018.
 */

public class GridAdapter extends BaseAdapter {

    Context context;
    private final String[] values;
    private final int[] images;
    View view;
    LayoutInflater layoutInflater;

    public GridAdapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)
        {
            view=new View(context);
            view=layoutInflater.inflate(R.layout.single_item,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.image);
            TextView textView=(TextView)view.findViewById(R.id.text);
            imageView.setImageResource(images[position]);
            textView.setText(values[position]);
        }
        return view;
    }
}
