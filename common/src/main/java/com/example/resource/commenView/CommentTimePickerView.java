package com.example.resource.commenView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.resource.R;
import com.example.resource.utils.NumberPickChangeUtil;
import com.example.resource.utils.NumberType;


public class CommentTimePickerView extends RelativeLayout {

    private onListener onListener;

    public CommentTimePickerView(Context context) {
        super(context);
    }

    public CommentTimePickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 加载布局
        LayoutInflater.from(context).inflate(R.layout.time_picker, this);

        QNumberPicker numberPicker1 = findViewById(R.id.number_pick1);
        QNumberPicker numberPicker2 = findViewById(R.id.number_pick2);
        NumberPickChangeUtil.initNumberPicker(context, NumberType.HOURS, numberPicker1);
        NumberPickChangeUtil.initNumberPicker(context, NumberType.MINUTES, numberPicker2);
        new NumberPickChangeUtil().setOnCommentTimeValueChangeListener(new NumberPickChangeUtil.OnCommentTimeValueChangeListener() {
            @Override
            public void setTimeCallback(NumberType numberType, String pickValue, String oldValue, String newValue) {
                onListener.onChangeListener(numberType, pickValue, oldValue, newValue);
            }
        });
    }

    public CommentTimePickerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public interface onListener{
        void onChangeListener(NumberType numberType, String pickValue, String oldValue, String newValue);
    }

    public void setOnListener(onListener mOnListener){
        this.onListener = mOnListener;
    }
}
