package com.example.resource.base;

import com.example.resource.entity.RequestBean;
import com.example.resource.entity.ResponseBean;
import com.google.gson.Gson;
import com.orhanobut.logger.Logger;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class AppPresenter {

//    protected ToolHttpService mApi = ToolsRetrofit.getInstance().create(ToolHttpService.class);
    private static final Gson gson = new Gson();

    /**
     * 1. 转换
     * 统一处理一些动作
     */
    public static <T> void convert(Observable<ResponseBean<T>> observable, Observer<T> observer) {
        observable
                .map(new Function<ResponseBean<T>, T>() {
                    @Override
                    public T apply(ResponseBean<T> httpResult) throws Exception {
                        // 打印响应的对象
                         Logger.e(String.valueOf(httpResult));

                        // TODO 实际开发的时候统一处理一些东西
                        if (httpResult == null || httpResult.head == null) {
                            throw new RuntimeException("请求数据异常");
                        } else if (!"1".equals(httpResult.head.bcode)) {
                            throw new RuntimeException(httpResult.head.bmessage);
                        }
                        return httpResult.data;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    /**
     * 2. 执行的方法
     */
    public static <T> void execute(Observable<ResponseBean<T>> observable, Observer<ResponseBean<T>> observer) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    /**
     * 3.请求数据是Json，Json转成RequestBody
     */
    public static RequestBody createRequestBody(Object obj) {
        RequestBean bean = new RequestBean<>(obj);
        String json = gson.toJson(bean);
        // 打印请求的Json
        Logger.json(json);
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        return body;
    }
}
