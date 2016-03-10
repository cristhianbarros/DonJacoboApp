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
public class PostresProductsFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;

    public PostresProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_genovesa_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Product ensuenoFrutas = new Product("Ensueño de Frutas","Postres de 3 leches al horno con frutas en su interior (piña y manzana).",29000,R.drawable.ensueno_de_frutas);
        Product mediodia = new Product("Medio Día","Delicioso postre compuesto por una capa de flan napolitano y una capa de pudín de vainilla.",34500,R.drawable.medio_dia);
        Product chesecajeta = new Product("Cheesecajeta®","La más dulce combinación de cajeta, con nueces y la nueva crema de queso tipo Philadelphia Don Jacobo.",44000,R.drawable.chessecajeta);
        Product medianoche = new Product("Media Noche","Delicioso postre compuesto por una capa de flan napolitano y una capa de pudín de chocolate.",34500,R.drawable.media_noche);
        Product flanleche = new Product("Flan de Leche","Postre hecho a base de leche a baño María.",31000,R.drawable.flan_leche);
        listProduct = new ArrayList<Product>();
        listProduct.add(ensuenoFrutas);
        listProduct.add(mediodia);
        listProduct.add(chesecajeta);
        listProduct.add(medianoche);
        listProduct.add(flanleche);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
