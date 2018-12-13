package com.example.resource.http;


import com.example.resource.tools_kit.ToolHttpService;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import static com.example.resource.tools_kit.ToolApi.BASE_URL;

public abstract class ToolsHttp {

    public abstract void onSuccess();

    public abstract void onFail();

    public static void initToolsHttp(String url, Map<String, Object> params){
//        ToolHttpService api = create();
//        Observable<String> result = api.doGet(url, params);
//        result.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<String>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(String s) {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
    }

    private static ToolHttpService create(){

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();

         return retrofit.create(ToolHttpService.class);
    }
}
