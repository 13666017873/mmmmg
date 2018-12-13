package com.example.resource.tools_kit;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ToolHttpService {

    @GET
    Observable<String> doGet(@Url String url);

    @GET
    Observable<String> doGetParams(@Url String url,
                                   @QueryMap Map<String, Object> params);

    @POST
    Observable<String> doPost(@Url String url,
                              @QueryMap Map<String, Object> params,
                              @Body Map<String, Object> body);
}
