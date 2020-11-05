package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btnCLicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_on_click);
        textView = findViewById(R.id.tvtext);
        btnCLicked = findViewById(R.id.btn);

        View.OnClickListener oc1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.RED);
            }
        };
        btnCLicked.setOnClickListener(oc1);
    }

    public void btn(View view) {
        textView.setText("Clicked");

    }
}