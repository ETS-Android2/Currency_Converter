package com.example.currencyariel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SterlingPage extends AppCompatActivity {
    //Declaring components
    Button SterlingToEuroButtonJ, EuroToSterlingButtonJ;
    EditText EnterValueETJ;
    TextView ConvertedValueTVJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Transparent navigation bar
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        setContentView(R.layout.activity_sterling_page);

        // Linking buttons to their id's
        SterlingToEuroButtonJ = findViewById(R.id.SterlingToEuroButton);
        EuroToSterlingButtonJ = findViewById(R.id.EuroToSterlingButton);

        // Linking text view and edit text to their id's
        EnterValueETJ = findViewById(R.id.EnterValueET);
        ConvertedValueTVJ = findViewById(R.id.ConvertedValueTV);


        // Converting from Euro to Sterling by pressing the button
        EuroToSterlingButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value * 0.83)); // Conversion

                    // Printing out answer
                    ConvertedValueTVJ.setText("£" + convertedValue + "");

                } catch (Exception e) {

                    // Error message
                    ConvertedValueTVJ.setText("Error! \nTry again.");

                }

            }
        });

        // Converting from Sterling to Euro by pressing the button
        SterlingToEuroButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value / 0.83)); // Conversion

                    // Printing out answer
                    ConvertedValueTVJ.setText("€" + convertedValue + "");

                } catch (Exception e) {

                    // Error message
                    ConvertedValueTVJ.setText("Error! \nTry again.");
                }

            }
        });

    }

}