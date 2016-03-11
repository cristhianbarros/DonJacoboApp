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
public class AccesoriosProductsFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;

    public AccesoriosProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_accesorios_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Product globoacrilico = new Product("Globo Acrílico Pequeño","Blobo Acrílico Pequeño.",4800,R.drawable.globo_acrilico_pequeno);
        Product velavolcan = new Product("Vela Volcán","Vela Volcán",4000,R.drawable.vela_volcan);
        Product velaespiral = new Product("Vela Espiral","Vela Espiral",6000,R.drawable.vela_espiral);
        Product lanzaconfetti = new Product("Lanzaconfetti","Lanzaconfetti",6000,R.drawable.lanza_cofetti);
        Product kitcelebraciones = new Product("Kit Celebraciónes","Contiene: 12 globos, 1 serpentina , 1 tiara y un letrero de Feliz Cumpleaños",10000,R.drawable.kitcelebrar);
        listProduct = new ArrayList<Product>();
        listProduct.add(globoacrilico);
        listProduct.add(velavolcan);
        listProduct.add(velaespiral);
        listProduct.add(lanzaconfetti);
        listProduct.add(kitcelebraciones);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
