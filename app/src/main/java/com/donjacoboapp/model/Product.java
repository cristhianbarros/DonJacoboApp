package com.donjacoboapp.model;

import com.donjacoboapp.R;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by cristhian.barros on 06/03/2016.
 */
public class Product {

    private String name;
    private int price;
    private String description;
    private boolean isSize = false;
    private String[] size;
    private int image;

    public static ArrayList<Product> listProduct;

    public Product(String name, String description, Integer price, Integer image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSize() {
        return isSize;
    }

    public void setIsSize(boolean isSize) {
        this.isSize = isSize;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
