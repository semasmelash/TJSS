package com.example.tjss.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int mCount_1 = 0;
    private int mCount_2 = 0;
    private int mCount_3 = 0;
    private int total = 0;


    private TextView mtextView2;
    private TextView mtextView3;
    private TextView mtextView4;
    private TextView mTotalView;

    private Button mButton_01;
    private Button mButton_02;
    private Button mButton_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextView2 = (TextView) findViewById(R.id.textView2);
        mtextView3 = (TextView) findViewById(R.id.textView3);
        mtextView4 = (TextView) findViewById(R.id.textView4);
        mTotalView = (TextView) findViewById(R.id.total);

        mButton_01 = (Button) findViewById(R.id.button1);
        mButton_02 = (Button) findViewById(R.id.button2);
        mButton_03 = (Button) findViewById(R.id.button3);

        mButton_01.setOnClickListener(this);
        mButton_02.setOnClickListener(this);
        mButton_03.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {

        String textOut;
        switch (v.getId()) {
            case R.id.button1:
                textOut = "Button 1!";
                total++;
                mCount_1++;
                mtextView2.setText(""+mCount_1);
                mTotalView.setText(""+total);
                break;
            case R.id.button2:
                textOut = "Button 2!";
                total++;
                mCount_2++;
                mtextView3.setText(""+mCount_2);
                mTotalView.setText(""+total);
                break;
            case R.id.button3:
                textOut = "Button 3!";
                total++;
                mCount_3++;
                mtextView4.setText(""+mCount_3);
                mTotalView.setText(""+total);
                break;
            default:
                textOut = "???";


        }
    }


}
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//
//
//    mButton_01.setOnClickListener(this);
//            mButton_02.setOnClickListener(this);
//            mButton_03.setOnClickListener(this);

