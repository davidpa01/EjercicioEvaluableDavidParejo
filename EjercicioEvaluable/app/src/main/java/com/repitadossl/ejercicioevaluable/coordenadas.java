package com.repitadossl.ejercicioevaluable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class coordenadas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordenadas);
    }

    public void enviarCoor(View view){
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName4);

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + editText + ", " + editText2));
        startActivity(i);
    }
}