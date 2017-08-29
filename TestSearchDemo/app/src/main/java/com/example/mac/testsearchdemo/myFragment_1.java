package com.example.mac.testsearchdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MAC on 2017/8/29.
 */

public class myFragment_1 extends Fragment {


    private myViewpager viewPager;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_w, container, false);

        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        test1Fragment test1F = new test1Fragment();
        test2Fragment test2F = new test2Fragment();
        test3Fragment test3F = new test3Fragment();
        List<android.support.v4.app.Fragment> list = new ArrayList<android.support.v4.app.Fragment>();
        list.add(test1F);
        list.add(test2F);
        list.add(test3F);
        SimpleFragmentPagerAdapter pagerAdapter = new SimpleFragmentPagerAdapter(((MainActivity) getActivity()).getSupportFragmentManager(), getActivity(),list);


        viewPager = (myViewpager) view.findViewById(R.id.viewpager1);
        tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs1);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

    }

    @Override
    public void onStart() {
        super.onStart();

    }
}