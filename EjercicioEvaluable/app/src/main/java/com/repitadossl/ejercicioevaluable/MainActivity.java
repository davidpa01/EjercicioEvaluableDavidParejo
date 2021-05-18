package com.repitadossl.ejercicioevaluable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.repitadossl.MainActivity.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void paginaWeb(View view){
        Intent intent = new Intent(this,claseUrl.class);
        startActivity(intent);
    }
    public void llamadaTelf(View view){
        Intent intent = new Intent(this,llamadaTelf.class);
        startActivity(intent);
    }
    public void googleMaps(View view){
        Intent intent = new Intent(this,coordenadas.class);
        startActivity(intent);
    }
    public void tomarFoto(View view){
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
    public void enviarCorreo(View view){
        Intent intent = new Intent(this,correo.class);
        startActivity(intent);
    }


}