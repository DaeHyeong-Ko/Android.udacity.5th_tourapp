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
        itemlist.add(new list(R.drawable.haewoondae, "Haewoondae", "해운대구 우동","This is very famous Beach in korea. Every year many visitors want to go there and take it healing."));
        itemlist.add(new list(R.drawable.gwangalli, "Gwangalli", "수영구 광안해변로","We can sea pretty and beautiful sight seeing while in beach at night. Come with Us"));

        listadapter adapter = new listadapter(getActivity(),itemlist);

        ListView itemadapter = (ListView) rootView.findViewById(R.id.list);

        itemadapter.setAdapter(adapter);

        return rootView;
    }
}