package ro.magdamiu.myapplication.module6.tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ro.magdamiu.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {


    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_fragment1, container, false);
    }

}
