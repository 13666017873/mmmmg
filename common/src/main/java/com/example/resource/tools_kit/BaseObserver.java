package com.example.resource.tools_kit;

import android.accounts.NetworkErrorException;
import android.app.ProgressDialog;
import android.content.Context;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class BaseObserver<T> implements Observer<T> {

    private Context mContext;

    public BaseObserver(Context cxt) {
        this.mContext = cxt;
    }

    protected BaseObserver() {

    }

    @Override
    public void onSubscribe(Disposable d) {
        onRequestStart();

    }

    @Override
    public void onNext(T t) {
        onRequestEnd();
        try {
            onSuccess(t.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable e) {
//        Log.w(TAG, "onError: ", );这里可以打印错误信息
        onRequestEnd();
        try {
            if (e instanceof ConnectException
                    || e instanceof TimeoutException
                    || e instanceof NetworkErrorException
                    || e instanceof UnknownHostException) {
                onFailure(e, true);
            } else {
                onFailure(e, false);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void onComplete() {
    }

    /**
     * 返回成功
     *
     * @param t
     */
    protected abstract void onSuccess(String t);

    /**
     * 返回成功了,但是code错误
     *
     * @param t
     * @throws Exception
     */
    protected void onCodeError(String t) throws Exception {
    }

    /**
     * 返回失败
     *
     * @param e
     * @param isNetWorkError 是否是网络错误
     */
    protected abstract void onFailure(Throwable e, boolean isNetWorkError);

    private void onRequestStart() {
    }

    private void onRequestEnd() {
        closeProgressDialog();
    }

    public void showProgressDialog() {
        ProgressDialog.show(mContext, "", "请稍后");
    }

    private void closeProgressDialog() {
//        ProgressDialog.cancle();
    }
}
