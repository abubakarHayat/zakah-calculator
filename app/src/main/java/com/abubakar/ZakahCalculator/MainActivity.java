package com.abubakar.ZakahCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcZakah(View view){
        EditText editTextGR = findViewById(R.id.editTxtGoldRate);
        EditText editTextTA = findViewById(R.id.editTxtTotalAssets);
        TextView txtShowAmount = findViewById(R.id.txtViewShowAmount);
        int currentGoldRate = Integer.parseInt(editTextGR.getText().toString());
        int totalAssetsValue = Integer.parseInt(editTextTA.getText().toString());
        int nisabRate = currentGoldRate*85;
        double zakahAmount = 0.0;
        if(nisabRate <= totalAssetsValue){
            zakahAmount = (2.5/100)*totalAssetsValue;
        }
        txtShowAmount.setText(Double.toString(zakahAmount));
    }
}