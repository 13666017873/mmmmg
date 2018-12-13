package com.example.resource.tools_kit;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.internal.EverythingIsNonNull;

import static com.example.resource.tools_kit.ToolApi.BASE_URL;


public class ToolsRetrofit {

    /**
     * 超时时间
     */
    private static final int TIMEOUT = 60;
    private static volatile ToolsRetrofit mInstance;
    private Retrofit mRetrofit;

    public static ToolsRetrofit getInstance() {
        if (mInstance == null) {
            synchronized (ToolsRetrofit.class) {
                if (mInstance == null) {
                    mInstance = new ToolsRetrofit();
                }
            }
        }
        return mInstance;
    }

    private ToolsRetrofit() {
        initRetrofit();
    }

    /**
     * 初始化Retrofit
     */
    private void initRetrofit() {

        mRetrofit = new Retrofit.Builder()
                // 设置请求的域名
                .baseUrl(BASE_URL)
                // 设置解析转换工厂，用自己定义的
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient)
                .build();
    }

    /**
     * 创建get请求
     */
    public Observable<String> doGetParams(Class<ToolHttpService> toolHttpService,
                                          String url,
                                          Map<String, Object> params) {

        //公共请求参数
        params.put("key", "daa603f211d51f96443da1c44940044a");

        return mRetrofit
                .create(toolHttpService)
                .doGetParams(url, params)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    @EverythingIsNonNull
    private static OkHttpClient httpClient = new OkHttpClient.Builder()
            // 添加通用的Header
            .addInterceptor(new Interceptor() {
                @Override
                public okhttp3.Response intercept(Chain chain) throws IOException {
                    Request.Builder builder = chain.request().newBuilder();
//                    builder.addHeader("key", "daa603f211d51f96443da1c44940044a");
                    return chain.proceed(builder.build());
                }
            })
            .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    HttpLoggingInterceptor.Logger.DEFAULT.log(message);
                }
            }).setLevel(HttpLoggingInterceptor.Level.BASIC))
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build();
}
