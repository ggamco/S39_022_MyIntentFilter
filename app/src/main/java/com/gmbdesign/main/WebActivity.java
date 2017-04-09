package com.gmbdesign.main;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        //recuperamos el intent y rescatamos el data.
        Intent intent = getIntent();
        Uri uri = intent.getData();

        WebView webView = (WebView) findViewById(R.id.myWebViewer);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(uri.toString());

    }
}
