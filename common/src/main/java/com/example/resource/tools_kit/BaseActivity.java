package com.example.resource.tools_kit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.google.gson.Gson;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public abstract class BaseActivity extends FragmentActivity {

    public final Gson gson = new Gson();
    public Context context;
    public Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout());
        this.context = this;
        this.activity = this;
        this.initView();
        this.initDate();
    }

    public abstract int layout();

    public abstract void initView();

    public abstract void initDate();

}
