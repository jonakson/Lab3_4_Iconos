package com.example.jcalzado.lab3_2_menu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    // Lanzamiento de la Activity de las condiciones.
    public void verificar (View v) {
        Intent i = new Intent(this,Condiciones.class);
        i.putExtra("nombre",nombre.getText().toString());
        startActivityForResult(i,0000);
    }

    // Capturar la respuesta de aceptación o rechazo de las condiciones.
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

    // Añadimos el menú a la Main_Activity.
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    // Ejecutamos la opción seleccionada en el menú.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.acercaDe) {
            lanzarAcercaDe();
            return true;
        }
        if (id == R.id.preferencias) {
            lanzarPreferencias();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Lanzar Activity Acerca de...
    public void lanzarAcercaDe () {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }

    // Lanzar Activity Preferencias.
    public void lanzarPreferencias () {
        Intent i = new Intent(this, Preferencias.class);
        startActivity(i);
    }

}