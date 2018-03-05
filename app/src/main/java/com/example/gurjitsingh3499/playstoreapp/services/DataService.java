package com.example.gurjitsingh3499.playstoreapp.services;

import com.example.gurjitsingh3499.playstoreapp.model.Category;

import java.util.ArrayList;

/**
 * Created by gurjitsingh on 3/5/18.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }
    public ArrayList<Category> getFeaturedStations(){
        ArrayList<Category> list = new ArrayList<>();
        list.add(new Category("Travel Tunes", "flightplanmusic"));
        list.add(new Category("Cross Country Biking", "bicyclemusic"));
        list.add(new Category("Dope Music", "kidsmusic"));

        return list;
    }
    public ArrayList<Category> getRecentStations(){
        ArrayList<Category> list = new ArrayList<>();
        list.add(new Category("Travel Tunes", "flightplanmusic"));
        list.add(new Category("Cross Country Biking", "bicyclemusic"));
        list.add(new Category("Dope Music", "kidsmusic"));

        return list;
    }
    public ArrayList<Category> getPartyStations(){
        ArrayList<Category> list = new ArrayList<>();
        list.add(new Category("Travel Tunes", "flightplanmusic"));
        list.add(new Category("Cross Country Biking", "bicyclemusic"));
        list.add(new Category("Dope Music", "kidsmusic"));

        return list;
    }
}
