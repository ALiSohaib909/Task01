package com.exampl.task01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button btnAction = findViewById(R.id.btnNext1);
//        btnAction.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, ImageActivity.class);
//                startActivity(i);
//
//            }
//        });
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  Button Next1 = findViewById(R.id.btnNext1);
  Next1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      Intent i = new Intent(MainActivity.this, InputActivity.class);
      startActivity(i);

    }
  });

 // Intent ii = new Intent (MainActivity.this, SplashActivity.class);
 // startActivity(ii);
}
  }
