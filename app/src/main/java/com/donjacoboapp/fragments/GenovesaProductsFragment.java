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
public class GenovesaProductsFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;

    public GenovesaProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_genovesa_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
//        layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
        layoutManagerGrid = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManagerGrid);
        Product Genovesa = new Product("Helado Genovesa + Zepelin", 26000, R.drawable.genovesa);
        recyclerViewAdapter = new RecyclerViewAdapter(Product.getAllProducts());
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
