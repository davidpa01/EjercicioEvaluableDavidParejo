package com.repitadossl.ejercicioevaluable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class correo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);
    }


    public void mandarCorreo(View view){
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName5);
        EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName6);
        EditText editText3 = (EditText) findViewById(R.id.editTextTextPersonName7);
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, editText2.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT, editText3.getText().toString());
        i.putExtra(Intent.EXTRA_EMAIL, new String[] {""+editText.getText().toString()});
        startActivity(i);
    }

}