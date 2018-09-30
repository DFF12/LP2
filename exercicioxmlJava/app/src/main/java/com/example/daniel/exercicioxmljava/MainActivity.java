package com.example.daniel.exercicioxmljava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button calcular;
    CheckBox cinco, seis, sete;
    int total = 0, valorCinco =0, valorSeis =0, valorSete = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cinco = (CheckBox) findViewById(R.id.cbCinco);
        seis = (CheckBox) findViewById(R.id.cbSeis);
        sete = (CheckBox) findViewById(R.id.cbSete);
        calcular = (Button) findViewById(R.id.btnCalculat);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cinco.isChecked()) {
                    valorCinco = 5;
                } else {
                    valorCinco = 0;
                }
                if (seis.isChecked()) {
                    valorSeis = 6;
                } else {
                    valorSeis = 0;
                }
                if (sete.isChecked()) {
                    valorSete = 7;
                } else {
                    valorSete = 0;
                }
                total = valorCinco + valorSeis + valorSete;
                Toast.makeText(MainActivity.this, "Total: "+ total, Toast.LENGTH_LONG).show();
            }
        });
    }
    RadioButton radioB;
    radioB
}
