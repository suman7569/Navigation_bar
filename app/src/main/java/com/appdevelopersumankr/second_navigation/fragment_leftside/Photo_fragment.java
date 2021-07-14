package com.appdevelopersumankr.second_navigation.fragment_leftside;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdevelopersumankr.second_navigation.R;
import com.appdevelopersumankr.second_navigation.adapter.Adapter_for_photo;
import com.appdevelopersumankr.second_navigation.adapter.Adapter_for_recycler_one;

public class Photo_fragment extends Fragment {
    View v;
    RecyclerView recyclerView,recyclerView1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate ( R.layout.activity_photo_fragment,container,false );

        recyclerView=v.findViewById ( R.id.recyclerviewid);

       // RecyclerView.LayoutManager layoutManager1=new StaggeredGridLayoutManager (3,StaggeredGridLayoutManager.VERTICAL);

       // recyclerView.setLayoutManager ( new LinearLayoutManager ( v.getContext (),RecyclerView.HORIZONTAL,false ) );

       // recyclerView.setLayoutManager ( new StaggeredGridLayoutManager ( v.getContext (), )  );

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        Adapter_for_photo aa=new Adapter_for_photo ( getActivity ());
        recyclerView.setAdapter ( aa );

        return v;
    }
}