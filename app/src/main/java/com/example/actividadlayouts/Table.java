package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Table extends AppCompatActivity {


    String salida = "";
    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        texto = findViewById(R.id.txt1);
    }

    public void boton1(View view) {
        salida = salida + "1";
        texto.setText(salida);
    }

    public void boton2(View view) {
        salida = salida + "2";
        texto.setText(salida);
    }
    public void boton3(View view) {
        salida = salida + "3";
        texto.setText(salida);
    }public void boton4(View view) {
        salida = salida + "4";
        texto.setText(salida);
    }public void boton5(View view) {
        salida = salida + "5";
        texto.setText(salida);
    }
    public void boton6(View view) {
        salida = salida + "6";
        texto.setText(salida);
    }
    public void boton7(View view) {
        salida = salida + "7";
        texto.setText(salida);
    }public void boton8(View view) {
        salida = salida + "8";
        texto.setText(salida);
    }public void boton9(View view) {
        salida = salida + "9";
        texto.setText(salida);
    }
    public void boton0(View view) {
        salida = salida + "0";
        texto.setText(salida);
    }




}