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
        Intent intent = new Intent(this,MainActivity2.class);
        String message = "https://www.google.es/";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
    public void llamadaTelf(View view){
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:958112233"));
        startActivity(i);
    }
    public void googleMaps(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        String message = "https://www.google.com/maps";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
    public void tomarFoto(View view){
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }
    public void enviarCorreo(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        String message = "https://www.google.com/intl/es/gmail/about/";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }


}