package com.donjacoboapp.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.donjacoboapp.R;
import com.donjacoboapp.model.Product;

import org.w3c.dom.Text;

/**
 * Created by cristhian.barros on 07/03/2016.
 */
public class DialogDetailFragment extends DialogFragment {

    private Product product;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =  getActivity().getLayoutInflater();

        final View v = inflater.inflate(R.layout.fragment_dialog_detail_product, null);

        ImageView imageProduct = (ImageView) v.findViewById(R.id.imageProduct);
        TextView nameProduct = (TextView) v.findViewById(R.id.nameProduct);
        TextView descriptionProduct = (TextView) v.findViewById(R.id.descriptionProduct);
        TextView priceProduct = (TextView) v.findViewById(R.id.priceProduct);

        Glide.with(getActivity().getApplicationContext())
                .load(product.getImage())
                .centerCrop()
                .into(imageProduct);

        nameProduct.setText(product.getName());
        descriptionProduct.setText(getProduct().getDescription());
        priceProduct.setText("Precio: $ "+String.valueOf(getProduct().getPrice()));

        builder.setView(v)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        return builder.create();
    }
}
