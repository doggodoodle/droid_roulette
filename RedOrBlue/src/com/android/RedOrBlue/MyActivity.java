package com.android.RedOrBlue;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    WebView myWebView;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        myWebView = (WebView)findViewById(R.id.webView);
        myWebView.getSettings().setBuiltInZoomControls(true);

        myWebView.loadUrl("file:///android_asset/start.html");
    }

    public void gamble(View v){
        if(Math.random()>0.5)
            myWebView.loadUrl("file:///android_asset/blue.jpg");
        else{
            myWebView.loadUrl("file:///android_asset/red.jpg");
        }
    }
}
