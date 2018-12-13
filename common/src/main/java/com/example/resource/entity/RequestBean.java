package com.example.resource.entity;

public class RequestBean<T> {
    /**
     * 请求头默认带的
     */
    public RequestHead head;
    /**
     * 请求的数据，不固定
     */
    public T data;

    public RequestBean() {
        this(null);
    }

    public RequestBean(T data) {
        this.data = data;
        this.head = new RequestHead();
    }
}
