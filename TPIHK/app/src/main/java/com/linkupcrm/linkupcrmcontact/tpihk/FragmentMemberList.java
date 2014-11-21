package com.linkupcrm.linkupcrmcontact.tpihk;

/**
 * Created by Zeta on 11/20/2014.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMemberList extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static FragmentMemberList newInstance(int sectionNumber) {
        FragmentMemberList fragment = new FragmentMemberList();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentMemberList() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.member_list_fragment, container, false);
        return rootView;
    }
}
