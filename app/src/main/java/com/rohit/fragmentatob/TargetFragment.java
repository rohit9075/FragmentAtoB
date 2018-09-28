package com.rohit.fragmentatob;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class TargetFragment extends Fragment {

    String receivedEmail;
    TextView textViewEmail;


    public TargetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_target, container, false);


        textViewEmail = view.findViewById(R.id.textView_email);


        return view;
    }

    public void getDataFromFragment(String email){

        receivedEmail = email;

        textViewEmail.setText(receivedEmail);

    }

}
