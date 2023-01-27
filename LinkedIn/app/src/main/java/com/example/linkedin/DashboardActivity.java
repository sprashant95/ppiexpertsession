package com.example.linkedin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        loadFragment(new HomeFragment());

        bottomNavigationView = findViewById(R.id.mynavigation);
        frameLayout = findViewById(R.id.myframelayout);

    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.myframelayout,fragment);
        ft.commit();
    }

    @Override
    public boolean  onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.home:
                loadFragment(new HomeFragment());
                break;
            case R.id.news:
                loadFragment(new NewsFragment());
                break;
            case R.id.jobs:
                loadFragment(new NewsFragment());
                break;
            case R.id.settings:
                loadFragment(new NewsFragment());
                break;
            case R.id.post:
                loadFragment(new NewsFragment());
                break;

        }
        return true;
    }
}