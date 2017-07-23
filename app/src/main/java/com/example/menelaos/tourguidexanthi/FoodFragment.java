package com.example.menelaos.tourguidexanthi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// {@link Fragment} that displays a list of attractions.
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.food_palaia_poli_title, R.string.food_palaia_poli_description,
                R.drawable.food_palaia_polh, R.string.high_cost));
        attractions.add(new Attraction(R.string.food_to_pilima_title, R.string.food_to_pilima_description,
                R.drawable.food_to_pilima, R.string.low_cost));
        attractions.add(new Attraction(R.string.food_to_vareli_title, R.string.food_to_vareli_description,
                R.drawable.food_to_vareli, R.string.low_cost));
        attractions.add(new Attraction(R.string.food_nea_ellas_title, R.string.food_nea_ellas_description,
                R.drawable.food_nea_ellas, R.string.high_cost));
        attractions.add(new Attraction(R.string.food_papaparaskevas_title, R.string.food_papaparaskevas_description,
                R.drawable.food_papaparaskevas, R.string.high_cost));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CategoryAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}