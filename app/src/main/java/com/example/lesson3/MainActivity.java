package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etText;
    TextView textView;
    Button btnCLicked;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_on_click);

        etText = findViewById(R.id.etText);
        textView = findViewById(R.id.tvtext);
        btnCLicked = findViewById(R.id.btn);

        btnCLicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = etText.getText().toString();
                textView.setText(str);
            }
        });


    }



    }
