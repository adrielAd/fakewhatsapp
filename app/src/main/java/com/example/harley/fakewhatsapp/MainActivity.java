package com.example.harley.fakewhatsapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setElevation(0);
        setContentView(R.layout.activity_main);
        tab = (TabLayout)findViewById(R.id.tabLayout);
        pager = (ViewPager)findViewById(R.id.viewPager);
        pager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(pager);
        pager.setCurrentItem(1);
        tab.getTabAt(0).setIcon(R.drawable.camera);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
}
