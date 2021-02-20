package com.example.tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listadapter extends ArrayAdapter {
    public listadapter(Activity context, ArrayList<list> item) {
        super(context, 0, item);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup container) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem, container, false);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.listpicture);
        TextView textView1 = (TextView) convertView.findViewById(R.id.place_input);
        TextView textView2 = (TextView) convertView.findViewById(R.id.address_input);
        TextView textView3 = (TextView) convertView.findViewById(R.id.explain_input);

        list postionchecker = (list) getItem(position);
        imageView.setImageResource(postionchecker.getmsightpicture());
        textView1.setText(postionchecker.getmsightname());
        textView2.setText(postionchecker.getmsightaddress());
        textView3.setText(postionchecker.getmexplain());

        return convertView;
    }
}