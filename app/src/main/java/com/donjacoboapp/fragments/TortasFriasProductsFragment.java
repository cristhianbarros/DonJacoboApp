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
public class TortasFriasProductsFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;

    public TortasFriasProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tortas_frias_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Product tortacombinada = new Product("Torta Combinada","Mitad torta blanca y mitad torta Negra con 2 capas de relleno de fresa picada y crema inglesa.",36500,R.drawable.torta_combinada);
        Product tortainglesa   = new Product("Torta Inglesa","Tres capas de tortas; dos de vainilla y en el centro, una de chocolate, unidas con dos rellenos de arequipe y crema inglesa.",36500,R.drawable.torta_inglesa);
        Product tortamelofresa = new Product("Torta MeloFresa","Torta blanca con 2 capas de relleno de fresa y melocotón picados y crema inglesa.",36500,R.drawable.torta_melofresa);
        listProduct = new ArrayList<Product>();
        listProduct.add(tortacombinada);
        listProduct.add(tortainglesa);
        listProduct.add(tortamelofresa);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
