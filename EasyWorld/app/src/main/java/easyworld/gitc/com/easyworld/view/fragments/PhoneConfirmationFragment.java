package easyworld.gitc.com.easyworld.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import easyworld.gitc.com.easyworld.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhoneConfirmationFragment extends Fragment {


    public PhoneConfirmationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone_confirmation, container, false);
    }

}
