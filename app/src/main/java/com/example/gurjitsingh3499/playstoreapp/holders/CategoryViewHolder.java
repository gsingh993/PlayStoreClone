package com.example.gurjitsingh3499.playstoreapp.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gurjitsingh3499.playstoreapp.R;
import com.example.gurjitsingh3499.playstoreapp.model.Category;

/**
 * Created by gurjitsingh on 3/1/18.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder{

    private ImageView mainImg;
    private TextView textView;

    public CategoryViewHolder(View itemView) {
        super(itemView);

        this.mainImg = (ImageView) itemView.findViewById(R.id.main_image);
        this.textView = (TextView) itemView.findViewById(R.id.main_text);
    }
    public void updateUI(Category category){
        String uri = category.getImgUri();
        int resource = mainImg.getResources().getIdentifier(uri, null, mainImg.getContext().getPackageName());
        mainImg.setImageResource(resource);

        textView.setText(category.getCategoryTitle());
    }
}
