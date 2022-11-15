package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Linear extends AppCompatActivity {
    RadioButton rd1, rd2, rd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        rd1 = findViewById(R.id.Opcion1);
        rd2 = findViewById(R.id.Opcion2);
        rd3 = findViewById(R.id.Opcion3);
    }

    public void radio1(View view) {
        rd2.setEnabled(false);
        rd3.setEnabled(false);

    }

    public void radio2(View view) {
        rd1.setEnabled(false);
        rd3.setEnabled(false);
    }

    public void radio3(View view) {
        rd2.setEnabled(false);
        rd1.setEnabled(false);
    }

    public void accionestrella(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), "Añadido a favoritos", Toast.LENGTH_SHORT);
        mensaje.show();
    }

    public void accionvoz(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), "Audio grabado", Toast.LENGTH_SHORT);
        mensaje.show();
    }

    public void accionbloquear(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), "Bloqueado", Toast.LENGTH_SHORT);
        mensaje.show();
    }
}