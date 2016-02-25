package com.mis49m.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String PARAM_KEY = "sum";
    TextView tvSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvSum = (TextView)findViewById(R.id.tvSum);

        Intent intent = getIntent();
        String sum = intent.getStringExtra(PARAM_KEY);

        tvSum.setText(sum);
    }
}
