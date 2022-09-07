package com.chakraborty.bkash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView bbird;
    Button button2;
    TextView bkash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bbird = findViewById(R.id.bbird);
        button2 = findViewById(R.id.button2);
        bkash = findViewById(R.id.bkash);

        bbird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bbird.setVisibility(View.VISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(myIntent);
            }
        });

    }
}