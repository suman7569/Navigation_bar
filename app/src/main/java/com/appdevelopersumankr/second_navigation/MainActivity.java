package com.appdevelopersumankr.second_navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.appdevelopersumankr.second_navigation.adapter.Adapter_for_tablayout;
import com.appdevelopersumankr.second_navigation.fragment_leftside.About_us_fragment;
import com.appdevelopersumankr.second_navigation.fragment_leftside.Ask_fragment;
import com.appdevelopersumankr.second_navigation.fragment_leftside.Contact_us_fragment;
import com.appdevelopersumankr.second_navigation.fragment_leftside.Faqs_fragment;
import com.appdevelopersumankr.second_navigation.fragment_leftside.Help_fragment;
import com.appdevelopersumankr.second_navigation.fragment_leftside.Home_fragment;
import com.appdevelopersumankr.second_navigation.fragment_leftside.Photo_fragment;
import com.appdevelopersumankr.second_navigation.fragment_leftside.Share_fragment;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_five;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_four;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_three;
import com.appdevelopersumankr.second_navigation.tab_fragemnt.Tab_fragment_two;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FrameLayout frameLayout;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        TabLayout tabLayout=findViewById ( R.id.tablayoutid);
        drawerLayout=findViewById ( R.id.drawer);
        toolbar=findViewById ( R.id.toolbarid);
        navigationView=findViewById ( R.id.navigationview);

//        viewPager2=findViewById ( R.id.container_fragment);


        navigationView.setNavigationItemSelectedListener ( this );

        setSupportActionBar ( toolbar);






        actionBarDrawerToggle=new ActionBarDrawerToggle ( this,drawerLayout,toolbar,( R.string.open),( R.string.close) );
        drawerLayout.addDrawerListener ( actionBarDrawerToggle );
        actionBarDrawerToggle.setDrawerIndicatorEnabled (true);
        actionBarDrawerToggle.syncState ();

        //default fragment when user open first time
        fragmentManager=getSupportFragmentManager ();
        fragmentTransaction=fragmentManager.beginTransaction ();
        fragmentTransaction.add ( R.id.container_fragment,new Home_fragment ());
        fragmentTransaction.commit ();


        tabLayout.addTab ( tabLayout.newTab ().setIcon ( R.drawable.home ) );
        tabLayout.addTab ( tabLayout.newTab ().setIcon ( R.drawable.note ) );
        tabLayout.addTab ( tabLayout.newTab ().setIcon ( R.drawable.notifications ) );
        tabLayout.addTab ( tabLayout.newTab ().setIcon ( R.drawable.payment ) );
        tabLayout.addTab ( tabLayout.newTab ().setIcon ( R.drawable.profile ) );

        Adapter_for_tablayout aaa=new Adapter_for_tablayout ( getSupportFragmentManager (),getLifecycle ());

        tabLayout.addOnTabSelectedListener ( new TabLayout.OnTabSelectedListener () {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition ()==0)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Home_fragment ());
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==1)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_two ());
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==2)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_three () );
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==3)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_four ());
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==4)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_five ());
                    fragmentTransaction.commit ();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

                if (tab.getPosition ()==0)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Home_fragment ());
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==1)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_two ());
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==2)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_three () );
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==3)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_four ());
                    fragmentTransaction.commit ();
                }
                else if (tab.getPosition ()==4)
                {
                    fragmentManager=getSupportFragmentManager ();
                    fragmentTransaction=fragmentManager.beginTransaction ();
                    fragmentTransaction.replace ( R.id.container_fragment,new Tab_fragment_five ());
                    fragmentTransaction.commit ();
                }

            }
        } );







    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer ( GravityCompat.START );

        if(item.getItemId ()==R.id.homeid)
        {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new Home_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( MainActivity.this, "Home", Toast.LENGTH_SHORT ).show ();
        }
        else  if(item.getItemId ()==R.id.photoid)
        {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new Photo_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( this, "Photo", Toast.LENGTH_SHORT ).show ();
        }
        else  if(item.getItemId ()==R.id.faqs)
        {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new Faqs_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( this, "FAQs", Toast.LENGTH_SHORT ).show ();
        }
        else  if(item.getItemId ()==R.id.contactusid)
        {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new Contact_us_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( this, "Contact us", Toast.LENGTH_SHORT ).show ();
        }
        else  if(item.getItemId ()==R.id.aboutusid)
        {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new About_us_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( this, "About us", Toast.LENGTH_SHORT ).show ();
        }
        else  if(item.getItemId ()==R.id.helpid)
        {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new Help_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( this, "Help ", Toast.LENGTH_SHORT ).show ();
        }
        else  if(item.getItemId ()==R.id.askid)
        {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new Ask_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( this, "Ask", Toast.LENGTH_SHORT ).show ();
        }
        else {
            fragmentManager=getSupportFragmentManager ();
            fragmentTransaction=fragmentManager.beginTransaction ();
            fragmentTransaction.replace ( R.id.container_fragment,new Share_fragment ());
            fragmentTransaction.commit ();
            Toast.makeText ( this, "Share", Toast.LENGTH_SHORT ).show ();

        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater ().inflate ( R.menu.right_side_dot_dot,menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.settingid:{
                fragmentManager=getSupportFragmentManager ();
                fragmentTransaction=fragmentManager.beginTransaction ();
                fragmentTransaction.replace ( R.id.container_fragment,new Fragment_for_setting ());
                fragmentTransaction.commit ();

                Toast.makeText ( MainActivity.this, "Setting", Toast.LENGTH_SHORT ).show ();
                break;
            }
            case R.id.exitid:{
                fragmentManager=getSupportFragmentManager ();
                fragmentTransaction=fragmentManager.beginTransaction ();
                fragmentTransaction.replace ( R.id.container_fragment,new Fragment_for_exit ());
                fragmentTransaction.commit ();

                Toast.makeText ( MainActivity.this, "Exit", Toast.LENGTH_SHORT ).show ();
            break;
            }
            case R.id.searchid:
                Toast.makeText ( MainActivity.this, "Search", Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.refreshid:
                Toast.makeText ( MainActivity.this, "Refresh", Toast.LENGTH_SHORT ).show ();
                break;

        }
        return true;
    }
}