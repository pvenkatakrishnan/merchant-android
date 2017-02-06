package com.paypal.pvenkatakrishnan.merchant_android;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.paypal.paypal_xo_android.paypalxo;

/**
 * Created by pvenkatakrishnan on 2/3/17.
 */

public class WebClient extends WebViewClient {
    private AppCompatActivity activity;

    public WebClient(AppCompatActivity activity) {
        this.activity = activity;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        final Uri uri = Uri.parse(url);
        return paypalxo.getInstance().handleIfPaypalXO(url, this.activity);

    }

}