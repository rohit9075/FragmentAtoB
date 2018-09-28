package com.rohit.fragmentatob;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  MyListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container_source,new SourceFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_destination,new TargetFragment(), "fragB").commit();

    }

    @Override
    public void sendDataToFragment(String email) {

        FragmentManager manager = getSupportFragmentManager();

        TargetFragment fragment = (TargetFragment) manager.findFragmentByTag("fragB");

        fragment.getDataFromFragment(email);

    }
}
