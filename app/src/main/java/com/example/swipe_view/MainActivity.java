package com.example.swipe_view;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the viewPager
        mViewPager = (ViewPager) findViewById(R.id.pager);

        // Set the ViewPagerAdapter into the ViewPager
        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

    }

}
