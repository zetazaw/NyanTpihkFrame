package com.linkupcrm.linkupcrmcontact.tpihk;

/**
 * Created by Zeta on 11/20/2014.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMessage extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static FragmentMessage newInstance(int sectionNumber) {
        FragmentMessage fragment = new FragmentMessage();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentMessage() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.message_fragment, container, false);
        return rootView;
    }
}
