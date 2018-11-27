package com.example.azad5.softtech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Activity4 extends AppCompatActivity {
    Button clk;
VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.videoview);
    }
    public void videoplay(View view)
    {
        String videopath = "android.resource://com.example.azad5.softtech"+R.;
    }
}
