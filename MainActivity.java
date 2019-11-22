package com.example.AppMusic_AHL;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabs;
    private ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs=findViewById(R.id.tabs);
        pager=findViewById(R.id.pager);


        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager());

        pager.setAdapter(pagerAdapter);

        tabs.setupWithViewPager(pager);
    }
}
