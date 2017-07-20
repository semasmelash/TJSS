package com.example.tjss.framentexamples;

/* ------------------------*/
/*    FILE VERSION 6.0     */
/* ------------------------*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CoolFragment extends Fragment {

    public CoolFragment() {
    }

    public static CoolFragment newInstance() {
        CoolFragment fragment = new CoolFragment();
        return fragment;
    }


    // NEW FOR VERSION 2.0 - THIS FRAGMENT USES HIS OWN XML FILE!

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cool2, container, false);
        return rootView;
    }
}