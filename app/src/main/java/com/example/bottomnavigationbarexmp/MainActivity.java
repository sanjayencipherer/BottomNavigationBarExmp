package com.example.bottomnavigationbarexmp;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.setReorderingAllowed(true);

            if (item.getItemId() == R.id.action_search) {
                fragmentTransaction.replace(R.id.frameLayout, FragmentSearch.class, null);
            }
            if (item.getItemId() == R.id.action_settings) {
                fragmentTransaction.replace(R.id.frameLayout, FragmentSettings.class, null);
            }
            if (item.getItemId() == R.id.action_navigation) {
                fragmentTransaction.replace(R.id.frameLayout, FragmentNavigation.class, null);
            }

            fragmentTransaction.commit();
            return true;
        });
    }
}