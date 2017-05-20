package com.example.navigationpageviewer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.navigationpageviewer.fragments.FragmentCollection;
import com.example.navigationpageviewer.fragments.FragmentCommunities;
import com.example.navigationpageviewer.fragments.FragmentHome;
import com.example.navigationpageviewer.fragments.FragmentNotification;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView home_tv;
    private TextView collection_tv;
    private TextView notification_tv;
    private TextView communities_tv;

    private FragmentHome home_fragment;
    private FragmentCollection collection_fragment;
    private FragmentNotification notification_fragment;
    private FragmentCommunities communities_fragment;
    private int backgroundPressed = Color.GRAY;
    private int backgroundUnPressed = Color.BLACK;
//    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_fragment = FragmentHome.newInstance();
        collection_fragment = FragmentCollection.newInstance();
        communities_fragment = FragmentCommunities.newInstance();
        notification_fragment = FragmentNotification.newInstance();

        home_tv = (TextView) findViewById(R.id.activity_main_home_tv);
        collection_tv = (TextView) findViewById(R.id.activity_main_collection_tv);
        notification_tv = (TextView) findViewById(R.id.activity_main_notification_tv);
        communities_tv = (TextView) findViewById(R.id.activity_main_communities_tv);

        home_tv.setOnClickListener(this);
        collection_tv.setOnClickListener(this);
        notification_tv.setOnClickListener(this);
        communities_tv.setOnClickListener(this);

        showFragmentHome();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.activity_main_collection_tv:
                showFragmentCollection();
                break;
            case R.id.activity_main_communities_tv:
                showFragmentCommunities();
                break;
            case R.id.activity_main_home_tv:
                showFragmentHome();
                break;
            case R.id.activity_main_notification_tv:
                showFragmentNotification();
                break;
        }
    }

    private void showFragmentNotification() {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (collection_fragment.isAdded()) {
            ft.hide(collection_fragment);
        }
        if (home_fragment.isAdded()) {
            ft.hide(home_fragment);
        }
        if (communities_fragment.isAdded()) {
            ft.hide(communities_fragment);
        }
        if (notification_fragment.isAdded()) {
            ft.show(notification_fragment);
        }
        else {
            ft.add(R.id.activity_main_container, notification_fragment, FragmentNotification.TAG);
        }
        ft.commit();
        home_tv.setBackgroundColor(backgroundUnPressed);
        collection_tv.setBackgroundColor(backgroundUnPressed);
        communities_tv.setBackgroundColor(backgroundUnPressed);
        notification_tv.setBackgroundColor(backgroundPressed);
    }


    private void showFragmentHome() {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (home_fragment.isAdded()) {
            ft.show(home_fragment);
        }else {
            ft.add(R.id.activity_main_container, home_fragment, FragmentHome.TAG);
        }
        if (collection_fragment.isAdded()) {
            ft.hide(collection_fragment);
        }
        if (communities_fragment.isAdded()) {
            ft.hide(communities_fragment);
        }
        if (notification_fragment.isAdded()) {
            ft.hide(notification_fragment);
        }
        ft.commit();
        home_tv.setBackgroundColor(backgroundPressed);
        collection_tv.setBackgroundColor(backgroundUnPressed);
        communities_tv.setBackgroundColor(backgroundUnPressed);
        notification_tv.setBackgroundColor(backgroundUnPressed);
    }

    private void showFragmentCommunities() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (collection_fragment.isAdded()) {
            ft.hide(collection_fragment);
        }
        if (home_fragment.isAdded()) {
            ft.hide(home_fragment);
        }
        if (communities_fragment.isAdded()) {
            ft.show(communities_fragment);
        }
        else {
            ft.add(R.id.activity_main_container, communities_fragment, FragmentCommunities.TAG);
        }
        if (notification_fragment.isAdded()) {
            ft.hide(notification_fragment);
        }
        ft.commit();
        home_tv.setBackgroundColor(backgroundUnPressed);
        collection_tv.setBackgroundColor(backgroundUnPressed);
        communities_tv.setBackgroundColor(backgroundPressed);
        notification_tv.setBackgroundColor(backgroundUnPressed);
    }

    protected void showFragmentCollection() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (collection_fragment.isAdded()) {
            ft.show(collection_fragment);
        } else {
            ft.add(R.id.activity_main_container, collection_fragment, FragmentCollection.TAG);
        }
        if (home_fragment.isAdded()) {
            ft.hide(home_fragment);
        }
        if (communities_fragment.isAdded()) {
            ft.hide(communities_fragment);
        }
        if (notification_fragment.isAdded()) {
            ft.hide(notification_fragment);
        }
        ft.commit();
        home_tv.setBackgroundColor(backgroundUnPressed);
        collection_tv.setBackgroundColor(backgroundPressed);
        communities_tv.setBackgroundColor(backgroundUnPressed);
        notification_tv.setBackgroundColor(backgroundUnPressed);
    }
//    private boolean existHomeFragment() {
//        if(home_fragment == null) {
//            home_fragment = FragmentHome.newInstance();
//        }
//        return true;
//    }
//    private boolean existCollectionFragment(){
//        if(collection_fragment == null){
//            collection_fragment = FragmentCollection.newInstance();
//        }
//        return true;
//    }
//    private boolean existNotificationFragment(){
//        if(notification_fragment == null){
//            notification_fragment = FragmentNotification.newInstance();
//        }
//        return true;
//    }
//    private boolean existCommunitieFragment(){
//        if(communities_fragment == null){
//            communities_fragment = FragmentCommunities.newInstance();
//        }
//        return true;
//    }
}
