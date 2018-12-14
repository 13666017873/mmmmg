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

//        Button button = findViewById(R.id.btn);
//
//        NewbieGuide.with(this)
//                .setLabel("guide1")
//                .addGuidePage(GuidePage.newInstance()
////                        .setBackgroundColor(getResources().getColor(R.color.bg))
//                        .addHighLight(button, HighLight.Shape.ROUND_RECTANGLE,25)
//                        .setLayoutRes(R.layout.view_guide_simple))
//                .show();
//
//
//        CommentTimePickerView commentTimePickerView = findViewById(R.id.comment_time_picker_view);
//
//        commentTimePickerView.setOnListener(new CommentTimePickerView.onListener() {
//            @Override
//            public void onChangeListener(NumberType numberType, String pickValue, String oldValue, String newValue) {
//
//            }
//        });

    }
}
