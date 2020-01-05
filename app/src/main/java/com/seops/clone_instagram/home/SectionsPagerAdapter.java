package com.seops.clone_instagram.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "SelectionPagerAdapter";

    private final List<Fragment> mFragemntList = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragemntList.get(position);
    }

    @Override
    public int getCount() {
        return mFragemntList.size();
    }

    public void addFragment(Fragment fragment) {
        mFragemntList.add(fragment);
    }
}
