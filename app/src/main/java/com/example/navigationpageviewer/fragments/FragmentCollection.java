package com.example.navigationpageviewer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationpageviewer.R;
import com.example.navigationpageviewer.adapter.PageAdapter;

/**
 * Created by Armen on 5/19/2017.
 */

public class FragmentCollection extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private PageAdapter pageAdapter;
    public static final String TAG = ".fragments.FragmentCollection";
    private static final String KEY_STRING_EXTRA = "str";


    public FragmentCollection() {}

    public static FragmentCollection newInstance(){
        return  new FragmentCollection();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("fragment", getClass().getSimpleName() + " onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("fragment", getClass().getSimpleName() + " onCreateView");
        View view = inflater.inflate(R.layout.fragment_collection, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.fragment_collection_tabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.fragment_collection_viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        pageAdapter = new PageAdapter(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        tabLayout.setOnTabSelectedListener (new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("fragment", getClass().getSimpleName() + " onViewCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragment", getClass().getSimpleName() + " onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment", getClass().getSimpleName() + " onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment", getClass().getSimpleName() + " onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("fragment", getClass().getSimpleName() + " onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("fragment", getClass().getSimpleName() + " onDestroyView");
    }
}
