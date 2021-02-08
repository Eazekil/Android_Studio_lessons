 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity { //implements View.OnClickListener  AppCompatActivity
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    public static int countClick=0;
    private static final String TAG="MyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Найдем View-элементы");
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        ImageView imageView=(ImageView)findViewById(R.id.imageView1);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button1:
                        textView.setText(R.string.textButton1);
                        Log.d(TAG,"Обработаем нажаите кнопки 1");

                        break;
                    case R.id.button2:
                        try {
                            int i=6/3;
                            textView.setText("резудьтат деления"+i);
                            Log.d(TAG,"Обработаем нажаите кнопки 2");
                        } catch (Exception e) {
                            Log.d(TAG,"Упс, деление на ноль",e);
                        }
                        break;
                    case R.id.button3:
                        textView.setText(R.string.textButton3);
                        Log.d(TAG,"Обработаем нажаите кнопки 3");

                        break;
                    case R.id.imageView1:
                        if(countClick %2==0){
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.baseline_arrow_forward_ios_black_36));
                            Log.d(TAG,"Обработаем нажаите и смены картинки");
                            Toast toast=Toast.makeText(MainActivity.this, "Direction changed successfully, enjoy!", Toast.LENGTH_SHORT);
                            toast.setGravity(Gravity.TOP,Gravity.TOP,Gravity.TOP);
                            /*LinearLayout toastImage=(LinearLayout)toast.getView();
                            ImageView imageView1=new ImageView(MainActivity.this);
                            imageView1.setImageResource(R.drawable.smile);
                            toastImage.addView(imageView1);*/

                            toast.show();

                        }else{
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.outline_360_black_48));
                            Toast toast=Toast.makeText(MainActivity.this, "Direction changed successfully, enjoy!", Toast.LENGTH_SHORT);
                            toast.setGravity(1,100,100);
                            toast.show();
                            Log.d(TAG,"Обработаем нажаите и смены картинки 2");
                        }
                        countClick++;
                        break;
                }
            }
        };
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        imageView.setOnClickListener(onClickListener);


    }
 }