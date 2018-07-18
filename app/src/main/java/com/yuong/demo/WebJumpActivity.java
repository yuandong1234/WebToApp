package com.yuong.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class WebJumpActivity extends AppCompatActivity {
    private static String TAG = WebJumpActivity.class.getSimpleName();

    /**
     * 网页打开App 两种方式：
     * 1：Custom Scheme URI  app://app.yuong.com?load_url=www.yuong.com
     * <p>
     * 2：Intent-based URI  app://app.yuong.com#Intent;action=android.intent.action.VIEW;
     * category=android.intent.category.DEFAULT;category=android.intent.category.BROWSABLE;S.load_url=www.yuong.com;end
     */
    // app://app.yuong.com?load_url=www.yuong.com
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_jump);
        Intent intent = getIntent();
        Log.e(TAG, "-----------------第一种方式------------------");

        Uri uri = intent.getData();
        if (uri != null) {
            Log.e(TAG, "url : " + uri.toString());
            String value = uri.getQueryParameter("load_url");
            Log.e(TAG, "load_url : " + value);
        }
        Log.e(TAG, "-----------------第二种方式------------------");
        Log.e(TAG, "intent base uri  : " + intent.toURI());
        Log.e(TAG, "data : " + intent.getDataString());

        Log.e(TAG, "is exist  load_url : " + intent.hasExtra("load_url"));
        Log.e(TAG, "load_url : " + intent.getStringExtra("load_url"));

    }
}
