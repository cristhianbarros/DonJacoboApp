package com.donjacoboapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.manager.SupportRequestManagerFragment;
import com.donjacoboapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainProductsFragment extends Fragment {

    private static int int_items = 13;
    public static ViewPager viewPager;
    public MainProductsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_main_products, container, false);
        viewPager = (ViewPager) v.findViewById(R.id.pager);
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));
        return v;
    }


    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0: return new HomeFragment();
                case 1: return new GenovesaProductsFragment();
                case 2: return new CobitosProductsFragment();
                case 3: return new JacobinosProductsFragment();
                case 4: return new PostresProductsFragment();
                case 5: return new TortasChocolateProductsFragment();
                case 6: return new TortasFriasProductsFragment();
                case 7: return new TortasDulcesProductsFragment();
                case 8: return new ColombiaProductsFragment();
                case 9: return new AccesoriosProductsFragment();
                case 10:return new NavidadProductsFragment();
                case 11:return new TresLechesProductsFragment();
                case 12:return new OtrosProductsFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return int_items;
        }
        /**
         * This method returns the title of the tab according to the position.
         */
        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }
    }

}
