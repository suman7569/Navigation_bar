package com.appdevelopersumankr.second_navigation.fragment_leftside;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdevelopersumankr.second_navigation.R;

public class Faqs_fragment extends Fragment{
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate ( R.layout.activity_faqs_fragment,container,false );
        return v;
    }
}