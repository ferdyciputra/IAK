package com.example.android.justjava;

import java.text.NumberFormat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tombolshare, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombolshare= (TextView)findViewById(R.id.textshare);
        isi= (TextView)findViewById(R.id.texcontent);

        tombolshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);

            }
        });
    }}

