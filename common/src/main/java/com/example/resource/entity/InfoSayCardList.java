package com.example.resource.entity;

import java.util.List;

public class InfoSayCardList {


    /**
     * code : 200
     * data : [{"authorid":"513038598497370112","backgroundpic":"saycard_emoji_03","content":"嘤嘤嘤","createtime":"2018-11-16 22:17:03","followcount":0,"islike":0,"likecount":0,"saycardid":"513115308920143872","title":"嘤嘤嘤"}]
     * msg : success
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * authorid : 513038598497370112
         * backgroundpic : saycard_emoji_03
         * content : 嘤嘤嘤
         * createtime : 2018-11-16 22:17:03
         * followcount : 0
         * islike : 0
         * likecount : 0
         * saycardid : 513115308920143872
         * title : 嘤嘤嘤
         */

        private String authorid;
        private String backgroundpic;
        private String content;
        private String createtime;
        private int followcount;
        private int islike;
        private int likecount;
        private String saycardid;
        private String title;

        public String getAuthorid() {
            return authorid;
        }

        public void setAuthorid(String authorid) {
            this.authorid = authorid;
        }

        public String getBackgroundpic() {
            return backgroundpic;
        }

        public void setBackgroundpic(String backgroundpic) {
            this.backgroundpic = backgroundpic;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public int getFollowcount() {
            return followcount;
        }

        public void setFollowcount(int followcount) {
            this.followcount = followcount;
        }

        public int getIslike() {
            return islike;
        }

        public void setIslike(int islike) {
            this.islike = islike;
        }

        public int getLikecount() {
            return likecount;
        }

        public void setLikecount(int likecount) {
            this.likecount = likecount;
        }

        public String getSaycardid() {
            return saycardid;
        }

        public void setSaycardid(String saycardid) {
            this.saycardid = saycardid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
