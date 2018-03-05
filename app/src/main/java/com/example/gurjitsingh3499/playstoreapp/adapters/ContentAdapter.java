package com.example.gurjitsingh3499.playstoreapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.gurjitsingh3499.playstoreapp.holders.CategoryViewHolder;
import com.example.gurjitsingh3499.playstoreapp.model.Category;

import java.util.ArrayList;

/**
 * Created by gurjitsingh on 3/1/18.
 */

public class ContentAdapter extends RecyclerView.Adapter<CategoryViewHolder>{

    private ArrayList<Category> categories;

    public ContentAdapter(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
