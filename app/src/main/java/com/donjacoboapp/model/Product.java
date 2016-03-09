package com.donjacoboapp.model;

import com.donjacoboapp.R;

import java.util.ArrayList;

/**
 * Created by cristhian.barros on 06/03/2016.
 */
public class Product {

    private String name;
    private int price;
    private String description;
    private static String description2;
    private boolean isSize = false;
    private String[] size;
    private int image;

    public static ArrayList<Product> listProduct;

    public Product(String name, Integer price, Integer image) {
        this.name = name;
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

    public static ArrayList<Product> getAllProducts() {

        listProduct = new ArrayList<Product>();

        Product heladoGenovesa = new Product("Helado Genovesa + Zepelin", 26000, R.drawable.genovesa);
        heladoGenovesa.setDescription("Producto Original de Don Jacobo. Bizcochuelo bañado en leches y cubierto en chocolate rayado.");
        listProduct.add(heladoGenovesa);

        Product tresLechesChocolatoso = new Product("Tres Leches Chocolatoso", 38000, R.drawable.tres_leches_chocolatoso);
        listProduct.add(tresLechesChocolatoso);

        Product milkos = new Product("Milkos", 42000, R.drawable.milkos);
        listProduct.add(milkos);

        Product maracuya = new Product("Maracuya",24000,R.drawable.cobito_maracuya);
        listProduct.add(maracuya);
        return listProduct;

    }
}
