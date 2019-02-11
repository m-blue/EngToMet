package com.example.engtomet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView resultString = (TextView)findViewById(R.id.txtResult);
        final EditText number = (EditText)findViewById(R.id.txtNumber);
        final Spinner group = (Spinner)findViewById(R.id.spnGroup);
        Button convert = (Button)findViewById(R.id.btnConvert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numberDouble = Double.parseDouble(number.getText().toString());
                if(group.getSelectedItemPosition() == 0){
                    MilesToKilo(numberDouble);
                    resultString.setText(result + " Kilometers");
                }
                else if(group.getSelectedItemPosition() == 1){
                    GalleonToLiters(numberDouble);
                    resultString.setText(result + " Liters");
                }
                else if(group.getSelectedItemPosition() == 2){
                    PoundsToKilo(numberDouble);
                    resultString.setText(result + " Kilograms");
                }
                else if(group.getSelectedItemPosition() == 3){
                    InchesToCent(numberDouble);
                    resultString.setText(result + " Centimeters");
                }


            }
        });
    }

    void MilesToKilo(double _number){
        result = _number * 1.609344;
    }
    void GalleonToLiters(double _number){
        result = _number * 3.78541;
    }
    void PoundsToKilo(double _number){
        result = _number * 0.453592;
    }
    void InchesToCent(double _number){
        result = _number * 2.54;
    }
}
