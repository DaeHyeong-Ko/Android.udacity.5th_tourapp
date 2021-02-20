package com.example.tourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class historyFragment extends Fragment {
    public historyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview, container, false);

        final ArrayList<list> itemlist = new ArrayList<list>();
        itemlist.add(new list(R.drawable.gamcheon, getString(R.string.gamcheon), getString(R.string.historyadress1),getString(R.string.historyexplain1)));
        itemlist.add(new list(R.drawable.gukje, getString(R.string.gukje), getString(R.string.historyadress2),getString(R.string.historyexplain2)));

        listadapter adapter = new listadapter(getActivity(), itemlist);

        ListView itemadapter = (ListView) rootView.findViewById(R.id.list);

        itemadapter.setAdapter(adapter);

        return rootView;
    }
}
