package com.donjacoboapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.donjacoboapp.MainActivity;
import com.donjacoboapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.vision.face.Landmark;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelpFragment extends Fragment implements OnMapReadyCallback{

    private GoogleMap mMapa;

    public HelpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_help, container, false);
        SupportMapFragment sMapFrg = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
        sMapFrg.getMapAsync(this);
        return v;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMapa = googleMap;
        mMapa.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        LatLng poblado = new LatLng(6.2014169,-75.5977971);
        LatLng lamota = new LatLng(6.218427,-75.6011442);
        LatLng bello = new LatLng(6.3393503,-75.5484164);
        LatLng envigado = new LatLng(6.1691816,-75.5888557);
        LatLng floresta = new LatLng(6.2589653,-75.5998458);
        LatLng laplaya = new LatLng(6.248509,-75.5649898);
        LatLng laureles = new LatLng(6.2466982,-75.5959327);
        LatLng sabaneta = new LatLng(6.1525508,-75.6191092);

        mMapa.addMarker(new MarkerOptions().position(poblado).title("Sucursal Poblado").snippet("Telefofo:4483399"));
        mMapa.addMarker(new MarkerOptions().position(lamota).title("La Mota").snippet("Telefofo:4483399"));
        mMapa.addMarker(new MarkerOptions().position(bello).title("Bello").snippet("Telefofo:4483399"));
        mMapa.addMarker(new MarkerOptions().position(envigado).title("Envigado").snippet("Telefofo:4483399"));
        mMapa.addMarker(new MarkerOptions().position(floresta).title("Floresta").snippet("Telefofo:4483399"));
        mMapa.addMarker(new MarkerOptions().position(laplaya).title("La Playa").snippet("Telefofo:4483399"));
        mMapa.addMarker(new MarkerOptions().position(laureles).title("Laureles").snippet("Telefofo:4483399"));
        mMapa.addMarker(new MarkerOptions().position(sabaneta).title("Sabaneta").snippet("Telefofo:4483399"));
        mMapa.moveCamera(CameraUpdateFactory.newLatLng(poblado));


    }
}
