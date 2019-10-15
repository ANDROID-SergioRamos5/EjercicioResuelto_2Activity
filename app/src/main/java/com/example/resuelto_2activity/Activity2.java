package com.example.resuelto_2activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.activity2);
        texto=(TextView) findViewById(R.id.textView);

        texto.setText(getIntent().getStringExtra("SALIDA"));

    }
}
