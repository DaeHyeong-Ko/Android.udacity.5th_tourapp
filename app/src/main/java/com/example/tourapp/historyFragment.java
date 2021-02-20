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
        itemlist.add(new list(R.drawable.gamcheon, "Gamcheon Town", "사하구 감내2로","Before now, The sad history of korean's town was changed to attraction. visit and watching our story."));
        itemlist.add(new list(R.drawable.gukje, "Gukje market", "중구 신창동4가","Many people know as movie that contains major korean's life. go to there and take it smell."));

        listadapter adapter = new listadapter(getActivity(), itemlist);

        ListView itemadapter = (ListView) rootView.findViewById(R.id.list);

        itemadapter.setAdapter(adapter);

        return rootView;
    }
}
