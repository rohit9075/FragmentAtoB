package com.rohit.fragmentatob;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class SourceFragment extends Fragment {

    MyListener listener;


    public SourceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_source, container, false);

        final EditText mEditTextEmail = view.findViewById(R.id.EditText_Email);
        Button mSendDataButton = view.findViewById(R.id.send_data_button);

        mSendDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mEditTextEmail.getText().toString();
                sendData(email);
            }
        });


        return view;
    }

    private void sendData(String email) {

        listener = (MyListener)getActivity();

        listener.sendDataToFragment(email);


    }

}
