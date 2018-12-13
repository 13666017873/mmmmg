package com.example.resource.commenView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.resource.R;

import androidx.annotation.Nullable;

public class CommentWatchMoreTextView extends LinearLayout implements View.OnClickListener {

    private TextView textView = null;
    private TextView moreText = null;

    //字体颜色
    protected int textColor;
    //字体大小
    protected float textSize;
    //最大行数
    protected int maxLine;
    //文字
    protected String text;
    //默认颜色
    public int defaultTextColor = Color.BLACK;
    //默认字体大小
    public int defaultTextSize = 30;
    //默认行数
    public int defaultLine = 6;
    public boolean isGo;


    public CommentWatchMoreTextView(Context context) {
        super(context);
    }

    public CommentWatchMoreTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
        initAttrs(context, attrs);
    }

    public CommentWatchMoreTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        initAttrs(context, attrs);
    }

    @SuppressLint("CustomViewStyleable")
    public void initAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyTextStyle);
        textColor = typedArray.getColor(R.styleable.MyTextStyle_textColor, defaultTextColor);
        textSize = typedArray.getDimensionPixelSize(R.styleable.MyTextStyle_textSize, defaultTextSize);
        maxLine = typedArray.getInt(R.styleable.MyTextStyle_maxLine, defaultLine);
        text = typedArray.getString(R.styleable.MyTextStyle_text);
        setMyView(textColor, textSize, maxLine, text);
        //用完 回收一下
        typedArray.recycle();
    }

    @SuppressLint("RtlHardcoded")
    public void initView() {
        setOrientation(VERTICAL);
        setGravity(Gravity.LEFT);
        int padding = dip2px(getContext(), 10);
        textView = new TextView(getContext());
        textView.setLineSpacing(3f, 1f);
        addView(textView, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        moreText = new TextView(getContext());
        moreText.setPadding(padding, padding, padding, padding);
        moreText.setText(". . . . . . 全文");
        moreText.setOnClickListener(this);

        LayoutParams llp = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        addView(moreText, llp);
    }

    protected void setMyView(int color, float size, final int line, String text) {
        //文本设置颜色
        textView.setTextColor(color);
        //字体大小
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
        //设置文字
        textView.setText(text);
        //设置TextView的高度
        textView.setHeight(textView.getLineHeight() * line);

        //线程更新UI
        post(new Runnable() {
            @Override
            public void run() {
                if (textView.getLineCount() > line) {
                    moreText.setVisibility(VISIBLE);
                } else {
                    moreText.setVisibility(GONE);
                }
            }
        });
    }

    public TextView getTextView() {
        return textView;
    }

    public void setText(CharSequence charSequence) {
        textView.setText(charSequence);
    }

    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    @Override
    public void onClick(View v) {
        isGo = !isGo;
        textView.clearAnimation();
        //相差的高度
        final int deltaValue;
        //初始的高度
        final int startValue = textView.getHeight();
        //动画播放的时间
        int duration = 400;
        if (isGo) {
            //Image图片打开的动画
            deltaValue = textView.getLineHeight() * textView.getLineCount() - startValue;
        } else {
            //Image图片关闭的动画
            deltaValue = textView.getLineHeight() * maxLine - startValue;
        }
        //打开或者关闭的时候textview下面的展开动画
        Animation animation = new Animation() {
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                textView.setHeight((int) (startValue + deltaValue * interpolatedTime));
            }
        };
        animation.setInterpolator(new LinearInterpolator());
        animation.setDuration(duration);
        textView.startAnimation(animation);
    }
}
