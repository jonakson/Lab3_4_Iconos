package com.example.jcalzado.lab3_2_menu;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Preferencias extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Método en desuso!!
        addPreferencesFromResource(R.xml.preferencias);
    }
}
