package com.linkupcrm.linkupcrmcontact.tpihk;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.linkupcrm.linkupcrmcontact.tpihk.adapters.MainPagerAdapter;


public class MainActivity extends ActionBarActivity implements ActionBar.TabListener {

    MainPagerAdapter mMainPagerAdapter;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        //set actionbar color
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#455a64")));

        actionBar.setIcon(R.drawable.ic_launcher);
        actionBar.setDisplayShowHomeEnabled(true);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mMainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mMainPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        int color[]={Color.parseColor("#455a64")};

        int drawable[]={R.drawable.ic_action_web_site, R.drawable.ic_action_group,R.drawable.ic_action_chat,R.drawable.ic_action_person};
        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < mMainPagerAdapter.getCount(); i++) {
            actionBar.addTab(
                    actionBar.newTab()
                            //.setText(mMainPagerAdapter.getPageTitle(i))
                            .setIcon(drawable[i])
                            .setTabListener(this));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in
        // the ViewPager.
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }


}
