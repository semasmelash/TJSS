package com.example.tjss.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    private TextView mtextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mtextView = (TextView) findViewById(R.id.tv_01);
        mtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                mtextView.setText("" + count);
            }
        });
    }

    private int mCount = 0;
    private TextView mtextView;

    private Button mButton_01;
    private Button mButton_02;
    private Button mButton_03;
}