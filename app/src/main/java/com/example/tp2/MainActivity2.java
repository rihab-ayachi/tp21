package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 =(TextView) findViewById(R.id.textView2);
        String name = getIntent().getStringExtra("name");
        textView2.setText(name);
    }
}