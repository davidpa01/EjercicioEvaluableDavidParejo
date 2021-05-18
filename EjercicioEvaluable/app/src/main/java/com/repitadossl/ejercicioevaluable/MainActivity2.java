package com.repitadossl.ejercicioevaluable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(claseUrl.EXTRA_MESSAGE);
        message.toCharArray();

        WebView webView = findViewById(R.id.web);

        webView.setWebViewClient(new WebViewClient());

        if(message.contains("https://www.") && (message.contains(".es") || message.contains(".com"))){
            webView.loadUrl(message);
        }else{
            webView.loadUrl("https://www.google.com/search?q=" + message);
        }




    }
}