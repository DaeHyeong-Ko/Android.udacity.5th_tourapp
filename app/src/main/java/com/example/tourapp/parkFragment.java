package com.example.tourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class parkFragment extends Fragment {
    public parkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listview, container, false);

        final ArrayList<list> itemlist = new ArrayList<list>();
        itemlist.add(new list(R.drawable.igidae, getString(R.string.igidae), getString(R.string.parkadress1),getString(R.string.parkexplain1)));
        itemlist.add(new list(R.drawable.taejongdae, getString(R.string.taejongdae),getString(R.string.parkadress2),getString(R.string.parkexplain2)));

        listadapter adapter = new listadapter(getActivity(), itemlist);

        ListView itemadapter = (ListView) rootView.findViewById(R.id.list);

        itemadapter.setAdapter(adapter);

        return rootView;
    }
}
