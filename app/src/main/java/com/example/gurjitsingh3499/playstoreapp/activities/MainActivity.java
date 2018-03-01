package com.example.gurjitsingh3499.playstoreapp.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.gurjitsingh3499.playstoreapp.R;
import com.example.gurjitsingh3499.playstoreapp.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance("lol","lol");
            fragmentManager
                    .beginTransaction()
                    .add(R.id.container_main, mainFragment)
                    .commit();
        }

    }
}
