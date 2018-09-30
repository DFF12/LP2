package com.example.daniel.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCalcular;
    TextView txtTotal, txtCusto, txtConta, txtMetade, txtPessoas, txtTaxa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        txtCusto = (TextView) findViewById(R.id.txtCusto);
        txtConta = (TextView) findViewById(R.id.txtConta);
        txtMetade = (TextView) findViewById(R.id.txtMetade);
        txtPessoas = (TextView) findViewById(R.id.txtPessoas);
        txtTaxa = (TextView) findViewById(R.id.txtTaxa);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float total=0, metade=0, valorPessoa =0 ;
                total = Float.parseFloat(txtConta.getText().toString())*(1 + Float.parseFloat(txtTaxa.getText().toString())/100) + Float.parseFloat(txtCusto.getText().toString());
                txtTotal.setText(""+total);

                metade = total / Integer.parseInt(txtPessoas.getText().toString());
                txtMetade.setText(""+metade);

            }
        });
    }

}
