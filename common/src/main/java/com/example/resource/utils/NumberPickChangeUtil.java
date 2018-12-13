package com.example.resource.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.NumberPicker;

import java.lang.reflect.Field;
import java.util.Calendar;

public class NumberPickChangeUtil {

    private static OnCommentTimeValueChangeListener onCommentTimeValueChangeListener;

    //小时数组
    private static String[] numbers1 = {
            "00","01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10","11",
            "12", "13", "14", "15", "16", "17",
            "18", "19", "20", "21", "22", "23"};

    //分钟数组
    private static String[] numbers2 = {
            "00","01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10", "11",
            "12", "13", "14", "15", "16", "17",
            "18", "19", "20", "21", "22", "23",
            "24", "25", "26", "27", "28", "29",
            "30", "31", "32", "33", "34", "35",
            "36", "37", "38", "39", "40", "41",
            "42", "43", "44", "45", "46", "47",
            "48", "49", "50", "51", "52", "53",
            "54", "55", "56", "57", "58", "59"};


    //初始化
    public static void initNumberPicker(Context context, final NumberType numberType, NumberPicker numberPicker){

        numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        numberPicker.setDisplayedValues(pickNumberList(numberType));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(pickNumberList(numberType).length - 1);
        numberPicker.setValue(getIndexByNumberString(numberType));

        setNumberPickerDividerColor(context, numberPicker);

        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                String pickerValue = getNumberStringByIndex(pickNumberList(numberType), picker.getValue());
                String pickerOldValue = getNumberStringByIndex(pickNumberList(numberType), oldVal);
                String pickerNewValue = getNumberStringByIndex(pickNumberList(numberType), newVal);
                onCommentTimeValueChangeListener.setTimeCallback(numberType, pickerValue, pickerOldValue, pickerNewValue);
            }
        });
    }

    //选择数组
    private static String[] pickNumberList(NumberType numberType){

        switch (numberType){
            case HOURS:
                return numbers1;
            case MINUTES:
                return numbers2;
            default:
                break;
        }
        return numbers1;
    }

    //分割线样式
    private static void setNumberPickerDividerColor(Context context, NumberPicker numberPicker) {

        Field[] pickerFields = NumberPicker.class.getDeclaredFields();

        for (Field pf : pickerFields) {
            if (pf.getName().equals("mSelectionDivider")) {
                pf.setAccessible(true);
                try {
                    //设置分割线的颜色值 透明
                    pf.set(numberPicker, new ColorDrawable(context.getResources().getColor(android.R.color.transparent)));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Resources.NotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    //根据字符串判断下标
    private static int getIndexByNumberString(NumberType numberType){

        String text = "";

        Calendar calendar = Calendar.getInstance();

        switch (numberType){
            case MINUTES:
                text = String.valueOf(calendar.get(Calendar.MINUTE));
                break;
            case HOURS:
                text = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
                break;
        }

        String[] numbers = pickNumberList(numberType);

        int index = -1;
        for (int i=0;i<pickNumberList(numberType).length;i++) {
            if (numbers[i].equals(text)) {
                index = i;
                break;
            }
        }
        return index;
    }


    //根据下标判断字符串
    private static String getNumberStringByIndex(String[] numbers, int index){
        return numbers[index];
    }

    //监听抽象
    public interface OnCommentTimeValueChangeListener {
        void setTimeCallback(NumberType numberType, String pickValue, String oldValue, String newValue);
    }

    //监听方法
    public void setOnCommentTimeValueChangeListener(OnCommentTimeValueChangeListener onCommentTimeValueChangeListener) {
        NumberPickChangeUtil.onCommentTimeValueChangeListener = onCommentTimeValueChangeListener;
    }
}
