package com.example.resuelto_2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nombre;
    Button saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.editText);
        saludo=(Button)findViewById(R.id.button);
        saludo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.button)
        {
            Intent intento = new Intent(this,Activity2.class);

            intento.putExtra("SALIDA", "Hola " + nombre.getText());
            startActivity(intento);
        }
    }
}
