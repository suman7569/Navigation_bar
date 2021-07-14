package com.appdevelopersumankr.second_navigation.tab_fragemnt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdevelopersumankr.second_navigation.R;

public class Tab_fragment_two extends Fragment {
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate ( R.layout.activity_tab_fragment_two,container,false );
        return v;
    }
}