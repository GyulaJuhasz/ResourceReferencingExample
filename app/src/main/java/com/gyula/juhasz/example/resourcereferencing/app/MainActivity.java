package com.gyula.juhasz.example.resourcereferencing.app;

import com.gyula.juhasz.example.resourcereferencing.R;
import com.gyula.juhasz.example.resourcereferencing.data.ui.DataFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_activity_fragment_container, DataFragment.newInstance());
        transaction.commit();
    }
}
