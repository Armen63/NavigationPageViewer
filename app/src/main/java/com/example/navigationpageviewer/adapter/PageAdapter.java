package com.example.navigationpageviewer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.navigationpageviewer.tabs.Tab1;
import com.example.navigationpageviewer.tabs.Tab2;
import com.example.navigationpageviewer.tabs.Tab3;

/**
 * Created by Armen on 5/20/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    int countOfTabs;

    public PageAdapter(FragmentManager fm, int countOfTabs) {
        super(fm);
        this.countOfTabs = countOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countOfTabs;
    }
}
