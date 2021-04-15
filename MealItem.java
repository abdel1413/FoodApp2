package com.example.foodieapp;

import android.graphics.drawable.Drawable;

public class MealItem {

    private String itemName;
    private String itemDescription;
    private Drawable itemImage;
    private  String itemcalory;
    private String itemLink;

    public MealItem(String itemName, String itemDescription, Drawable itemImage, String itemcalory, String itemLink) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
        this.itemcalory = itemcalory;
        this.itemLink = itemLink;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public Drawable getItemImage() {
        return itemImage;
    }
    public String getItemcalory(){return  itemcalory;}

    public String getItemLink() {
        return itemLink;
    }

}
