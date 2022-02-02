package com.example.currencyariel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DollarPage extends AppCompatActivity {

    // Declare components
    Button EuroToDollarButtonJ, DollarToEuroButtonJ;
    EditText EnterValueETJ;
    TextView ConvertedValueTVJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Transparent navigation bar
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        setContentView(R.layout.activity_dollar_page);

        // Link buttons to their id's
        EuroToDollarButtonJ = findViewById(R.id.EuroToDollarButton);
        DollarToEuroButtonJ = findViewById(R.id.DollarToEuroButton);

        // Linking EditText to its id
        EnterValueETJ = findViewById(R.id.EnterValueET);

        // Linking TextView to its id
        ConvertedValueTVJ = findViewById(R.id.ConvertedValueTV);


        // Converting Euro to Dollar
        EuroToDollarButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value * 1.15)); // Conversion

                    // Printing out answer
                    ConvertedValueTVJ.setText("$" + convertedValue + "");

                } catch (Exception e) {

                    // Error message
                    ConvertedValueTVJ.setText("Error! \nTry again.");

                }

            }
        });

        // Converting from Dollar to Euro
        DollarToEuroButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value / 1.15)); // Conversion

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