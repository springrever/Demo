package com.yy.demo.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/2/10.
 */

public class FiveCate {

    /**
     * ret : 0
     * msg : ok
     * data : [{"action":"beautymall://web?url=http%3A%2F%2Ftemai.m.taobao.com%2Fsearch.htm%3Feh%3Dd2vLsEmyVK31xBQqYNwtVsLUHrOBqpexX9iCfKlIJzmie%252FpBy9wBFg%253D%253D%26spm%3Da219t.7664554.1998457203.366.iT2r4f%26q%3D%25E8%25BF%259E%25E8%25A1%25A3%25E8%25A3%2599&type=taobao&title=%E4%BB%8A%E6%97%A5%E7%89%B9%E5%8D%96","pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_shortcut/c9b1e922c57225b4e9c4a672e414d23d.jpg","title":"今日特卖"},{"action":"beautymall://activity?activity_id=1464944071&activity_type=1&title=0%E5%85%83%E8%B4%AD","pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_shortcut/d542210e4c46f8810574cbf857db292a.jpg","title":"免费领"},{"action":"beautymall://ninenine_list?mid=457465&channel_id=1466666406&category_ids=0&sort=default&title=9%E5%9D%979","pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_shortcut/d8178b1f41d2e2ba3950f2ef91190c33.jpg","title":"9块9"},{"action":"beautymall://web?url=https%3A%2F%2Fuland.taobao.com%2Fcoupon%2Felist%3Fspm%3Da219t.7664554.1998457203.243.0BgXmb&type=taobao&title=%E4%BC%98%E6%83%A0%E5%88%B8","pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_shortcut/cef60d07809477701a761184635b11dd.jpg","title":"优惠券"},{"action":"beautymall://allbuy_list?mid=457465&type=20k&channel_id=1481507324&category_ids=0&sort=default&title=20%E5%85%83","pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_shortcut/6a9729bdaf552e3ccbb0748c63a5d9e5.jpg","title":"20元"}]
     */

    private int ret;
    private String msg;
    private List<DataBean> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
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
         * action : beautymall://web?url=http%3A%2F%2Ftemai.m.taobao.com%2Fsearch.htm%3Feh%3Dd2vLsEmyVK31xBQqYNwtVsLUHrOBqpexX9iCfKlIJzmie%252FpBy9wBFg%253D%253D%26spm%3Da219t.7664554.1998457203.366.iT2r4f%26q%3D%25E8%25BF%259E%25E8%25A1%25A3%25E8%25A3%2599&type=taobao&title=%E4%BB%8A%E6%97%A5%E7%89%B9%E5%8D%96
         * pic_url : http://gouwu.cdn.yuike.com/data/img/457465/home_shortcut/c9b1e922c57225b4e9c4a672e414d23d.jpg
         * title : 今日特卖
         */

        private String action;
        private String pic_url;
        private String title;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
