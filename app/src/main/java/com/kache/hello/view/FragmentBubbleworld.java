package com.kache.hello.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.kache.hello.R;

public class FragmentBubbleworld extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View v = inflater.inflate(R.layout.fragment_fragment_bubbleworld, container, false);
        final ImageButton earth = (ImageButton) v.findViewById(R.id.earthButton);

        earth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), StartGameActivity.class);
                startActivity(intent);
            }

        });


        return v;
    }
}
