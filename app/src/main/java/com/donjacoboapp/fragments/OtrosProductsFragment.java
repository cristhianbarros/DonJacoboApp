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
public class OtrosProductsFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;

    public OtrosProductsFragment() {
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
        Product combofiesta = new Product("Combo Fiesta","¡Complemento perfecto para tus celebraciones!",14000,R.drawable.combo_fiesta);
        Product genovesa_zepelin = new Product("Helado Genovesa + Zepelín","Una Combinación Perfecta",26000,R.drawable.helado_genovesa);
        Product chocolatesteen = new Product("Caja Chocolates Teen","Chocolate con café, Chocolate con naranja confitada, chocolate con avellana y chocolate de leche.",13000,R.drawable.chocolates_teen);
        Product heladojacobo = new Product("","Un desarrollo para redescubrir la perfección del sabor de nuestro postre insignia, con una presentación extraordinaria, un sabor de helado que no puedes dejar de probar.",20000,R.drawable.helado_jacobo);
        Product ponquenegro = new Product("Lata Ponqué Negro","El tradicional ponqué envinado presentado en un lindo empaque de holajata.",15950,R.drawable.ponque_mediano);
        Product ponquenegropequeno = new Product("Lata Ponqué Negro Pequeño","El tradicional ponqué envinado presentado en un lindo empaque de holajata",12600,R.drawable.ponque_pequeno);
        listProduct = new ArrayList<Product>();
        listProduct.add(combofiesta);
        listProduct.add(genovesa_zepelin);
        listProduct.add(chocolatesteen);
        listProduct.add(heladojacobo);
        listProduct.add(ponquenegro);
        listProduct.add(ponquenegropequeno);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
