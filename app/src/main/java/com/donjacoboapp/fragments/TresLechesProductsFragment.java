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
public class TresLechesProductsFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;


    public TresLechesProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tortas_dulces_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Product treschocolatoso = new Product("Tres Leches Chocolatoso","Torta blanca, suave y esponjosa, remojada con una malteada de tres leches saborizada con los inconfundibles acentos del cacao en polvo.",38000,R.drawable.tres_leches_chocolatoso);
        Product trestropical = new Product("Tres Leches Tropical","Bizcochuelo blanco bañado en tres leches, con una cubierta a base de refrescantes acentos cítricos de maracuyá.",38000,R.drawable.tres_leches_tropical);
        Product tresarequipe = new Product("Tres Leches Arequipe","Torta blanca, bañada con la malteada de tres leches propia de Don Jacobo Postres y Ponqués, enriquecida con el dulce de leche tradicional colombiano.",38000,R.drawable.tres_leches_arequipe);
        listProduct = new ArrayList<Product>();
        listProduct.add(treschocolatoso);
        listProduct.add(trestropical);
        listProduct.add(tresarequipe);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
