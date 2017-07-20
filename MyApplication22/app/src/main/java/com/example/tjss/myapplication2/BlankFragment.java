package com.example.tjss.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.tjss.myapplication2.R.id.container;


public class BlankFragment extends Fragment implements View.OnClickListener {
private ImageView mimageView;
    private FragmentOneInterface mCallback;
    private Button mButton;

    public BlankFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mCallback = (FragmentOneInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement FragmentOneInterface");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        mimageView = rootView.findViewById(R.id.imageView);
        mButton = rootView.findViewById(R.id.button);


        mButton.setOnClickListener(this);
        return rootView;

    }

    @Override
    public void onClick(View view) {
        mCallback.getCamera();

    }

    public void setImageBitmap(Bitmap imageBitmap)  {
        mimageView.setImageBitmap(imageBitmap);

    }

    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }

    public interface FragmentOneInterface {
        void getCamera();
    }
}


