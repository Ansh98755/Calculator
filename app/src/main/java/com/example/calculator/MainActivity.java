package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText first_val, second_val;
    TextView result;
    Button bt1,bt2,bt3,bt4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_val=findViewById(R.id.first_val);
        second_val=findViewById(R.id.second_val);
        result=findViewById(R.id.res);
        bt1=findViewById(R.id.add);
        bt2=findViewById(R.id.sub);
        bt3=findViewById(R.id.mul);
        bt4=findViewById(R.id.div);

        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int v1,v2,ans;
                v1=Integer.parseInt(first_val.getText().toString());
                v2=Integer.parseInt(second_val.getText().toString());

                ans=v1+v2;
                result.setText("Ans = "+ans);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int v1,v2,ans;
                v1=Integer.parseInt(first_val.getText().toString());
                v2=Integer.parseInt(second_val.getText().toString());
                if(v1>v2)
                    ans=v1-v2;
                else
                    ans=v2-v1;
                result.setText("Ans = "+ans);
            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int v1,v2,ans;
                v1=Integer.parseInt(first_val.getText().toString());
                v2=Integer.parseInt(second_val.getText().toString());

                ans=v1*v2;
                result.setText("Ans = "+ans);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int v1,v2,ans;
                v1=Integer.parseInt(first_val.getText().toString());
                v2=Integer.parseInt(second_val.getText().toString());
                if(v1>v2)
                    ans=v1/v2;
                else
                    ans=v2/v1;
                result.setText("Ans = "+ans);
            }
        });


    }
}