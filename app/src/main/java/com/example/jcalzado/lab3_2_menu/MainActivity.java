package com.example.jcalzado.lab3_2_menu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    public void verificar (View v) {
        Intent i = new Intent(this,Condiciones.class);
        i.putExtra("nombre",nombre.getText().toString());
        startActivityForResult(i,0000);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode==0000 && resultCode==RESULT_OK) {
            resultado.setText("El usuario acepta las Condiones del Servicio.");
            resultado.setTextColor(Color.parseColor("#3F51B5"));
        }
        if (requestCode==0000 && resultCode==RESULT_CANCELED) {
            resultado.setText("El usuario rechaza las Condiones del Servicio.");
            resultado.setTextColor(Color.parseColor("#FF4081"));
        }
    }


}
