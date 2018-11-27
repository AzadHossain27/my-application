package com.example.azad5.softtech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.VideoView;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {
      Button clk;
      VideoView videoV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
       clk = (Button) findViewById(R.id.button);
       videoV = (VideoView) findViewById(R.id.videoview);

    }

    public void videoplay(View view)
    {
        String videopath = "android.resource://com.example.azad5.softtech/"R.raw;
    }
}
