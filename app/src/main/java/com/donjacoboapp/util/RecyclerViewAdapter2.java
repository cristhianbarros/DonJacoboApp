package com.donjacoboapp.util;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.donjacoboapp.R;
import com.donjacoboapp.model.NewsEvents;

import java.util.ArrayList;

/**
 * Created by cristhian.barros on 06/03/2016.
 */
public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.ViewHolder> {

    ArrayList<NewsEvents> mListNewsEvents;

    public RecyclerViewAdapter2(ArrayList<NewsEvents> mListNewsEvents){
        this.mListNewsEvents = mListNewsEvents;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public TextView description;
        public ImageView image;

        public ViewHolder(View v) {
            super(v);

            title = (TextView) v.findViewById(R.id.titleEvent);
            description = (TextView) v.findViewById(R.id.descriptionEvent);
            image = (ImageView) v.findViewById(R.id.imageEvent);
        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.fragment_home_item_product_list2, parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final NewsEvents itemProduct = mListNewsEvents.get(position);

        Glide.with(holder.itemView.getContext())
                .load(itemProduct.getImage())
                .centerCrop()
                .into(holder.image);

        holder.title.setText(itemProduct.getTitle());
        holder.description.setText(itemProduct.getDescription());

//        holder.image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Util.mostrarMensaje(holder.itemView.getContext(),"Los detalles de los eventos");
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return mListNewsEvents.size();
    }
}
