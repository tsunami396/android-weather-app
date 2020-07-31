package com.example.android_weather_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_weather_app.api.WeatherApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            WeatherApi weatherApi = new WeatherApi();
            System.out.println("------------------------------");
            System.out.println("テスト:" + weatherApi.testApi());
            System.out.println("------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
