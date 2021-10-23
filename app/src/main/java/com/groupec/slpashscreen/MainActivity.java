package com.groupec.slpashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Setting the AppTheme to display the activity
        setTheme(R.style.Theme_SLPASHSCREEN);
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}