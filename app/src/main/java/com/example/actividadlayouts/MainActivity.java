package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irACalculadora(View view) {
        Intent intent = new Intent(view.getContext(), Calculadora.class);
        startActivity(intent);
    }

    public void irALinear(View view) {
        Intent intent = new Intent(view.getContext(), Linear.class);
        startActivity(intent);
    }

    public void irAFrame(View view) {
        Intent intent = new Intent(view.getContext(), Frame.class);
        startActivity(intent);
    }

    public void irARelative(View view) {
        Intent intent = new Intent(view.getContext(), Relative.class);
        startActivity(intent);
    }

    public void irATable(View view) {
        Intent intent = new Intent(view.getContext(), Table.class);
        startActivity(intent);
    }
}