package com.example.currencyariel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RupeePage extends AppCompatActivity {

    // Declare components
    EditText EnterValueETJ;
    TextView ConvertedValueTVJ;
    Button EuroToRupeeButtonJ, RupeeToEuroButtonJ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupee_page);

        // Transparent navigation bar
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Linking editText ti its id's
        EnterValueETJ = findViewById(R.id.EnterValueET);

        // Linking textView to its id's
        ConvertedValueTVJ = findViewById(R.id.ConvertedValueTV);

        // Linking buttons to their id's
        EuroToRupeeButtonJ = findViewById(R.id.EuroToRupeeButton);
        RupeeToEuroButtonJ = findViewById(R.id.RupeeToEuroButton);

        // Converting Euro to Rupee by pressing the button
        EuroToRupeeButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value * 85.06)); // Conversion

                    // Printing out answer
                    ConvertedValueTVJ.setText("₹" + convertedValue + "");

                } catch (Exception e) {

                    // Error message
                    ConvertedValueTVJ.setText("Error! \nTry again.");

                }
            }
        });

        // Converting Rupee to Euro by pressing the button
        RupeeToEuroButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value / 85.06)); // Conversion

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