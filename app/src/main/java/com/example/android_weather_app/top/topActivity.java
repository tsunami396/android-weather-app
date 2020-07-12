package com.example.android_weather_app.top;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_weather_app.top.ui.top.TopFragment;

public class topActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TopFragment.newInstance())
                    .commitNow();
        }
    }
}
