package com.example.lab4_ph32598.lab4;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lab4_ph32598.R;

public class bai3_2 extends ComponentActivity {
    EditText edt3,edt4,edt5;
    Button btn3;
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai32);
        edt3 = findViewById(R.id.edt6);
        edt4=findViewById(R.id.edt5);
        edt5=findViewById(R.id.edt7);
        btn3=findViewById(R.id.btn5);

        intent2 = getIntent();
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 intent2 = new Intent(bai3_2.this,bai3.class);
                Bundle bundle = new Bundle();
                if(edt3.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Chưa nhập username!",Toast.LENGTH_LONG).show();
                    return;
                }else{
                bundle.putString("u",edt3.getText().toString());
                }
                if(edt4.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Chưa nhập password!",Toast.LENGTH_LONG).show();
                    return;
                }
                if(edt4.getText().toString().equals(edt5.getText().toString())){
                    bundle.putString("p",edt4.getText().toString());
                }else{
                    Toast.makeText(getApplicationContext(),"Password không giống nhau!",Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(getApplicationContext(),"Đăng Ký Thành Công!",Toast.LENGTH_LONG).show();
                intent2.putExtras(bundle);
                startActivity(intent2);
            }
        });
    }
}