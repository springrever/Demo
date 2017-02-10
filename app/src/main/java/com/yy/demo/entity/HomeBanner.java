package com.yy.demo.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/2/9.
 */

public  class HomeBanner {

    /**
     * msg :
     * ret : 0
     * data : {"items":[{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/6b86f6deb05fd000e849d4e9cf00d670.jpg","url":"beautymall://allbuy_list?mid=457465&type=dress&channel_id=1479956404&category_ids=22218&sort=default&title=%E7%99%BE%E6%90%AD%E8%BF%9E%E8%A1%A3%E8%A3%99"},{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/671e44106e17fe175bcee56d5e7f5983.jpg","url":"beautymall://allbuy_list?mid=457465&type=men&channel_id=1464784069&category_ids=0&sort=default&title=2017%E6%96%B0%E5%93%81%E7%94%B7%E8%A3%85"},{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/194e38604d7bb933d16454b4f22b1508.jpg","url":"beautymall://allbuy_list?mid=457465&type=dress&channel_id=1464783723&category_ids=4797,4798,4799,4805,22153,22168,22169,22170,22179,22215,22218&sort=default&title=2017%E5%A5%B3%E8%A3%85%E6%96%B0%E6%AC%BE"},{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/e5763b465073167088263d365f402ea5.jpg","url":"beautymall://allbuy_list?mid=457465&type=shoes&channel_id=1464783926&category_ids=0&sort=default&title=%E5%85%88%E5%88%B0%E5%85%88%E5%BE%97"}],"title":"首页Banner"}
     * publish_status : 0
     * publish_time : 1486345666
     */

    private String msg;
    private int ret;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * items : [{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/6b86f6deb05fd000e849d4e9cf00d670.jpg","url":"beautymall://allbuy_list?mid=457465&type=dress&channel_id=1479956404&category_ids=22218&sort=default&title=%E7%99%BE%E6%90%AD%E8%BF%9E%E8%A1%A3%E8%A3%99"},{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/671e44106e17fe175bcee56d5e7f5983.jpg","url":"beautymall://allbuy_list?mid=457465&type=men&channel_id=1464784069&category_ids=0&sort=default&title=2017%E6%96%B0%E5%93%81%E7%94%B7%E8%A3%85"},{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/194e38604d7bb933d16454b4f22b1508.jpg","url":"beautymall://allbuy_list?mid=457465&type=dress&channel_id=1464783723&category_ids=4797,4798,4799,4805,22153,22168,22169,22170,22179,22215,22218&sort=default&title=2017%E5%A5%B3%E8%A3%85%E6%96%B0%E6%AC%BE"},{"pic_url":"http://gouwu.cdn.yuike.com/data/img/457465/home_banner/e5763b465073167088263d365f402ea5.jpg","url":"beautymall://allbuy_list?mid=457465&type=shoes&channel_id=1464783926&category_ids=0&sort=default&title=%E5%85%88%E5%88%B0%E5%85%88%E5%BE%97"}]
         * title : 首页Banner
         */

        private List<ItemsBean> items;

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * pic_url : http://gouwu.cdn.yuike.com/data/img/457465/home_banner/6b86f6deb05fd000e849d4e9cf00d670.jpg
             * url : beautymall://allbuy_list?mid=457465&type=dress&channel_id=1479956404&category_ids=22218&sort=default&title=%E7%99%BE%E6%90%AD%E8%BF%9E%E8%A1%A3%E8%A3%99
             */

            private String pic_url;
            private String url;

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
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
