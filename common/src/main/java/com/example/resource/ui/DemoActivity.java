package com.example.resource.ui;

import android.widget.TextView;


import com.example.resource.R;
import com.example.resource.entity.InfoDream;
import com.example.resource.tools_kit.BaseActivity;
import com.example.resource.tools_kit.BaseObserver;
import com.example.resource.tools_kit.ToolHttpService;
import com.example.resource.tools_kit.ToolsRetrofit;

import java.util.HashMap;
import java.util.Map;

import static com.example.resource.tools_kit.ToolApi.DREAM;

public class DemoActivity extends BaseActivity {

    @Override
    public int layout() { return R.layout.activity_demo; }

    @Override
    public void initView() {

    }

    @Override
    public void initDate() {

        Map<String, Object> params = new HashMap<>();
        params.put("q", "狼");

        ToolsRetrofit
                .getInstance()
                .doGetParams(ToolHttpService.class, DREAM, params)
                .subscribe(new BaseObserver<String>() {
                    @Override
                    protected void onSuccess(String s) {
                        InfoDream infoNBA = gson.fromJson(s, InfoDream.class);
                        TextView textView = findViewById(R.id.text);
                        textView.setText(infoNBA.getResult().get(0).getTitle());
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) {

                    }
                });
    }
}
