package com.example.resource.ui;

import com.example.resource.R;
import com.example.resource.entity.MainBean;
import com.example.resource.tools_kit.BaseActivity;
import com.example.resource.ui.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends BaseActivity {

    private List<MainBean> mainBeans;
    private RecyclerView recyclerView;

    @Override
    public int layout() { return R.layout.activity_main; }

    @Override
    public void initView() {
        recyclerView = findViewById(R.id.activity_main_recyclerView);
    }

    @Override
    public void initDate() {

        mainBeans = new ArrayList<>();

        MainBean mainBean = new MainBean();
        mainBean.setId(0);
        mainBean.setTitle("ce0");
        mainBean.setContent("");
        mainBean.setBg(0);
        mainBeans.add(mainBean);

        MainBean mainBean1 = new MainBean();
        mainBean1.setId(1);
        mainBean1.setTitle("ce1");
        mainBean1.setContent("");
        mainBean1.setBg(1);
        mainBeans.add(mainBean1);

        initList();
    }

    private void initList(){

        MainAdapter adapter = new MainAdapter(mainBeans);
        recyclerView.setAdapter(adapter);
    }
}
