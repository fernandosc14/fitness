package com.example.fitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fitness.ui.main.AbsFragment;

public class abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AbsFragment.newInstance())
                    .commitNow();
        }
    }
}