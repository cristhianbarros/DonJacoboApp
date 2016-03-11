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
public class ColombiaProductsFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager layoutManagerGrid;
    private RecyclerViewAdapter recyclerViewAdapter;
    public  ArrayList<Product> listProduct;

    public ColombiaProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_colombia_products, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Product genovesa = new Product("Genovesa®","Producto Original de Don Jacobo. Bizcochuelo bañado en leches y cubierto en chocolate rayado.",40000,R.drawable.genovesa);
        Product cafejacobo = new Product("Café Don Jacobo","Disfruta de lo más característico de nuestro país. Presentamos el CAFÉ DON JACOBO de calidad excelsa. Con la asesoría de expertos hemos seleccionado los mejores granos para darle a nuestra marca el orgullo de contar con el mas sublime sabor de Colombia.",10500,R.drawable.cafe_don_jacobo);
        Product ponquecolombia = new Product("Ponqué de Colombia","Perfecta para disfrutar de los sabores únicos y propios de Colombia.",15000,R.drawable.ponque_de_colombia);
        Product colombios = new Product("Colombios®","De las tradiciones dulces de nuestro país y con lo mejor de su cultura cafetera Don Jacobo crea su nueva línea COLOMBIA.",12000,R.drawable.colombios);
        listProduct = new ArrayList<Product>();
        listProduct.add(genovesa);
        listProduct.add(cafejacobo);
        listProduct.add(ponquecolombia);
        listProduct.add(colombios);
        recyclerViewAdapter = new RecyclerViewAdapter(listProduct);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
