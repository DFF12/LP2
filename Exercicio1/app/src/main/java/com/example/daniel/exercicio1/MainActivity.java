package com.example.daniel.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button calcular;
    TextView txtValorMensal, txtValorInicial, txtTempo, txtTaxa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular = (Button) findViewById(R.id.btnCalcular);
        txtValorMensal = (TextView)findViewById(R.id.txtAplicacaoMensal);
        txtValorInicial = (TextView) findViewById(R.id.txtValorMensal);//Aplicacao inicial
        txtTempo = (TextView)findViewById(R.id.txtMeses);
        txtTaxa = (TextView) findViewById(R.id.txtTaxa);

        calcular.setOnClickListener(calcularValor);
    }
    View.OnClickListener calcularValor = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            float valorFinal = 0, aplicacaoInicial=0, valorMensal=0, taxa=0, valorAux=0;


            int meses = 0;
            meses =(int) Integer.parseInt(txtTempo.getText().toString());

            aplicacaoInicial = (float) Float.parseFloat(txtValorInicial.getText().toString());
            valorMensal = (float) Float.parseFloat(txtValorMensal.getText().toString());
            taxa = (float) Float.parseFloat(txtTaxa.getText().toString());
            for (int i = 0; i< meses; i++) {
                if (i == 0) {
                    valorFinal = aplicacaoInicial;
                    valorAux = valorFinal + (valorFinal) * taxa;
                    valorFinal = valorAux;
                } else {
                    valorAux = valorFinal + ((valorFinal + valorMensal)*taxa);
                    valorFinal = valorAux;
                }

            }

            Toast.makeText(MainActivity.this, "Resultado: "+ valorFinal, Toast.LENGTH_LONG).show();
        }
    };

}
