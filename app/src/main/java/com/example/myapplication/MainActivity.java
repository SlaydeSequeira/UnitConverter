package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Spinner spinner;
    private EditText inputEditText;
    private TextView resultTextView;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.dropdown_menu);
        inputEditText = findViewById(R.id.edit);
        resultTextView = findViewById(R.id.text2);
        convertButton = findViewById(R.id.button);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                updateUI(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performConversion();
            }
        });
    }

    private void updateUI(int position) {
        switch (position) {
            case 0: // Data conversion (MB to GB)
                inputEditText.setHint("Enter amount in MB");
                resultTextView.setText("The amount in GB is");
                break;
            case 1: // Distance conversion (KM to miles)
                inputEditText.setHint("Enter amount in KM");
                resultTextView.setText("The amount in miles is");
                break;
            case 2: // Speed conversion (KM/hr to m/s)
                inputEditText.setHint("Enter amount in KM/hr");
                resultTextView.setText("The amount in m/s is");
                break;
            case 3: // Temperature conversion (Celsius to Fahrenheit)
                inputEditText.setHint("Enter temperature in Celsius");
                resultTextView.setText("The temperature in Fahrenheit is");
                break;
        }
    }

    private void performConversion() {
        String input = inputEditText.getText().toString();
        double amount = Double.parseDouble(input);

        int position = spinner.getSelectedItemPosition();
        double result;

        switch (position) {
            case 0: // Data conversion (MB to GB)
                result = convertDataMBToGB(amount);
                break;
            case 1: // Distance conversion (KM to miles)
                result = convertDistanceKMToMiles(amount);
                break;
            case 2: // Speed conversion (KM/hr to m/s)
                result = convertSpeedKMHrToMS(amount);
                break;
            case 3: // Temperature conversion (Celsius to Fahrenheit)
                result = convertTemperatureCToF(amount);
                break;
            default:
                result = 0.0;
                break;
        }

        resultTextView.setText(resultTextView.getText().toString() + " " + result);
    }

    // Helper methods for conversions
    private double convertDataMBToGB(double amount) {
        return amount / 1024;
    }

    private double convertDistanceKMToMiles(double amount) {
        return amount / 1.60934;
    }

    private double convertSpeedKMHrToMS(double amount) {
        return amount / 3.6;
    }

    private double convertTemperatureCToF(double amount) {
        return (amount * 9 / 5) + 32;
    }
}

