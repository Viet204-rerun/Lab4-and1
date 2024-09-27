package com.example.lab4_ph32598.lab4;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lab4_ph32598.R;

public class bai3 extends ComponentActivity {
    EditText edt1, edt2;
    Button btn1, btn2;
    Intent intent;
    String u = "", p = "";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        edt1=findViewById(R.id.edt3);
        edt2=findViewById(R.id.edt4);
        btn1 = findViewById(R.id.btn6);
        btn2=findViewById(R.id.btn7);
        intent = getIntent();

                if(intent!=null){
                    Bundle bundle =intent.getExtras();
                    if(bundle!=null){
                        u=bundle.getString("u");
                        p=bundle.getString("p");
                    }
                }


        btn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(bai3.this,bai3_2.class);
                startActivity(intent1);
            }
        }));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Boolean isU = u.equals(edt1.getText().toString());
            Boolean isP = p.equals(edt2.getText().toString());
            if(edt1.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"Chưa nhập username!",Toast.LENGTH_LONG).show();
                return;
            }
                if(edt2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Chưa nhập password!",Toast.LENGTH_LONG).show();
                    return;
                }
                if(isU&&isP&&u!=""&&p!=""){
                    Toast.makeText(getApplicationContext(),"Đăng Nhập Thành Công",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Đăng Nhập Không Thành Công",Toast.LENGTH_LONG).show();
                    return;
                }
            }
        });
    }
}