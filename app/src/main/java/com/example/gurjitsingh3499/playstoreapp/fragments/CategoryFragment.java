package com.example.gurjitsingh3499.playstoreapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gurjitsingh3499.playstoreapp.R;
import com.example.gurjitsingh3499.playstoreapp.adapters.ContentAdapter;
import com.example.gurjitsingh3499.playstoreapp.services.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment {


    private static final String ARG_CATEGORY_TYPE = "category_type";

    private int categoryType;

    public static final int CATEGORY_TYPE_FEATURED = 0;
    public static final int CATEGORY_TYPE_RECENT = 1;
    public static final int CATEGORY_TYPE_PARTY = 2;


    public CategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param categoryType The Category type.
     * @return A new instance of fragment CategoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CategoryFragment newInstance(int categoryType) {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_CATEGORY_TYPE, categoryType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            categoryType = getArguments().getInt(ARG_CATEGORY_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_category, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content_recycler);
        recyclerView.setHasFixedSize(true); //set fixed size to improve performance

        ContentAdapter contentAdapter;

        if(categoryType == CATEGORY_TYPE_FEATURED){
            contentAdapter = new ContentAdapter(DataService.getInstance().getFeaturedStations());
        }else if(categoryType == CATEGORY_TYPE_RECENT){
            contentAdapter = new ContentAdapter(DataService.getInstance().getRecentStations());
        }else {
            contentAdapter = new ContentAdapter(DataService.getInstance().getPartyStations());
        }


        recyclerView.setAdapter(contentAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);


        return view;
    }

}
