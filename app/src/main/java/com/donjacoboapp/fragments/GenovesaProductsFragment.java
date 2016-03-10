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
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Product genovesa = new Product("Genovesa®", "Producto Original de Don Jacobo. Bizcochuelo bañado en leches y cubierto en chocolate rayado.",40000, R.drawable.genovesa);
        Product milkos = new Product("Milkos","Exquisita torta esponjosa de chocolate bañada en una cremosa malteada del mismo sabor, con una sabrosa cubierta de cacao y chocolate rayado forman la combinación perfecta.",42000, R.drawable.tres_leches_chocolatoso);
        Product genovesaNociolle = new Product("Genovesa® Nocciole*","Crema de avellanas y chocolate. ¡Única! ¡Exclusiva! ¡La nueva sensación! ¡Tienes que probarla!\n \n Esta nueva torta reúne dos grandes  creaciones gastronómicas: la original GENOVESA® de Don Jacobo Postres y Ponqués y una deliciosa crema de avellanas y chocolate. Juntas se convierten en una delicia que hacen balance en dulzura y suavidad. La torta se complementa con un novedoso cereal recubierto en chocolate blanco y chocolate semiamargo (igualmente exclusivo de Don Jacobo Postres y Ponqués), cuya crocancia le da un toque adicional que hará de ésta la preferida de chicos y grandes.",44000,R.drawable.genovesa_nociello);
        Product cobitoGenovesa = new Product("Cobito® Genovesa", "Porción del Producto Original de Don Jacobo. Bizcochuelo bañado en leches y cubierto en chocolate rayado.", 8000, R.drawable.cobito_genovesa);
        listProduct = new ArrayList<Product>();
        listProduct.add(genovesa);
        listProduct.add(milkos);
        listProduct.add(genovesaNociolle);
        listProduct.add(cobitoGenovesa);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
