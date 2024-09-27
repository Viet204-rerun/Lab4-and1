package com.example.lab4_ph32598.lab4;

import androidx.activity.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lab4_ph32598.R;

public class bai1 extends ComponentActivity {
    TextView tv1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        tv1 = findViewById(R.id.tv3);
        btn1 = findViewById(R.id.btn1);
        Log.i("Trang thai","onCreat");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bai1.this,bai1_2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Trang thai","onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Trang thai","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Trang thai","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Trang thai","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Trang thai","onDestroy");

    }
}