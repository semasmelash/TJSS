package com.example.tjss.myapplication11111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener{

    private Button Erase;
    private SimpleDrawingView STV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    Erase = (Button) findViewById(R.id.Erase);
    STV = (SimpleDrawingView) findViewById(R.id.STV);
        Erase.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        STV.resetPath();
    }
}
