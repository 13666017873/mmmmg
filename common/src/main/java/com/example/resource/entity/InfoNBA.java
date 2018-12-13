package com.example.resource.entity;

import java.util.List;

public class InfoNBA {

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {

        private String title;
        private StatuslistBean statuslist;
        private List<ListBean> list;
        private List<TeammatchBean> teammatch;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public StatuslistBean getStatuslist() {
            return statuslist;
        }

        public void setStatuslist(StatuslistBean statuslist) {
            this.statuslist = statuslist;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<TeammatchBean> getTeammatch() {
            return teammatch;
        }

        public void setTeammatch(List<TeammatchBean> teammatch) {
            this.teammatch = teammatch;
        }

        public static class StatuslistBean {

            private String st0;
            private String st1;
            private String st2;

            public String getSt0() {
                return st0;
            }

            public void setSt0(String st0) {
                this.st0 = st0;
            }

            public String getSt1() {
                return st1;
            }

            public void setSt1(String st1) {
                this.st1 = st1;
            }

            public String getSt2() {
                return st2;
            }

            public void setSt2(String st2) {
                this.st2 = st2;
            }
        }

        public static class ListBean {

            private String title;
            private List<TrBean> tr;
            private List<BottomlinkBean> bottomlink;
            private List<LiveBean> live;
            private List<LivelinkBean> livelink;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<TrBean> getTr() {
                return tr;
            }

            public void setTr(List<TrBean> tr) {
                this.tr = tr;
            }

            public List<BottomlinkBean> getBottomlink() {
                return bottomlink;
            }

            public void setBottomlink(List<BottomlinkBean> bottomlink) {
                this.bottomlink = bottomlink;
            }

            public List<LiveBean> getLive() {
                return live;
            }

            public void setLive(List<LiveBean> live) {
                this.live = live;
            }

            public List<LivelinkBean> getLivelink() {
                return livelink;
            }

            public void setLivelink(List<LivelinkBean> livelink) {
                this.livelink = livelink;
            }

            public static class TrBean {


                private String link1text;
                private String link1url;
                private String link2text;
                private String link2url;
                private String player1;
                private String player1logo;
                private String player1logobig;
                private String player1url;
                private String player2;
                private String player2logo;
                private String player2logobig;
                private String player2url;
                private String score;
                private int status;
                private String time;

                public String getLink1text() {
                    return link1text;
                }

                public void setLink1text(String link1text) {
                    this.link1text = link1text;
                }

                public String getLink1url() {
                    return link1url;
                }

                public void setLink1url(String link1url) {
                    this.link1url = link1url;
                }

                public String getLink2text() {
                    return link2text;
                }

                public void setLink2text(String link2text) {
                    this.link2text = link2text;
                }

                public String getLink2url() {
                    return link2url;
                }

                public void setLink2url(String link2url) {
                    this.link2url = link2url;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer1logo() {
                    return player1logo;
                }

                public void setPlayer1logo(String player1logo) {
                    this.player1logo = player1logo;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer2logo() {
                    return player2logo;
                }

                public void setPlayer2logo(String player2logo) {
                    this.player2logo = player2logo;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class BottomlinkBean {
                /**
                 * text : 常规赛赛程
                 * url : http://nba.sports.sina.com.cn/match_result.php
                 */

                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class LiveBean {
                /**
                 * date : 2014-12-08
                 * liveurl : http://video.sina.com.cn/l/pl/sportstv/1691558.html
                 * player1 : 鹈鹕
                 * player1info : 胜8负10-西部11名
                 * player1location : (客)
                 * player1logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/3.png
                 * player1logobig : http://p5.qhimg.com/t01d4114e4e03806e71.png
                 * player1url : http://nba.sports.sina.com.cn/team.php?id=3
                 * player2 : 湖人
                 * player2info : 胜5负15-西部14名
                 * player2location : (主)
                 * player2logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/13.png
                 * player2logobig : http://p3.qhimg.com/t01f3bf12583c6c0c67.png
                 * player2url : http://nba.sports.sina.com.cn/team.php?id=13
                 * score : VS
                 * status : 0
                 * title : 今日热门  10:30开赛
                 */

                private String date;
                private String liveurl;
                private String player1;
                private String player1info;
                private String player1location;
                private String player1logo;
                private String player1logobig;
                private String player1url;
                private String player2;
                private String player2info;
                private String player2location;
                private String player2logo;
                private String player2logobig;
                private String player2url;
                private String score;
                private int status;
                private String title;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getLiveurl() {
                    return liveurl;
                }

                public void setLiveurl(String liveurl) {
                    this.liveurl = liveurl;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer1info() {
                    return player1info;
                }

                public void setPlayer1info(String player1info) {
                    this.player1info = player1info;
                }

                public String getPlayer1location() {
                    return player1location;
                }

                public void setPlayer1location(String player1location) {
                    this.player1location = player1location;
                }

                public String getPlayer1logo() {
                    return player1logo;
                }

                public void setPlayer1logo(String player1logo) {
                    this.player1logo = player1logo;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer2info() {
                    return player2info;
                }

                public void setPlayer2info(String player2info) {
                    this.player2info = player2info;
                }

                public String getPlayer2location() {
                    return player2location;
                }

                public void setPlayer2location(String player2location) {
                    this.player2location = player2location;
                }

                public String getPlayer2logo() {
                    return player2logo;
                }

                public void setPlayer2logo(String player2logo) {
                    this.player2logo = player2logo;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }

            public static class LivelinkBean {
                /**
                 * text : 视频直播
                 * url : http://video.sina.com.cn/l/pl/sportstv/1691558.html
                 * videoicon : 1
                 */

                private String text;
                private String url;
                private String videoicon;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getVideoicon() {
                    return videoicon;
                }

                public void setVideoicon(String videoicon) {
                    this.videoicon = videoicon;
                }
            }
        }

        public static class TeammatchBean {
            /**
             * name : 老鹰
             * url : http://nba.sports.sina.com.cn/team_match.php?id=1
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
