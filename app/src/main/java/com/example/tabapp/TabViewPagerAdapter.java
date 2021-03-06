package com.example.tabapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabViewPagerAdapter extends FragmentPagerAdapter {

    private final java.util.List<Fragment> FragmentList = new ArrayList<>();
    private final List<String> FragmentStringTitle = new java.util.ArrayList<>();


    public TabViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return FragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        FragmentList.add(fragment);
        FragmentStringTitle.add(title);
    }
    @Override
    public CharSequence getPageTitle(int position){
        return FragmentStringTitle.get(position);
    }
}
