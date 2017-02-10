package com.yy.demo.utils;

import com.yy.demo.entity.FiveCate;
import com.yy.demo.entity.HomeBanner;
import com.yy.demo.entity.HomeList;
import com.yy.demo.entity.HotNews;
import com.yy.demo.entity.SupperMarket;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017/2/9.
 */

public class JsonUtils {

    public static Retrofit getRetrfit(){
//            实例化retrofit，配置好请求地址和解析方式
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.yuike.com/")  //★这里最后面必须能带“/”
                .addConverterFactory(GsonConverterFactory.create()) //设置将json解析为javabean所用的方式
                .build();
        return retrofit;
    }

//    轮播图api
    public interface HomeBannerAPI{

        @GET("gmall/api/1.0/home/banner_list.php?mid=457465&yk_pid=3&yk_appid=1&yk_cc=yuikemall&yk_cvc=317&cursor=0&count=40")
        public Call<HomeBanner> getJson();
    }
//    热点
    public interface HotNewsAPI{
        @GET("gmall/api/1.0/home/top_line.php?mid=457465&yk_pid=3&yk_appid=1&yk_cc=yuikemall&yk_cvc=317&cursor=0&count=40")
        public Call<HotNews> getJson();
    }
//    FiveCate
    public interface FivecateAPI{
        @GET("gmall/api/1.0/home/shortcut_list.php?mid=457465&pid=1&yk_pid=3&yk_appid=1&yk_cc=yuikemall&yk_cvc=317&cursor=0&count=40")
        public Call<FiveCate> getJson();
    }
//     SupperMarket
    public interface SuppoerMarketAPI{
        @GET("gmall/api/1.0/home/model_list.php?mid=457465&yk_pid=3&yk_appid=1&yk_cc=yuikemall&yk_cvc=317&cursor=0&count=40")
        public Call<SupperMarket> getJson();
    }

//    HomeList
    public interface HomeListAPI{
        @GET("gmall/api/1.0/allbuy/list.php?mid=457465&type=dress&category_ids=4796%2C4797%2C4798%2C4805%2C4838%2C4839%2C4840%2C4841%2C4843%2C4892%2C22150%2C22153%2C22155&channel_id=1464783721&sort=default&get_new=true&is_section=true&yk_pid=3&yk_appid=1&yk_cc=yuikemall&yk_cvc=317&cursor=0&count=40")
        public Call<HomeList> getJson();
    }

}
