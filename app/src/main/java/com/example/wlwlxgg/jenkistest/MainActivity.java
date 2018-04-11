package com.example.wlwlxgg.jenkistest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        if (BuildConfig.API_ENVIRONMENT.equals("local")) {
            textView.setText("本地" + BuildConfig.VERSION_NAME);
        } else if (BuildConfig.API_ENVIRONMENT.equals("pro")) {
            textView.setText("生产环境" + BuildConfig.VERSION_NAME);
        } else if (BuildConfig.API_ENVIRONMENT.equals("dev")) {
            textView.setText("开发环境" + BuildConfig.VERSION_NAME);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
