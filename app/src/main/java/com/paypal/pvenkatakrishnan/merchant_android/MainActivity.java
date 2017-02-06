package com.paypal.pvenkatakrishnan.merchant_android;
import com.paypal.paypal_xo_android.paypalxo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import com.paypal.pvenkatakrishnan.merchant_android.WebClient;
import android.content.res.Resources;



import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Resources res = getResources();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView browser = (WebView) findViewById(R.id.webview);
        browser.setWebViewClient(new WebClient(this));
        browser.getSettings().setLoadWithOverviewMode(true);
        browser.getSettings().setUseWideViewPort(true);
        browser.loadUrl("https://paypalmerchant.herokuapp.com/cart");
        paypalxo.getInstance().setWebView(browser, this);
    }
}
