package com.example.examen02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class HomeActivity extends AppCompatActivity {
    private Button snackbarButton;
    private Button dialogButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        snackbarButton = findViewById(R.id.snackbar_btn);
        dialogButton = findViewById(R.id.dialog_btn);
        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "He clickeado el boton del Snackbar", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("Okay", new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //
                    }
                });
                snackbar.show();
            }
        });

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(HomeActivity.this);
                builder.setTitle("Alerta Dialogo");
                builder.setMessage("Solo es una simple alterta");
                builder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.setNegativeButton("Rechazar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.show();
            }
        });
    }
}