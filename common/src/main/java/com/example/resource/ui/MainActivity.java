package com.example.resource.ui;

import android.os.Bundle;
import android.widget.Button;

import com.app.hubert.guide.NewbieGuide;
import com.app.hubert.guide.model.GuidePage;
import com.app.hubert.guide.model.HighLight;
import com.example.resource.R;
import com.example.resource.commenView.CommentTimePickerView;
import com.example.resource.utils.NumberType;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn);

        NewbieGuide.with(this)
                .setLabel("guide1")
                .addGuidePage(GuidePage.newInstance()
//                        .setBackgroundColor(getResources().getColor(R.color.bg))
                        .addHighLight(button, HighLight.Shape.ROUND_RECTANGLE,25)
                        .setLayoutRes(R.layout.view_guide_simple))
                .show();


        CommentTimePickerView commentTimePickerView = findViewById(R.id.comment_time_picker_view);

        commentTimePickerView.setOnListener(new CommentTimePickerView.onListener() {
            @Override
            public void onChangeListener(NumberType numberType, String pickValue, String oldValue, String newValue) {

            }
        });
    }
}
