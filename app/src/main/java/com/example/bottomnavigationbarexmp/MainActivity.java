package com.example.bottomnavigationbarexmp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private TextView helloWorldTV;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldTV = findViewById(R.id.helloWorldTV);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.action_search)
                    helloWorldTV.setText(R.string.menu_search);
                if (item.getItemId() == R.id.action_settings)
                    helloWorldTV.setText(R.string.menu_settings);
                if (item.getItemId() == R.id.action_navigation)
                    helloWorldTV.setText(R.string.menu_navigation);

                return true;
            }
        });
    }
}