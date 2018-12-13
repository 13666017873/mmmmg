package com.example.resource.entity;

import java.util.List;

public class InfoDream {


    /**
     * reason : successed
     * result : [{"id":"59268ad2bff39c62c51c4915ba9bccab","title":"水 到处都是水","des":"无论你的梦里出现的是宁静的湖水、滴流的小溪、狂怒的河流、平静的海洋。"},{"id":"da178a4b589eeaca4ff332a2ebe11bee","title":"到处都是水","des":"无论你的梦里出现的是宁静的湖水、滴流的小溪、狂怒的河流、平静的海洋；梦中的水总是喻示着生命的精华，代表了精神的洗礼和重生。一旦你的生活变得复杂，你就有可能梦见自己遇水溺死；湖水象征着你想要尽快从烦乱的生活中挣脱出来，渴望过上宁静安稳的生活。洪水或者狂怒的江水喻示着你面临不能掌控的压力和局面。"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 59268ad2bff39c62c51c4915ba9bccab
         * title : 水 到处都是水
         * des : 无论你的梦里出现的是宁静的湖水、滴流的小溪、狂怒的河流、平静的海洋。
         */

        private String id;
        private String title;
        private String des;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }
}
