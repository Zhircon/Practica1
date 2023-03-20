package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = this;
        Button buttonConvert = findViewById(R.id.buttonConvert);
        TextView textViewResult = findViewById(R.id.textViewResult);
        EditText editTextGrades = findViewById(R.id.editTextGrades);
        SwitchMaterial switchConvertToCelcius = findViewById(R.id.switchConvertToCelsius);
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextGrades.getText().length()!=0){
                    String stringGrades = String.valueOf(editTextGrades.getText());
                    double doubleGrades = Double.parseDouble(stringGrades);
                    double result = 0;
                    String charGrades = "";
                    if(switchConvertToCelcius.isChecked()){
                        result= TempConversor.ConvertToCelcius(doubleGrades);
                        charGrades = " ºC";
                    }else{
                        result= TempConversor.ConvertToFarenheit(doubleGrades);
                        charGrades = " ºF";
                    }
                    textViewResult.setText("Es resultado: "+result+charGrades);
                }else{
                    Toast.makeText(context,getResources().getString(R.string.request_input_text),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}