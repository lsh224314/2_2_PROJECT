package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by 이세희 on 2017-12-05.
 */

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    public WebView WebVIew1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment, container, false);

        WebVIew1 = (WebView) view.findViewById(R.id.webView01);

        WebVIew1.loadUrl("http://www.google.com");



        WebSettings webSettings = WebVIew1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebVIew1.setWebViewClient(new WebViewClient());


        return view;
    }
}