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
        itemlist.add(new list(R.drawable.ekea, "EKEA", "기장읍 동부산관광","big, famous, convenient store for social life."));
        itemlist.add(new list(R.drawable.lottetoulet, "Lotte Oulet", "기장읍 기장해안로","lotte made, lotte did, lotte make money."));

        listadapter adapter = new listadapter(getActivity(), itemlist);

        ListView itemadapter = (ListView) rootView.findViewById(R.id.list);

        itemadapter.setAdapter(adapter);

        return rootView;
    }
}