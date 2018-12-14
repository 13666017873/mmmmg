package com.example.resource.ui;

import com.example.resource.R;
import com.example.resource.tools_kit.BaseActivity;

import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends BaseActivity {

    @Override
    public int layout() { return R.layout.activity_main; }

    @Override
    public void initView() {
        RecyclerView recyclerView = findViewById(R.id.activity_main_recyclerView);

    }

    @Override
    public void initDate() {

    }
}
