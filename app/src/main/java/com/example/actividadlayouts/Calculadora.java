package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    TextView numero1leido;
    TextView numero2leido;
    int numero1, numero2;
    int suma;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        numero1leido = (TextView) findViewById(R.id.Numero1);
        numero2leido = (TextView) findViewById(R.id.Numero2);



        res = (TextView) findViewById(R.id.txtResultadoNumero);
    }

    public void accionSumar(View view) {
        numero1 = Integer.parseInt(numero1leido.getText().toString());
        numero2 = Integer.parseInt(numero2leido.getText().toString());
        suma = numero1 + numero2;

      res.setText(String.valueOf(suma));
    }
    public void accionRestar(View view) {
        numero1 = Integer.parseInt(numero1leido.getText().toString());
        numero2 = Integer.parseInt(numero2leido.getText().toString());
        suma = numero1 - numero2;

        res.setText(String.valueOf(suma));
    }

    public void accionMultiplicar(View view) {
        numero1 = Integer.parseInt(numero1leido.getText().toString());
        numero2 = Integer.parseInt(numero2leido.getText().toString());
        suma = numero1 * numero2;

        res.setText(String.valueOf(suma));
    }

    public void accionDividir(View view) {
        numero1 = Integer.parseInt(numero1leido.getText().toString());
        numero2 = Integer.parseInt(numero2leido.getText().toString());
        suma = numero1 / numero2;

        res.setText(String.valueOf(suma));
    }

}