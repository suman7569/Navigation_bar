package com.appdevelopersumankr.second_navigation.fragment_leftside;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdevelopersumankr.second_navigation.R;
import com.appdevelopersumankr.second_navigation.adapter.Adapter_for_recycler_one;

public class Home_fragment extends Fragment {
    View v;
    RecyclerView recyclerView,recyclerView1;
    RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate ( R.layout.activity_home_fragment,container,false );
        recyclerView=v.findViewById ( R.id.recyclerviewid);



//        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager ( getActivity (),RecyclerView.HORIZONTAL, false);
//        recyclerView.setLayoutManager ( layoutManager);


        recyclerView.setLayoutManager ( new LinearLayoutManager ( v.getContext (),RecyclerView.HORIZONTAL,false ) );


        Adapter_for_recycler_one aa=new Adapter_for_recycler_one ( getActivity () );
        recyclerView.setAdapter ( aa );
        return v;
    }
}