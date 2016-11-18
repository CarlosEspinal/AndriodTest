package com.example.carlosespinale.siproject;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    final Fragment[] fragments;

    public PagerAdapter(FragmentManager fm, Fragment[] fragmentsArray) {
        super(fm);

        fragments = fragmentsArray;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Fragment" + position;
    }
}
