package com.foodnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
    private TabLayout tabLayout;
    RestaurantFragment restaurantFragment;
    OrderFragment orderFragment;
    ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("HOME").setIcon(R.drawable.ic_address));
        tabLayout.addTab(tabLayout.newTab().setText("ORDER").setIcon(R.drawable.ic_order));
        tabLayout.addTab(tabLayout.newTab().setText("PROFILE").setIcon(R.drawable.ic_user));
        tabLayout.addOnTabSelectedListener(this);

        restaurantFragment = new RestaurantFragment();
        orderFragment = new OrderFragment();
        profileFragment = new ProfileFragment();
        TabLayout.Tab tab = tabLayout.getTabAt(0);
        tab.select();
        displayFragment(restaurantFragment);
    }

    protected void displayFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.layoutContainer,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition())
        {
            case 0: displayFragment(restaurantFragment);break;
            case 1: displayFragment(orderFragment);break;
            case 2: displayFragment(profileFragment);break;
            default:break;
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
