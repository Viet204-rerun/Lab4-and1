package com.example.lab4_ph32598.lab4;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.lab4_ph32598.R;

public class bai1_2 extends ComponentActivity {
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai12);
        btn2= findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bai1_2.this,bai1.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Trang thai","onStart2");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Trang thai","onPause2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Trang thai","onResume2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Trang thai","onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Trang thai","onDestroy2");

    }
}