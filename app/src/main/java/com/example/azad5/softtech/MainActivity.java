package com.example.azad5.softtech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button = (Button) findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openActivity2();

           }
       });
        button = (Button) findViewById(R.id.button1);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openActivity3();
           }
       });
       button =(Button) findViewById(R.id.button2);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openActivity4();
           }
       });
       button = (Button) findViewById(R.id.button3);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openActivity5();
           }
       });
    }
    public void openActivity2(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent(this,Activity5.class);
        startActivity(intent);
    }
}
