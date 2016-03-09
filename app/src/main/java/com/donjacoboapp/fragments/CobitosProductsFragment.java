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
public class CobitosProductsFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProductC;

    public CobitosProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cobitos_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerViewC);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        Product cobitoMaracuya = new Product("Cobito® Maracuyá","Porción de postre cremoso elaborado a base de maracuyá y crema de leche con una base de galleta en la mitad.\n \n Es perfecto para que lo disfrutes cuando quieras o para que le endulces el día a alguien especial.",8000, R.drawable.cobito_maracuya);
        listProductC = new ArrayList<Product>();
        listProductC.add(cobitoMaracuya);

        recyclerViewAdapter = new RecyclerViewAdapter(listProductC);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
