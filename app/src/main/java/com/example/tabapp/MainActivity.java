package com.example.tabapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);
        setupWithViewPager(viewPager);
    }

    void setupWithViewPager (ViewPager viewPager){
        TabViewPagerAdapter tabViewPagerAdapter = new TabViewPagerAdapter(getSupportFragmentManager());
        tabViewPagerAdapter.addFragment(new Tab1(), "Tab 1");
        tabViewPagerAdapter.addFragment(new Tab2(), "Tab 2");
        tabViewPagerAdapter.addFragment(new Tab3(), "Tab 3");
        viewPager.setAdapter(tabViewPagerAdapter);
    }
}
