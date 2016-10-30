package com.venkatkamesh.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class assets extends AppCompatActivity {
    WebView webview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assets);
        webview1 =(WebView)findViewById(R.id.webview1);
        webview1.getSettings().setBuiltInZoomControls(true);
        webview1.loadUrl("file:///android_asset/web/Google.html");
    }
}
