package com.repitadossl.ejercicioevaluable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class claseUrl extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.repitadossl.claseUrl.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void enviar(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}