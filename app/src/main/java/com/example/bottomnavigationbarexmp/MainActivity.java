package com.example.bottomnavigationbarexmp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    //private TextView helloWorldTV;
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //helloWorldTV = findViewById(R.id.helloWorldTV);
        frameLayout = findViewById(R.id.frameLayout);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.action_search) {
                    //helloWorldTV.setText(R.string.menu_search);
                    Log.d("Nothing", "Nothing");
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(R.id.frameLayout, FragmentOne.class, null)
                            .setReorderingAllowed(true)
                            .addToBackStack(null)
                            .commit();
                }
                if (item.getItemId() == R.id.action_settings)
                    //helloWorldTV.setText(R.string.menu_settings);
                    Log.d("Nothing", "Nothing");
                if (item.getItemId() == R.id.action_navigation)
                    //helloWorldTV.setText(R.string.menu_navigation);
                    Log.d("Nothing", "Nothing");

                return true;
            }
        });
    }
}