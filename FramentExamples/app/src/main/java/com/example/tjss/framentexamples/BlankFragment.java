package com.example.tjss.framentexamples;

/* ------------------------*/
/*    FILE VERSION 6.0     */
/* ------------------------*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BlankFragment extends Fragment implements View.OnClickListener {

    private Button mbutton;
    private TextView mtextView;

    public BlankFragment() {
    }

    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }


    // NEW FOR VERSION 2.0 - THIS FRAGMENT USES HIS OWN XML FILE!

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        mbutton = (Button) rootView.findViewById(R.id.Button);
        mtextView = (TextView) rootView.findViewById(R.id.Text2);
        return rootView;

    }

    @Override
    public void onClick(View view) {

    }
}

