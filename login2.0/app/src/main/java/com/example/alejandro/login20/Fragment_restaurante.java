package com.example.alejandro.login20;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Alejandro on 11/11/2015.
 */
public class Fragment_restaurante extends Fragment
{
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_restaurante, container, false);
        return rootView;
    }

}
