package com.example.currencyariel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Declare buttons
    Button SterlingButtonJ, BRLButtonJ, DollarButtonJ, RupeeButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Transparent navigation bar
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Link buttons to their id's
        SterlingButtonJ = findViewById(R.id.SterlingButton);
        BRLButtonJ = findViewById(R.id.BRLButton);
        DollarButtonJ = findViewById(R.id.DollarButton);
        RupeeButtonJ = findViewById(R.id.RupeeButton);

        // Opening Sterling activity
        SterlingButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SterlingPage.class));
                // Transition into Sterling page
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        // Opening BRL activity
        BRLButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BRLPage.class));
                // Transition into BRL page
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        // Opening Dollar activity
        DollarButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DollarPage.class));
                // Transition into Dollar page
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        // Opening Rupee activity
        RupeeButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RupeePage.class));
                // Transition into Ruppe page
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

    }

}