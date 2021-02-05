 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button button1;
    Button button2;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Pressed first button");
            }
        });
        button2.setOnClickListener(this);
    }
    public void clickButton3(View v){
        textView.setText("Pressed third button");
    }

     @Override
     public void onClick(View v) {
         textView.setText("Pressed second button");
     }
 }