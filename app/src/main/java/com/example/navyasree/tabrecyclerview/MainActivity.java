package com.example.navyasree.tabrecyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.vp);
        tabLayout=findViewById(R.id.tab);
        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }

}
