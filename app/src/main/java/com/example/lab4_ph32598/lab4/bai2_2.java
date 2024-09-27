package com.example.lab4_ph32598.lab4;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab4_ph32598.R;

public class bai2_2 extends ComponentActivity {
    TextView tv6;
    EditText edt;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai22);
        tv6 = findViewById(R.id.tv6);
        edt = findViewById(R.id.edt2);
        btn = findViewById(R.id.btn4);
        Intent intent = getIntent();
        String tensp = intent.getStringExtra("formac1");
        tv6.setText(tensp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                Bundle bundle = new Bundle();
                bundle.putString("Formac2",edt.getText().toString());
                intent.putExtras(bundle);
                setResult(2,intent);
                finish();
            }
        });
    }
}