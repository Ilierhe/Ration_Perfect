package com.example.ration_perfect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView rp1;
    TextView rp2;
    TextView rp3;
    TextView rp4;
    TextView rp5;
    TextView rp6;
    TextView rp7;
    TextView rp8;
    TextView rp9;
    TextView rp10;
    TextView rp11;
    TextView rp12;
    TextView rp13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rp1=findViewById(R.id.p1);
        rp1.setText(getIntent().getStringExtra("p1")+" гр.");
        rp2=findViewById(R.id.p2);
        rp2.setText(getIntent().getStringExtra("p2")+" гр.");
        rp3=findViewById(R.id.p3);
        rp3.setText(getIntent().getStringExtra("p3")+" гр.");
        rp4=findViewById(R.id.p4);
        rp4.setText(getIntent().getStringExtra("p4")+" гр.");
        rp5=findViewById(R.id.p5);
        rp5.setText(getIntent().getStringExtra("p5")+" гр.");
        rp6=findViewById(R.id.p6);
        rp6.setText(getIntent().getStringExtra("p6")+" гр.");
        rp7=findViewById(R.id.p7);
        rp7.setText(getIntent().getStringExtra("p7")+" гр.");
        rp8=findViewById(R.id.p8);
        rp8.setText(getIntent().getStringExtra("p8")+" гр.");
        rp9=findViewById(R.id.p9);
        rp9.setText(getIntent().getStringExtra("p9")+" гр.");
        rp10=findViewById(R.id.p10);
        rp10.setText(getIntent().getStringExtra("p10")+" гр.");
        rp11=findViewById(R.id.p11);
        rp11.setText(getIntent().getStringExtra("p11")+" гр.");
        rp12=findViewById(R.id.p12);
        rp12.setText(getIntent().getStringExtra("p12")+" гр.");
        rp13=findViewById(R.id.p13);
        rp13.setText(getIntent().getStringExtra("p13")+" гр.");

    }
}