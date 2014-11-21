package com.linkupcrm.linkupcrmcontact.tpihk.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.linkupcrm.linkupcrmcontact.tpihk.FragmentHome;
import com.linkupcrm.linkupcrmcontact.tpihk.FragmentMemberList;
import com.linkupcrm.linkupcrmcontact.tpihk.FragmentMessage;
import com.linkupcrm.linkupcrmcontact.tpihk.FragmentProfile;

/**
 * Created by Zeta on 11/20/2014.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position){
            case 0:
                return FragmentHome.newInstance(position);
            case 1:
                return FragmentMemberList.newInstance(position);
            case 2:
                return FragmentMessage.newInstance(position);
            case 3:
                return FragmentProfile.newInstance(position);
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Home";//getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return "Member Listing";//getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return "Message";//getString(R.string.title_section3).toUpperCase(l);
            case 3:
                return "Profile";
        }
        return null;
    }
}
