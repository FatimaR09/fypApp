package com.example.myapplication;

import Fragments.AboutFragment;
import Fragments.DocumentFragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.myapplication.Adapter.MyViewPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class Profile_Activity extends AppCompatActivity {

    TabLayout MyTabs;
    ViewPager MyPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        MyTabs = (TabLayout)findViewById(R.id.MyTabs);
        MyPage = (ViewPager)findViewById(R.id.MyPage);
        MyTabs.setSelectedTabIndicatorColor(Color.parseColor("#2AC940"));
//        MyTabs.setSelectedTabIndicatorHeight((int) (1 * getResources().getDisplayMetrics().density));
        MyTabs.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#000000"));

        MyTabs.setupWithViewPager(MyPage);
        SetUpViewPager(MyPage);
    }
    public void SetUpViewPager (ViewPager viewpage){
        MyViewPageAdapter Adapter = new MyViewPageAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new AboutFragment(), "About ");
        Adapter.AddFragmentPage(new DocumentFragment(), "Documents");
        Adapter.AddFragmentPage(new DocumentFragment(), "Reviews");
        viewpage.setAdapter(Adapter);

    }


}
