package com.example.currencyariel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationBarItemView;

public class BRLPage extends AppCompatActivity {
    // Declare components
    Button EuroToBRLButtonJ, BRLToEuroButtonJ;
    EditText EnterValueETJ;
    TextView ConvertedValueTVJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brl_page);

        // Transparent navigation bar
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        // Linking buttons to their id's
        EuroToBRLButtonJ = findViewById(R.id.EuroToBRLButton);
        BRLToEuroButtonJ = findViewById(R.id.BRLToEuroButton);

        // Linking text view and edit text to their id's
        EnterValueETJ = findViewById(R.id.EnterValueET);
        ConvertedValueTVJ = findViewById(R.id.ConvertedValueTV);

        // Converting Euro to BRL by pressing button
        EuroToBRLButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value * 6.35)); // Conversion

                    // Printing out answer
                    ConvertedValueTVJ.setText("R$" + convertedValue + "");

                } catch (Exception e) {

                    // Error message
                    ConvertedValueTVJ.setText("Error! \nTry again.");

                }

            }
        });

        // Converting BRL to Euro by pressing button
        BRLToEuroButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Making sure input is valid
                try {

                    // Getting number from editText
                    double value = Double.parseDouble(EnterValueETJ.getText().toString());
                    String convertedValue = String.format("%.2f", (value / 6.35)); // Conversion

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