package ru.teslaworking.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.Window;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        Window w = getWindow();
        w.setStatusBarColor(Color.rgb(17,18,24));
        w.setNavigationBarColor(Color.rgb(17,18,24));
        WebView view = new WebView(this);
        view.setBackgroundColor(Color.rgb(17,18,24));
        WebSettings settings = view.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        view.setWebChromeClient(new WebChromeClient());
        setContentView(view);
        view.loadUrl("file:///android_asset/index.html");
    }
}
