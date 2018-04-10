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
        if (BuildConfig.ApiEnvironment.equals("local")) {
            textView.setText("本地");
        } else if (BuildConfig.ApiEnvironment.equals("pro")) {
            textView.setText("生产环境");
        } else if (BuildConfig.ApiEnvironment.equals("dev")) {
            textView.setText("开发环境");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
