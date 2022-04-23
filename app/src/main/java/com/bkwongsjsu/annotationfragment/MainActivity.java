package com.bkwongsjsu.annotationfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnnotationFragment fragment = AnnotationFragment.newInstance("Hello World");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.annotation_fragment_container, fragment)
                .commit();
    }
}