package com.example.jcalzado.lab3_2_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Condiciones extends AppCompatActivity {

    private TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condiciones);

        saludo = (TextView) findViewById(R.id.saludo);

        Bundle b = getIntent().getExtras();
        String nombre = b.getString("nombre");

        saludo.setText("Hola " + nombre + ", ¿Aceptas las condiciones del servicio?");
    }

    public void aceptarCondiciones (View v) {
        Intent i = new Intent();
        setResult(RESULT_OK,i);
        finish();
    }

    public void rechazarCondiciones (View v) {
        Intent i = new Intent();
        setResult(RESULT_CANCELED,i);
        finish();
    }

}
