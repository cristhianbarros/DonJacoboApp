package com.donjacoboapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.donjacoboapp.R;
import com.donjacoboapp.model.Product;
import com.donjacoboapp.util.RecyclerViewAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TortasChocolateProductsFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;

    public TortasChocolateProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tortas_chocolate_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerViewC);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Product tortachomocachino = new Product("Torta Chocolate Mocachino","Combinación de las texturas y los sabores clásicos del café y el chocolate.",38000,R.drawable.torta_chocolate_mocachino);
        Product tortachocolate = new Product("Torta de Chocolate","Para amantes del chocolate, una torta negra preparada con la receta tradicional, rellena de una ganache, a base de trufas de chocolate, que enfatiza la intensidad y el insuperable aroma del cacao.",36500,R.drawable.torta_de_chocolate);
        Product tortachofrutosrojos  = new Product("Torta Chocolate Frutos Rojos","El chocolate y los frutos rojos en una mezcla perfecta.",38000,R.drawable.torta_chocolate_frutos_rojos);
        Product tortachocoway = new Product("Torta ChocoWay","Torta de chocolate con 2 capas de relleno de caramelo de chocoway y nueces.",36500,R.drawable.torta_chocoway);
        listProduct = new ArrayList<Product>();
        listProduct.add(tortachomocachino);
        listProduct.add(tortachocolate);
        listProduct.add(tortachofrutosrojos);
        listProduct.add(tortachocoway);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
