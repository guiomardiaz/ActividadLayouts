package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Relative extends AppCompatActivity {
    Button O, NO, SO, N,S,C, NE, SE, E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        O = findViewById(R.id.btnO);
        NO = findViewById(R.id.btnNO);
        SO = findViewById(R.id.btnSO);
        N = findViewById(R.id.btnN);
        C = findViewById(R.id.btnC);
        S = findViewById(R.id.btnS);
        NE = findViewById(R.id.btnNE);
        SE = findViewById(R.id.btnSE);
        E = findViewById(R.id.btnE);


    }

    public void accionO(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), O.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionNO(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), NO.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionSO(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), SO.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionN(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), N.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionC(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), C.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionS(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), S.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionNE(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), NE.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionSE(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), SE.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
    public void accionE(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), E.getText().toString(), Toast.LENGTH_SHORT);
        mensaje.show();
    }
}