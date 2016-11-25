package com.example.ernesto.beep;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ernesto on 23/11/16.
 */
public class InterfazCita extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfazcita);
    }

    public void mostrarMapa(View view){
        setContentView(R.layout.activity_maps);
    }

}
