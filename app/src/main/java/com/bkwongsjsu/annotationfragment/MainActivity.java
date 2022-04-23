package com.bkwongsjsu.annotationfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnnotationFragment fragment = AnnotationFragment.newInstance("233");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.annotation_fragment_container, fragment)
                .commit();

        HashMap<String,String> allAnno = fragment.getAllAnnotations();
        System.out.println(allAnno);
    }
}