package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar prg,prg2,prg3,prg4;
    Button bt25,bt100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prg=(ProgressBar)findViewById(R.id.progressBar);
        prg2=(ProgressBar)findViewById(R.id.progressBar2);
        prg3=(ProgressBar)findViewById(R.id.progressBar3);
        prg4=(ProgressBar)findViewById(R.id.progressBar4);
        bt25 = (Button)findViewById(R.id.button);
        bt100=(Button)findViewById(R.id.button2);

        bt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(25);
                prg2.setProgress(40);
                prg3.setProgress(100);
                prg4.setProgress(120);
            }
        });

        bt100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(100);
            }
        });

    }
}
