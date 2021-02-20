package com.example.tourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class beachFragment extends Fragment {

    public beachFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listview, container, false);

        final ArrayList<list> itemlist = new ArrayList<list>();
        itemlist.add(new list(R.drawable.haewoondae, getString(R.string.haewoondae), getString(R.string.beachadress1),getString(R.string.beachexplain1)));
        itemlist.add(new list(R.drawable.gwangalli, getString(R.string.gwangalli), getString(R.string.beachadress2),getString(R.string.beachexplain2)));

        listadapter adapter = new listadapter(getActivity(),itemlist);

        ListView itemadapter = (ListView) rootView.findViewById(R.id.list);

        itemadapter.setAdapter(adapter);

        return rootView;
    }
}