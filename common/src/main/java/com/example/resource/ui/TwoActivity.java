package com.example.resource.ui;

import android.app.Activity;
import android.os.Bundle;

import com.example.resource.R;

import androidx.annotation.Nullable;

public class TwoActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
}
