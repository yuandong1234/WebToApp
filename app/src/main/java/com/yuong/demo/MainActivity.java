package com.yuong.demo;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate().....");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart().....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart().....");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState().....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume().....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause().....");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState().....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop().....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy().....");
    }

    private void initView() {
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(Uri.parse("app://app.yuong.com"));
                intent.putExtra("load_url", "www.yuong.com");
                Log.e(TAG, "URL : " + intent.toURI());
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "onConfigurationChanged().....");
    }
}
