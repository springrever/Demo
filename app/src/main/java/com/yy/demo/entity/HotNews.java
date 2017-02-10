package com.yy.demo.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/2/9.
 */

public class HotNews {

    /**
     * ret : 0
     * msg : ok
     * data : {"items":[{"id":"1482205738","sub_tag":"男装","sub_title":"时尚永远不晚","title":"直击2017米兰时装周型男服饰","url":"beautymall://allbuy_list?mid=457465&type=men&channel_id=1464784069&category_ids=0&sort=default&title=%E7%9B%B4%E5%87%BB2017%E7%B1%B3%E5%85%B0%E6%97%B6%E8%A3%85%E5%91%A8%E5%9E%8B%E7%94%B7%E6%9C%8D%E9%A5%B0"},{"id":"1483681217","sub_tag":"上新","sub_title":"优惠有限 抢先购","title":"2017海量女装新款上市","url":"beautymall://allbuy_list?mid=457465&type=dress&channel_id=1464783723&category_ids=4797,4798,4799,4805,22153,22168,22169,22170,22179,22215,22218&sort=default&title=2017%E6%B5%B7%E9%87%8F%E5%A5%B3%E8%A3%85%E6%96%B0%E6%AC%BE%E4%B8%8A%E5%B8%82"},{"id":"1481277912","sub_tag":"特卖","sub_title":"19.9元包邮到家","title":"金鸡报晓 好礼迎春 母婴用品专场","url":"beautymall://web?url=https%3A%2F%2Fmarket.m.taobao.com%2Fmarkets%2Fqbb%2Findex%2Fphone%3Fspm%3Da219t.7664554.1998457203.315.oJAWoM&type=taobao&title=%E9%87%91%E9%B8%A1%E6%8A%A5%E6%99%93+%E5%A5%BD%E7%A4%BC%E8%BF%8E%E6%98%A5+%E6%AF%8D%E5%A9%B4%E7%94%A8%E5%93%81%E4%B8%93%E5%9C%BA"},{"id":"1484536997","sub_tag":"特惠","sub_title":"千款手机 先到先得","title":"抢爆款尖货手机千元优惠","url":"beautymall://allbuy_list?mid=457465&type=digitaloffice&channel_id=1468223414&category_ids=4958&sort=default&title=%E6%8A%A2%E7%88%86%E6%AC%BE%E5%B0%96%E8%B4%A7%E6%89%8B%E6%9C%BA%E5%8D%83%E5%85%83%E4%BC%98%E6%83%A0"}],"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_top_line/c53e31232c7b86c1b6e702b9c12b207c.jpg","title":"热点头条","url":"beautymall://web?url=http%3A%2F%2Fwww.yuike.com%2Fallbuy%2Findex.shtml&type=normal&title=%E7%83%AD%E7%82%B9%E5%A4%B4%E6%9D%A1"}
     */

    private int ret;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * items : [{"id":"1482205738","sub_tag":"男装","sub_title":"时尚永远不晚","title":"直击2017米兰时装周型男服饰","url":"beautymall://allbuy_list?mid=457465&type=men&channel_id=1464784069&category_ids=0&sort=default&title=%E7%9B%B4%E5%87%BB2017%E7%B1%B3%E5%85%B0%E6%97%B6%E8%A3%85%E5%91%A8%E5%9E%8B%E7%94%B7%E6%9C%8D%E9%A5%B0"},{"id":"1483681217","sub_tag":"上新","sub_title":"优惠有限 抢先购","title":"2017海量女装新款上市","url":"beautymall://allbuy_list?mid=457465&type=dress&channel_id=1464783723&category_ids=4797,4798,4799,4805,22153,22168,22169,22170,22179,22215,22218&sort=default&title=2017%E6%B5%B7%E9%87%8F%E5%A5%B3%E8%A3%85%E6%96%B0%E6%AC%BE%E4%B8%8A%E5%B8%82"},{"id":"1481277912","sub_tag":"特卖","sub_title":"19.9元包邮到家","title":"金鸡报晓 好礼迎春 母婴用品专场","url":"beautymall://web?url=https%3A%2F%2Fmarket.m.taobao.com%2Fmarkets%2Fqbb%2Findex%2Fphone%3Fspm%3Da219t.7664554.1998457203.315.oJAWoM&type=taobao&title=%E9%87%91%E9%B8%A1%E6%8A%A5%E6%99%93+%E5%A5%BD%E7%A4%BC%E8%BF%8E%E6%98%A5+%E6%AF%8D%E5%A9%B4%E7%94%A8%E5%93%81%E4%B8%93%E5%9C%BA"},{"id":"1484536997","sub_tag":"特惠","sub_title":"千款手机 先到先得","title":"抢爆款尖货手机千元优惠","url":"beautymall://allbuy_list?mid=457465&type=digitaloffice&channel_id=1468223414&category_ids=4958&sort=default&title=%E6%8A%A2%E7%88%86%E6%AC%BE%E5%B0%96%E8%B4%A7%E6%89%8B%E6%9C%BA%E5%8D%83%E5%85%83%E4%BC%98%E6%83%A0"}]
         * pic_url : http://gouwu.cdn.yuike.com/data/img/457465/home_top_line/c53e31232c7b86c1b6e702b9c12b207c.jpg
         * title : 热点头条
         * url : beautymall://web?url=http%3A%2F%2Fwww.yuike.com%2Fallbuy%2Findex.shtml&type=normal&title=%E7%83%AD%E7%82%B9%E5%A4%B4%E6%9D%A1
         */

        private String pic_url;
        private String title;
        private List<ItemsBean> items;

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

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * id : 1482205738
             * sub_tag : 男装
             * sub_title : 时尚永远不晚
             * title : 直击2017米兰时装周型男服饰
             * url : beautymall://allbuy_list?mid=457465&type=men&channel_id=1464784069&category_ids=0&sort=default&title=%E7%9B%B4%E5%87%BB2017%E7%B1%B3%E5%85%B0%E6%97%B6%E8%A3%85%E5%91%A8%E5%9E%8B%E7%94%B7%E6%9C%8D%E9%A5%B0
             */

            private String sub_tag;
            private String sub_title;
            private String title;

            public String getSub_tag() {
                return sub_tag;
            }

            public void setSub_tag(String sub_tag) {
                this.sub_tag = sub_tag;
            }

            public String getSub_title() {
                return sub_title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
