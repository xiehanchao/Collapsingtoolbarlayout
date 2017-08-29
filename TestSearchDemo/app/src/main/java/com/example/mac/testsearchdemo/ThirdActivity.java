package com.example.mac.testsearchdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by MAC on 2017/8/29.
 */

public class ThirdActivity extends AppCompatActivity {
    private SimpleFragmentPagerAdapter pagerAdapter;

    private ViewPager viewPager;

    private TabLayout tabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studytablayout);
//        pagerAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), this, list);
//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        viewPager.setAdapter(pagerAdapter);
//        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
//        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.setTabMode(TabLayout.MODE_FIXED);
    }
}
