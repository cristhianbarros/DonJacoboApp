package com.donjacoboapp.fragments.news_events;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.donjacoboapp.R;
import com.donjacoboapp.model.NewsEvents;
import com.donjacoboapp.util.RecyclerViewAdapter2;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsEventsFragment extends Fragment {

    private RecyclerViewAdapter2 recyclerAdapterNews;
    private RecyclerView recyclerView;
    private GridLayoutManager layoutManagerGrid;

    private ArrayList<NewsEvents> listNewsEvents;

    public NewsEventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_news_events, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerViewsNews);
        layoutManagerGrid = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManagerGrid);

        NewsEvents tourGenovesa = new NewsEvents ("TOUR DE LA GENOVESA", "Revive los mejores y dulces momentos de la gira nacional de Don Jacobo Postres y Ponqués.", R.drawable.tour_genovesa);
        NewsEvents congresoDulces = new NewsEvents ("CONGRESO INTERNACIONAL DULCES TENDENCIAS", "Es de gran importancia darle el primer lugar a la cultura pastelera, deslumbrando ante la comunidad nacional el talento y capacidades de resposteros internacionales.", R.drawable.congreso_dulces_tendencias);
        NewsEvents sorteoKia = new NewsEvents("SORTEO KIA PICANTO ION", "Felicidades a nuestro ganador FERNANDO ANDRES GUZMAN en la ciudad de IBAGUÉ del punto de venta NUEVO CADIZ.", R.drawable.sorteo_kia);
        NewsEvents entrevistaRichs = new NewsEvents("ENTREVISTA REALIZADA A DON JACOBO POR RICH'S MÉXICO", "Una pasión que comenzó muy temprano. Vengo de una familia súper trabajadora.", R.drawable.entrevista_richs);
        NewsEvents donjacoboPersonaje = new NewsEvents("DON JACOBO, PERSONAJE DEL AÑO EN LA REVISTA LA BARRA","La Revista La Barra destacó en las páginas de su Edición No 49 un artículo sobre la trayectoria de Don Jacobo Postres y Ponqués.", R.drawable.don_jacobo_personaje_anio);
        NewsEvents cartelMega = new NewsEvents("DON JACOBO POSTRES Y PONQUÉS EN EL CARTEL DE LA MEGA","El Cartel de La Mega, transmisión en Vivo desde el punto de venta Carrera 33 en Bucaramanga.", R.drawable.donjacobo_cartel_mega);
        NewsEvents autografosMaluma = new NewsEvents("FIRMA DE AUTÓGRAFOS DE MALUMA","Firma de Autógrafos de Maluma, en el punto de venta Carrera 33.", R.drawable.firma_maluma);
        NewsEvents congresoPasteleria = new NewsEvents("CONGRESO INTERNACIONAL DE PASTELERÍA","La Revista La Barra destacó en las páginas de su edición N° 49 un artículo sobre la trayectoria de Don Jacobo Postres y Ponqués.", R.drawable.congreso_pasteleria);
        NewsEvents congresoMaridaje = new NewsEvents("CONCURSO DE MARIDAJE", "En el marco de la pasada Feria de Manizales, Don Jacobo Postres & Ponqués tuvo el gusto de participar en el concurso de maridaje organizado por la Federación de Cafeteros de Caldas.", R.drawable.concurso_maridaje);
        NewsEvents aniosDonJacoboPostresPonques = new NewsEvents("25 AÑOS DE DON JACOBO POSTRES Y PONQUÉS","En los días 30 de noviembre y 1 de diciembre se llevaron a cabo en las inmediaciones del auditorio de la Cámara de Comercio la celebración de los 25 años de Don Jacobo Postres y Ponqués", R.drawable.anios_postres_ponques);
        NewsEvents agathaDonJacoboPostresPonques = new NewsEvents("ÁGATHA RUIZ DE LA PRADA EN DON JACOBO POSTRES Y PONQUÉS","La diseñadora Ibérica Ágatha Ruiz de la Prada se dejó cautivar por la dulzura de Don Jacobo Postres y Ponqués.", R.drawable.agatha_don_jacobo_postres_ponques);

        listNewsEvents = new ArrayList<>();

        listNewsEvents.add(tourGenovesa);
        listNewsEvents.add(congresoDulces);
        listNewsEvents.add(sorteoKia);
        listNewsEvents.add(entrevistaRichs);
        listNewsEvents.add(donjacoboPersonaje);
        listNewsEvents.add(cartelMega);
        listNewsEvents.add(autografosMaluma);
        listNewsEvents.add(congresoPasteleria);
        listNewsEvents.add(congresoMaridaje);
        listNewsEvents.add(aniosDonJacoboPostresPonques);
        listNewsEvents.add(agathaDonJacoboPostresPonques);


        recyclerAdapterNews = new RecyclerViewAdapter2(listNewsEvents);
        recyclerView.setAdapter(recyclerAdapterNews);

        return v;
    }

}
