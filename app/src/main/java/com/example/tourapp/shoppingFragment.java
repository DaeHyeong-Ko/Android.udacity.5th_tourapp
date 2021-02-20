package com.example.tourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class shoppingFragment extends Fragment {
    public shoppingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.listview, container, false);

        ArrayList<list> itemlist = new ArrayList<list>();
        itemlist.add(new list(R.drawable.ekea, getString(R.string.ekea), getString(R.string.shoppingadress1),getString(R.string.shoppingexplain1)));
        itemlist.add(new list(R.drawable.lottetoulet, getString(R.string.lottetoulet), getString(R.string.shoppingadress2),getString(R.string.shoppingexplain2)));

        listadapter adapter = new listadapter(getActivity(), itemlist);

        ListView itemadapter = (ListView) rootView.findViewById(R.id.list);

        itemadapter.setAdapter(adapter);

        return rootView;
    }
}