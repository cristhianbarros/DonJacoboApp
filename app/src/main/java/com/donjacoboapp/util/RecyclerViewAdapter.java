package com.donjacoboapp.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.donjacoboapp.R;
import com.donjacoboapp.model.Product;

import java.util.ArrayList;

/**
 * Created by cristhian.barros on 06/03/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    ArrayList<Product> mListProducts = Product.getAllProducts();



    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public TextView price;
        public ImageView image;

        public ViewHolder(View v) {
            super(v);

            title = (TextView) v.findViewById(R.id.titleProduct);
            price = (TextView) v.findViewById(R.id.priceProduct);
            image = (ImageView) v.findViewById(R.id.imageProduct);
        }

    }

    public RecyclerViewAdapter() {

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.fragment_home_item_product_list2, parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Product itemProduct = Product.getAllProducts().get(position);

        Glide.with(holder.itemView.getContext())
                .load(itemProduct.getImage())
                .centerCrop()
                .into(holder.image);

        holder.title.setText(itemProduct.getName());
        holder.price.setText("$ "+itemProduct.getPrice());

    }

    @Override
    public int getItemCount() {
        return mListProducts.size();
    }
}
