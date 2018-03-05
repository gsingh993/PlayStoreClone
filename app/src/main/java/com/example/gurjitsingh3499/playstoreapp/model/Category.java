package com.example.gurjitsingh3499.playstoreapp.model;

/**
 * Created by gurjitsingh on 3/1/18.
 */

public class Category {

    final String DRAWABLE = "drawable/";
    private String categoryTitle;
    private String imgUri;

    public Category(String categoryTitle, String imgUri) {
        this.categoryTitle = categoryTitle;
        this.imgUri = imgUri;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public String getImgUri() {
        return imgUri;
    }

}
