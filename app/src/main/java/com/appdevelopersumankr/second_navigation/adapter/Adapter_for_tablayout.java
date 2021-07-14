package com.appdevelopersumankr.second_navigation.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.appdevelopersumankr.second_navigation.fragment_leftside.Home_fragment;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_five;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_four;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_three;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_two;

public class Adapter_for_tablayout extends FragmentStateAdapter {
    public Adapter_for_tablayout(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super ( fragmentManager, lifecycle );
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Home_fragment ();
            case 1:
                return new Tab_fragment_two ();
            case 2:
                return new Tab_fragment_three ();
            case 3:
                return new Tab_fragment_four ();
            case 4:
                return new Tab_fragment_five ();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
