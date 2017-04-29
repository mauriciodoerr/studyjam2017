package com.example.mauricio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button btnOla;
    private TextView tviText;
    private EditText eteMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tviText = (TextView) findViewById(R.id.tvi_text);
        btnOla = (Button) findViewById(R.id.btn_ola);
        eteMessage = (EditText) findViewById(R.id.ete_text);

        btnOla.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = eteMessage.getText().toString();
                tviText.setText(message);
            }
        });
    }
}
