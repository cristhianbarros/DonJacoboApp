package com.donjacoboapp;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.donjacoboapp.fragments.DialogContactFragment;
import com.donjacoboapp.fragments.HelpFragment;
import com.donjacoboapp.fragments.MagazineFragment;
import com.donjacoboapp.fragments.MainProductsFragment;
import com.donjacoboapp.fragments.OurCatalogsFragment;
import com.donjacoboapp.fragments.news_events.NewsEventsFragment;
import com.donjacoboapp.fragments.us_fragment.UsFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private android.support.v4.app.Fragment fragment;
    public static android.app.FragmentManager hola;

    FragmentManager mFragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        hola = getFragmentManager();
        if(savedInstanceState == null) {
            fragment = new MainProductsFragment();
            mFragmentManager.beginTransaction()
                    .add(R.id.main_fragment, fragment)
                    .commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
         boolean TransactionFragment = false;

        if (id == R.id.home) {
            TransactionFragment= true;
            fragment = new MainProductsFragment();
            // Handle the camera action
        } else if (id == R.id.newsEvent) {
            TransactionFragment= true;
            fragment = new NewsEventsFragment();
        }  else if (id == R.id.us) {
            TransactionFragment = true;
            fragment = new UsFragment();
        } else if (id == R.id.contact) {
            DialogContactFragment contactFragment = new DialogContactFragment();
            contactFragment.show(getFragmentManager(),"hasdkj");

        }
        else if (id == R.id.Help){
            TransactionFragment= true;
            fragment = new HelpFragment();
        }


        if(TransactionFragment){
            mFragmentManager.beginTransaction()
                    .replace(R.id.main_fragment, fragment)
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

}
