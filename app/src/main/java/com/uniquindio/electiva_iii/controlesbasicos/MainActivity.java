package com.uniquindio.electiva_iii.controlesbasicos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnNormal;
    private ToggleButton btnToggle;
    private ImageButton btnImagen;
    private Switch btnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImagen = (ImageButton)findViewById(R.id.btn_image);
        btnSwitch= (Switch) findViewById(R.id.btn_switch);

        btnNormal = (Button) findViewById(R.id.btn_normal);
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensaje("bontón básico");
            }
        });

        btnToggle= (ToggleButton)findViewById(R.id.btn_toggle);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnToggle.isChecked()) {
                    mostrarMensaje("encendido");
                } else {
                    mostrarMensaje("apagado");
                }

            }

        });
    }



    private void mostrarMensaje(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == btnImagen.getId()){
            mostrarMensaje("botón imagen");
        }
        if(v.getId() == btnSwitch.getId()){
            if(btnSwitch.isChecked()){
                mostrarMensaje("Switch encendido");
            }
            else{
                mostrarMensaje("Switch apagado");
            }
        }
    }
}
