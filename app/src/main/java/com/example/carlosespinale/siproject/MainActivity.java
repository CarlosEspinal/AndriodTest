package com.example.carlosespinale.siproject;

import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    ViewPager viewPager;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        viewPager = (ViewPager) findViewById(R.id.view_pager);

        setupViewPager();

        tabLayout.setupWithViewPager(viewPager);

    }


    private void setupViewPager(){
        PagerAdapter pagerAdapter= new PagerAdapter(getSupportFragmentManager(),
                new android.support.v4.app.Fragment[]{new MainFragment(), new SecoundFragment(), new ThirdFragment()});

        viewPager.setAdapter(pagerAdapter);
    }
}
