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

public class Bai2 extends ComponentActivity {
    EditText edt1;
    Button btn3;
    TextView tv5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        edt1 = findViewById(R.id.edt1);
        btn3 = findViewById(R.id.btn3);
        tv5 = findViewById(R.id.tv5);
        ActivityResultLauncher<Intent> getData = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                     if(result.getResultCode()==2){
                         Intent intent = result.getData();
                         Bundle bundle = intent.getExtras();
                         String data = bundle.getString("Formac2");
                         tv5.setText(data);
                         bundle.putString("formac1",edt1.getText().toString());
                         intent.putExtras(bundle);
                     }
                    }
                }
        );
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bai2.this,bai2_2.class);
                intent.putExtra("formac1",edt1.getText().toString());
                getData.launch(intent);

            }
        });
    }
}