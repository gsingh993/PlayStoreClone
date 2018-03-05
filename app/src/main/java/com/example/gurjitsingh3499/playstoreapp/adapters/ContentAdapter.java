package com.example.gurjitsingh3499.playstoreapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gurjitsingh3499.playstoreapp.R;
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

        View catergoryCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_category, parent,false);
        return new CategoryViewHolder(catergoryCard);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        Category category = categories.get(position);
        holder.updateUI(category);


    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
