package com.odradeck.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> forecast_list = new ArrayList<String>();

        forecast_list.add("Today - Sunny - 88/63");
        forecast_list.add("Tomorrow - Foggy - 70/46");
        forecast_list.add("Weds - Cloudy - 72/63");
        forecast_list.add("Thurs - Rainy - 64/51");
        forecast_list.add("Fri - Foggy - 70/46");
        forecast_list.add("Sat - Sunny - 76 / 68");

        ArrayAdapter<String> forecast_adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecast_list);

        ListView listview = (ListView) rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(forecast_adapter);


        return rootView;
    }
}
