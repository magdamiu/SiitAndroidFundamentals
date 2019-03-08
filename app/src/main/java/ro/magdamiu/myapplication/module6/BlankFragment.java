package ro.magdamiu.myapplication.module6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ro.magdamiu.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private TextView mTextViewEmail;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        initView(view);
        return view;
    }


    private void initView(View view) {
        mTextViewEmail = view.findViewById(R.id.text_view_email);

        Bundle bundle = getArguments();
        if(bundle != null) {
            String email = bundle.getString(DynamicFragmentActivity.EMAIL);
            if (email != null && !email.isEmpty()) {
                mTextViewEmail.setText(email);
            }
        }
    }

}
