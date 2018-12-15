package com.example.resource.commenView;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by mmmmg on 2018/12/15.
 */

public class CommonSelectImageList extends RecyclerView {

    public CommonSelectImageList(@NonNull Context context) {
        super(context);
    }

    public CommonSelectImageList(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
        initAttributeSetArrays();
    }

    public CommonSelectImageList(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private void initAttributeSetArrays() {

    }

    private void initView() {

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);
    }

    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);
    }
}
