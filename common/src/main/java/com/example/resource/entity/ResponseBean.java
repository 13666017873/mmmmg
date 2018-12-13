package com.example.resource.entity;

public class ResponseBean<T> {

    /**
     * 响应头，默认返回
     */
    public ResponseHead head;
    /**
     * 返回的数据，不固定
     */
    public T data;
}
