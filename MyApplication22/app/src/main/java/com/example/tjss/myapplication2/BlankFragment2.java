package com.example.tjss.myapplication2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragment2 extends Fragment implements View.OnClickListener{
    private Button Erase;
    private SimpleDrawingView STV;

    public BlankFragment2() {
    }

    public static BlankFragment2 newInstance() {
        BlankFragment2 fragment = new BlankFragment2();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        Erase = (Button) rootView.findViewById(R.id.Erase);
        STV = (SimpleDrawingView) rootView.findViewById(R.id.STV);
        Erase.setOnClickListener(this);
        return rootView;
    }
    @Override
    public void onClick(View view) {
        STV.resetPath();
    }
}
