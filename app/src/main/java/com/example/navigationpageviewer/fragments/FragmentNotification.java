package com.example.navigationpageviewer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationpageviewer.R;

/**
 * Created by Armen on 5/19/2017.
 */

public class FragmentNotification extends Fragment {
    public static final String TAG = ".fragments.FragmentNotification";

    public FragmentNotification() {}


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("fragment", getClass().getSimpleName() + " onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("fragment", getClass().getSimpleName() + " onCreateView");
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
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

    public static FragmentNotification newInstance() {
        return new FragmentNotification();
    }
}
