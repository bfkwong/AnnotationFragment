package com.bkwongsjsu.annotationfragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

@SuppressLint("SetTextI18n")
public class AnnotationFragment extends Fragment {
    private String existingAnnotationId = null;
    private SQLiteDatabase annotationDB;

    private EditText titleField;
    private EditText bodyField;
    private Button saveButton;
    private TextView titleText;

    public static AnnotationFragment newInstance(String existingAnnotationId) {
        AnnotationFragment fragment = new AnnotationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        fragment.setExistingAnnotationId(existingAnnotationId);
        return fragment;
    }

    public static AnnotationFragment newInstance() {
        AnnotationFragment fragment = new AnnotationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    protected void setExistingAnnotationId(String existingAnnotationId) {
        this.existingAnnotationId = existingAnnotationId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_annotation, container, false);
        titleText = view.findViewById(R.id.titleText);
        titleField = view.findViewById(R.id.titleField);
        bodyField = view.findViewById(R.id.bodyField);
        saveButton = view.findViewById(R.id.saveAnnoBtn);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.existingAnnotationId != null && this.existingAnnotationId.length() > 0) {
            titleText.setText("Existing annotation");
            titleField.setText("GDP Numbers");
            bodyField.setText("For these years from 2002 - 2017, GDP growth was at its highest");
        }
    }

}
