package com.example.tabs;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Tab 1"), Tab1.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Tab 2"), Tab2.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Tab 3"), Tab3.class, null);
    }
}
