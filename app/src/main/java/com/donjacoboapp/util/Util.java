package com.donjacoboapp.util;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.widget.Toast;

import com.donjacoboapp.MainActivity;
import com.donjacoboapp.fragments.DialogDetailFragment;
import com.donjacoboapp.model.Product;

/**
 * Created by cristhian.barros on 08/03/2016.
 */

// En esta clase vamos a crear todos los métodos que se puedan utilizar en muchas partes de la aplicación

public class Util  extends Fragment{

    // El método lo declaramos static, para que no sea necesario crear un objeto para poder utilizar el método
    public static void mostrarMensaje(Context context, String msj) {
        Toast.makeText(context, msj, Toast.LENGTH_LONG).show();
    }

    public static void mostrarDetalleProducto(Product producto) {

        DialogDetailFragment detalleProducto = new DialogDetailFragment();
        detalleProducto.setProduct(producto);
        detalleProducto.show(MainActivity.hola, "lkjasdlkj");
    }
}
