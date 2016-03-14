package com.donjacoboapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.donjacoboapp.MainActivity;
import com.donjacoboapp.R;
import com.donjacoboapp.util.adminMarker;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.vision.face.Landmark;

import java.io.LineNumberInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelpFragment extends Fragment implements OnMapReadyCallback{

    private GoogleMap mMapa;
    private View mock;
    private ArrayList<adminMarker> listmarkers = new ArrayList<>();
    private String [] listCiudades;
    private ListView listView;
    private String ciudad = "Todos";
    public HelpFragment() {
        // Required empty public constructor
    }

    public View getMock() {
        return this.mock;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_help, container, false);
        mock = inflater.inflate(R.layout.info_mock_maps,container,false);
        listView =(ListView) v.findViewById(R.id.ciudades);

        listCiudades = getResources().getStringArray(R.array.ciudades);
        ArrayAdapter<String> opciones = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,listCiudades);
        listView.setAdapter(opciones);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ciudad = listCiudades[position];
                moveCamera(ciudad);
            }
        });
        SupportMapFragment sMapFrg = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
        sMapFrg.getMapAsync(this);
        return v;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMapa = googleMap;
        mMapa.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        listmarkers = getMarkers();
        for (int i=0;i< listmarkers.size();i ++){
            mMapa.addMarker(new MarkerOptions().position(new LatLng(listmarkers.get(i).getmLatitud(),listmarkers.get(i).getmLongitud())).title(listmarkers.get(i).getmTitle()).snippet(listmarkers.get(i).getmSnipet()));
        }
        mMapa.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                View v = getMock();
                TextView titulo = (TextView) v.findViewById(R.id.titulo);
                TextView snipet = (TextView) v.findViewById(R.id.snipet);
                CharSequence text = Html.fromHtml(marker.getSnippet());
                titulo.setText(marker.getTitle());
                snipet.setText(text);
                return v;
            }
        });
        mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.0866147, -81.9824823), 4));

    }
    public ArrayList<adminMarker> getMarkers(){
        ArrayList<adminMarker> list = new ArrayList<>();
        //are created markers from medellin
        adminMarker poblado = new adminMarker(6.2014169,-75.597797,"Av Poblado",getString(R.string.poblado));
        adminMarker lamota = new adminMarker(6.218427,-75.6011442,"La Mota",getString(R.string.lamota));
        adminMarker bello  = new adminMarker(6.3393503,-75.5484164,"Bello",getString(R.string.bello));
        adminMarker envigado = new adminMarker(6.1691816,-75.5888557,"Envigado",getString(R.string.envigado));
        adminMarker floresta = new adminMarker(6.2589653,-75.5998458,"Floresta",getString(R.string.floresta));
        adminMarker laplaya = new adminMarker(6.248509,-75.5649898,"La Playa",getString(R.string.laplaya));
        adminMarker laureles = new adminMarker(6.2466982,-75.5959327,"Laureles",getString(R.string.laureles));
        adminMarker sabaneta = new adminMarker(6.1525508,-75.6191092,"Sabaneta",getString(R.string.sabaneta));
        adminMarker sucpoblado = new adminMarker(6.1907908,-75.5803526,"Sucursal Poblado",getString(R.string.sucpoblado));
        list.add(poblado);
        list.add(lamota);
        list.add(bello);
        list.add(envigado);
        list.add(floresta);
        list.add(laplaya);
        list.add(laureles);
        list.add(sabaneta);
        list.add(sucpoblado);
        //are created markers from Armenia
        adminMarker armnenia = new adminMarker(4.5510378,-75.6610824,"Armenia",getString(R.string.armenia));
        list.add(armnenia);
        //are created markers from Barrancabermeja
        adminMarker elrecreo = new adminMarker(7.0597962,-73.8534306,"El Recreo",getString(R.string.elrecreo));
        list.add(elrecreo);
        //are created markers from Barranquilla
        adminMarker elprado = new adminMarker(10.9953977,-74.8089956,"El Prado",getString(R.string.elprado));
        list.add(elprado);
        //are created markers from Bogotá
        adminMarker cedritos = new adminMarker(4.7242637,-74.0482638,"Cedritos",getString(R.string.cedritos));
        adminMarker ciudadsalitre = new adminMarker(4.6565839,-74.1150224,"Ciudad Salitre",getString(R.string.ciudadsalitre));
        adminMarker quintacamacho = new adminMarker(4.7147126,-74.0387988,"Quinta Camacho",getString(R.string.quintacamacho));
        adminMarker santabarbara = new adminMarker(4.704323,-74.0512502,"Santa Barbara",getString(R.string.santabarbara));
        list.add(cedritos);
        list.add(ciudadsalitre);
        list.add(quintacamacho);
        list.add(santabarbara);
        //are created markers from Bucaramanga
        adminMarker canaveral = new adminMarker(7.1256378,-73.1223427,"Cañaveral",getString(R.string.canaveral));
        adminMarker cabeceraprincipal = new adminMarker(7.1217225,-73.114186,"Cabecera Principal",getString(R.string.cabeceraprincipal));
        adminMarker centro = new adminMarker(7.1194131,-73.1244526,"Centro",getString(R.string.centro));
        adminMarker cuartaetapa = new adminMarker(7.1159451,-73.1119174,"Cuarta Etapa",getString(R.string.cuartaetapa));
        adminMarker delapiedecuesta = new adminMarker(7.0002399,-73.0542862,"Delacuesta, Piedecuesta",getString(R.string.delapiedecuesta));
        adminMarker diamantedos = new adminMarker(7.0921172,-73.1144538,"Diamante II",getString(R.string.diamantedos));
        adminMarker giron = new adminMarker(7.0645013,-73.1690237,"Girón",getString(R.string.giron));
        adminMarker lagosuno = new adminMarker(7.0724197,-73.1063847,"Lagos 1",getString(R.string.lagosuno));
        adminMarker provenza = new adminMarker(7.0857771,-73.113338,"Provenza",getString(R.string.provenza));
        adminMarker maderopie = new adminMarker(6.9934369,-73.0484271,"Puerto madero, Piedecuesta",getString(R.string.maderopie));
        adminMarker quitapie = new adminMarker(7.0016966,-73.0543121,"Quinta Granada, Piedecuesta",getString(R.string.quintapie));
        adminMarker realminas = new adminMarker(7.1020083,-73.1255589,"Real De Minas",getString(R.string.realminas));
        adminMarker sanalonso = new adminMarker(7.1312773,-73.1195604,"San Alonso",getString(R.string.sanalonso));
        adminMarker tejar = new adminMarker(7.0970333,-73.1049827,"Tejar",getString(R.string.tejar));
        list.add(canaveral);
        list.add(cabeceraprincipal);
        list.add(centro);
        list.add(cuartaetapa);
        list.add(delapiedecuesta);
        list.add(diamantedos);
        list.add(giron);
        list.add(lagosuno);
        list.add(provenza);
        list.add(maderopie);
        list.add(quitapie);
        list.add(realminas);
        list.add(sanalonso);
        list.add(tejar);
        //are created markers from cali

        return list;
    }
    public void moveCamera(String ciudad){
        switch (ciudad){

            case "Armenia":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.4915063,-75.7848244), 8));
                break;
            case "Barrancabermeja":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(7.0281352,-74.0968496), 8));
                break;
            case "Barranquilla":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(10.9919084,-74.9790926), 8));
                break;
            case "Bogotá" :
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.6486259,-74.2478949), 8));
                break;
            case "Bucaramanga":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(7.165188,-73.1782858), 8));
                break;
            case "Cali":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(3.4109271,-76.7232099), 8));
                break;
            case "Cartago":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.7105041,-75.9893483), 8));
                break;
            case "Cucúta":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(8.0783506,-72.7573961), 8));
                break;
            case "Espinal":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.1694726,-74.9760168), 8));
                break;
            case "Girardot":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.3502469,-74.8866049), 8));
                break;
            case "Ibagué":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.4788663,-75.5238052), 8));
                break;
            case "Manizales":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(5.0744274,-75.6429644), 8));
                break;
            case "Medellin":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(6.268844,-75.6664329), 8));
                break;
            case "Neiva":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(3.036668,-75.5770408), 8));
                break;
            case "Ocaña":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(8.2205071,-73.5302098), 8));
                break;
            case "Palmira":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(3.583537,-76.3616698), 8));
                break;
            case "Pereira":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.7856485,-75.9352642), 8));
                break;
            case "Popayán":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(2.4430307,-76.7184942), 8));
                break;
            case "Santa Marta":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(11.0867009,-74.1842131), 8));
                break;
            case "Tuluá":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.0401819,-76.2066459), 8));
                break;
            case "Valledupar":
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(10.3445182,-74.0183085), 8));
                break;
            default:
                mMapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.0866147,-81.9824823), 4));
                break;
        }

    }
}
