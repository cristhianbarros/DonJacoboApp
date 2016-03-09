package com.donjacoboapp.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.donjacoboapp.R;
import com.donjacoboapp.util.Util;

/**
 * Created by cristhian.barros on 07/03/2016.
 */
public class DialogContactFragment extends DialogFragment {

    Spinner spinnerCiudad;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =  getActivity().getLayoutInflater();

        // Declaro el objeto v como final para poderlo referenciar desde el método onClick
        final View v = inflater.inflate(R.layout.fragment_dialog_contact, null);

        // Instanció el Spinner de ciudades para poder cargarle el array de todas las ciudades;
        spinnerCiudad = (Spinner)v.findViewById(R.id.spr_ciudades);

        // Es necesario crear un adaptador para poder poblar o llenar el spinner anteriormente creado
        // El adaptador necesita 3 parametro, el contexto (Context), el array de los datos, y el layout.
        ArrayAdapter<CharSequence> adapterSpinner =  ArrayAdapter.createFromResource(getActivity().getApplicationContext()
                                                                                        , R.array.array_ciudades
                                                                                            , R.layout.fragment_dialog_contact_spinner_style);

        // Es necesario tambien añadir el estilo del DropDown
        adapterSpinner.setDropDownViewResource(R.layout.fragment_dialog_contact_spinner_style);

        // Por último añadimos el adaptador a el spinner
        spinnerCiudad.setAdapter(adapterSpinner);

        builder.setView(v)
                .setPositiveButton("Enviar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                EditText nombre = (EditText)v.findViewById(R.id.edt_nombre);
                                EditText email = (EditText)v.findViewById(R.id.edt_correo);
                                EditText asunto = (EditText)v.findViewById(R.id.edt_asunto);
                                EditText telefono = (EditText)v.findViewById(R.id.edt_telefono);
                                EditText mensaje = (EditText)v.findViewById(R.id.edt_asunto);
                                Spinner spinnerCiudad = (Spinner)v.findViewById(R.id.spr_ciudades);

                                String msj = "Nombre: "+nombre.getText()+"\n"
                                                +"Email: "+email.getText()+"\n"
                                                +"Asunto: "+asunto.getText()+"\n"
                                                +"Telefono: "+telefono.getText()+"\n"
                                                +"Mensaje: "+mensaje.getText()+"\n"
                                                +"Ciudad: "+spinnerCiudad.getSelectedItem().toString();

                                //Util.mostrarMensaje(getActivity().getApplicationContext(), msj);

                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.putExtra(Intent.EXTRA_EMAIL, email.getText());
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT,asunto.getText());
                                emailIntent.setType("message/rfc822");

                                startActivity(Intent.createChooser(emailIntent,"Elige una aplicación de correo:"));

                                //dialog.cancel();
                            }
                        })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}
