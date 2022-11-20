package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("For second commit!!!");
        System.out.println("Error code");
        System.out.println("Code in demo branch");
        System.out.println("Change in demo");
        System.out.println("Change in demo2");
    }
}