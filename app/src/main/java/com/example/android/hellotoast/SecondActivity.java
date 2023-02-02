package com.example.android.hellotoast;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView countShow;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        countShow=(TextView) findViewById(R.id.counter_textView);
        String value = getIntent().getStringExtra("key");
        countShow.setText(value);


    }
    @Override
    public boolean onSupportNavigateUp() {
        // Handle back button press
        finish();
        return true;
    }
}