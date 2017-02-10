package com.yy.demo.home_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.squareup.picasso.Picasso;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.yy.demo.R;
import com.yy.demo.entity.FiveCate;
import com.yy.demo.entity.GuideImageLoader;
import com.yy.demo.entity.HomeBanner;
import com.yy.demo.entity.HomeList;
import com.yy.demo.entity.HotNews;
import com.yy.demo.entity.SupperMarket;
import com.yy.demo.utils.JsonUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */

public class RecomFragment extends Fragment {

    private XRecyclerView mXRecyclerView;
    private Banner banner;
    private List<String> mBannerImgs = new ArrayList<>();
    private ImageView hotnews;
    private TextView hotnews_sub_tag;
    private TextView hotnews_sub_title;
    private TextView hotnews_title;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private ImageView mid;
    private ImageView bottom_left_top;
    private ImageView bottom_left_bottom;
    private ImageView bottom_right_top;
    private ImageView bottom_right_bottom;
    private ImageView top_left_bottom;
    private ImageView top_left_top;

    private ImageView top_right_top;
    private ImageView top_right_bottom_left;
    private ImageView top_right_bottom_right;


    private List<HomeList.DataBean.ObjectsBean> list = new ArrayList<>();
    public RecomFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_recom,null);
        initHomeListRetrofit(root);
        initView(root);
        initBannerRetrofit(); //初始化retrofit
        initHotNewsRetrofit();
        initFiveCateRetrofit();
        initSupermarketRetrofit();

        return root;
    }


    //    初始化控件
    private void initView(View root) {
        mXRecyclerView = (XRecyclerView) root.findViewById(R.id.xrecycleView);


//        给xrecyclerview添加布局
        GridLayoutManager manager = new GridLayoutManager(getContext(),2, LinearLayoutManager.VERTICAL,false);
        mXRecyclerView.setLayoutManager(manager);
        mXRecyclerView.setAdapter(new MyHomeXRAdapter());

//        添加头文件
        View head  = View.inflate(getContext(),R.layout.home_recom_grid_head,null);
//        View head = LayoutInflater.from(getContext()).inflate(R.layout.home_recom_grid_head,null,false);

        mXRecyclerView.addHeaderView(head);

//        初始化头布局控件
        initHeadView(head);

    }

//        初始化头布局控件
    private void initHeadView(View head) {
        banner = (Banner) head.findViewById(R.id.home_recom_banner);
        hotnews = (ImageView) head.findViewById(R.id.hotnews);
        hotnews_sub_tag = (TextView) head.findViewById(R.id.hotnews_sub_tag);
        hotnews_title = (TextView) head.findViewById(R.id.hotnews_title);
        hotnews_sub_title = (TextView) head.findViewById(R.id.hotnews_sub_title);
        btn1 = (Button) head.findViewById(R.id.btn1);
        btn2 = (Button) head.findViewById(R.id.btn2);
        btn3 = (Button) head.findViewById(R.id.btn3);
        btn4 = (Button) head.findViewById(R.id.btn4);
        btn5 = (Button) head.findViewById(R.id.btn5);
        img1 = (ImageView) head.findViewById(R.id.img1);
        img2 = (ImageView) head.findViewById(R.id.img2);
        img3 = (ImageView) head.findViewById(R.id.img3);
        img4 = (ImageView) head.findViewById(R.id.img4);
        img5 = (ImageView) head.findViewById(R.id.img5);

        mid = (ImageView) head.findViewById(R.id.mid);

        bottom_left_top = (ImageView) head.findViewById(R.id.bottom_left_top);
        bottom_left_bottom = (ImageView) head.findViewById(R.id.bottom_left_bottom);
        bottom_right_top = (ImageView) head.findViewById(R.id.bottom_right_top);
        bottom_right_bottom = (ImageView) head.findViewById(R.id.bottom_right_bottom);
        top_left_bottom = (ImageView) head.findViewById(R.id.top_left_bottom);
        top_left_top = (ImageView) head.findViewById(R.id.top_left_top);
        top_right_top = (ImageView) head.findViewById(R.id.top_right_top);
        top_right_bottom_left = (ImageView) head.findViewById(R.id.top_right_bottom_left);
        top_right_bottom_right = (ImageView) head.findViewById(R.id.top_right_bottom_right);


    }

//  XRecyclerView适配器
    class MyHomeXRAdapter extends RecyclerView.Adapter<MyHomeXRAdapter.MyHomeHolder>{


        @Override
        public MyHomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(parent.getContext(),R.layout.grid_item,null);
            MyHomeHolder holder = new MyHomeHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(MyHomeHolder holder, int position) {


            switch (list.get(position).getSource_type()){
                case 2:

//                    Glide.with(getContext()).load(list.get(position).getGmall_product().getPic_url()).into(holder.homlist_img);
                    Picasso.with(getContext()).load(list.get(position).getGmall_product().getPic_url()).into(holder.homlist_img);
                    System.out.println("xoxo"+list.get(position).getGmall_product().getPic_url());
                    holder.homelist_title.setText(list.get(position).getGmall_product().getTitle());
                    holder.homelist_price.setText(list.get(position).getGmall_product().getMoney_symbol() + list.get(position).getGmall_product().getSelling_price());
                    holder.homelist_count.setText(list.get(position).getGmall_product().getSales_volume());
                    break;
                default:
                    break;
            }
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyHomeHolder extends RecyclerView.ViewHolder{
            ImageView homlist_img;
            TextView homelist_title;
            TextView homelist_price;
            TextView homelist_count;

            public MyHomeHolder(View itemView) {
                super(itemView);
                homlist_img = (ImageView) itemView.findViewById(R.id.homlist_img);
                homelist_title = (TextView) itemView.findViewById(R.id.homelist_title);
                homelist_price = (TextView) itemView.findViewById(R.id.homelist_price);
                homelist_count = (TextView) itemView.findViewById(R.id.homelist_count);
            }

        }
    }
//  banner retrofit
    private void initBannerRetrofit() {
        Retrofit mRetrofit = JsonUtils.getRetrfit();

        JsonUtils.HomeBannerAPI  homeBannerAPI =
                mRetrofit.create(JsonUtils.HomeBannerAPI.class);

        Call<HomeBanner> call = homeBannerAPI.getJson();
        call.enqueue(new Callback<HomeBanner>() {
            @Override
            public void onResponse(Call<HomeBanner> call, Response<HomeBanner> response) {
                HomeBanner body = response.body();
                List<HomeBanner.DataBean.ItemsBean> items = body.getData().getItems();
                mBannerImgs.clear();
                for (HomeBanner.DataBean.ItemsBean item:items){
                    String path  = item.getPic_url().toString();
                    mBannerImgs.add(path);
                }
//                增加图片
                addBannerImg();

            }

            @Override
            public void onFailure(Call<HomeBanner> call, Throwable t) {

            }
        });
    }
//  banner添加图片
    private void addBannerImg() {
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.setImageLoader(new GuideImageLoader());
        banner.setImages(mBannerImgs);
        banner.isAutoPlay(true);
        banner.setDelayTime(2500);
        banner.start();


    }
//  HotNews retrofit
    private HotNews body;
    private void initHotNewsRetrofit() {
        Retrofit retrofit = JsonUtils.getRetrfit();
        JsonUtils.HotNewsAPI hotNewAPI = retrofit.create(JsonUtils.HotNewsAPI.class);

        Call<HotNews> call = hotNewAPI.getJson();
        call.enqueue(new Callback<HotNews>() {
            @Override
            public void onResponse(Call<HotNews> call, Response<HotNews> response) {
                body= response.body();
                String pic_url = body.getData().getPic_url().toString();//获取热点图片
                Glide.with(getContext()).load(pic_url).into(hotnews);
                hotnews_title.setText(body.getData().getItems().get(0).getTitle());
                hotnews_sub_tag.setText(body.getData().getItems().get(0).getSub_tag());
                hotnews_sub_title.setText(body.getData().getItems().get(0).getSub_title());

                banner.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        if ((position-1)<4&&(position-1)>0||(position-1)==0){
                            hotnews_title.setText(body.getData().getItems().get(position-1).getTitle());
                            hotnews_sub_tag.setText(body.getData().getItems().get(position-1).getSub_tag());
                            hotnews_sub_title.setText(body.getData().getItems().get(position-1).getSub_title());
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
            }

            @Override
            public void onFailure(Call<HotNews> call, Throwable t) {

            }
        });
    }

//    5种分类
    private void initFiveCateRetrofit() {
        Retrofit retrofit = JsonUtils.getRetrfit();

        JsonUtils.FivecateAPI fivecateAPI = retrofit.create(JsonUtils.FivecateAPI.class);

        Call<FiveCate> call =  fivecateAPI.getJson();

        call.enqueue(new Callback<FiveCate>() {
            @Override
            public void onResponse(Call<FiveCate> call, Response<FiveCate> response) {
                FiveCate body = response.body();
                String path0 = body.getData().get(0).getPic_url();
                Glide.with(getContext()).load(path0).into(img1);
                btn1.setText(body.getData().get(0).getTitle());
                String path1 = body.getData().get(1).getPic_url();
                Glide.with(getContext()).load(path1).into(img2);
                btn2.setText(body.getData().get(1).getTitle());
                String path2 = body.getData().get(2).getPic_url();
                Glide.with(getContext()).load(path2).into(img3);
                btn3.setText(body.getData().get(2).getTitle());
                String path3 = body.getData().get(3).getPic_url();
                Glide.with(getContext()).load(path3).into(img4);
                btn4.setText(body.getData().get(3).getTitle());
                String path4 = body.getData().get(4).getPic_url();
                Glide.with(getContext()).load(path4).into(img5);
                btn5.setText(body.getData().get(4).getTitle());


            }

            @Override
            public void onFailure(Call<FiveCate> call, Throwable t) {

            }
        });
    }

//    SupperMarket retrofit
    private String path = "http://gouwu.cdn.yuike.com/data/img/457465/home_model/f3fe6468ff9f8504d987e37f70def4be.jpg";
    private String bottom_left_toppath = "http://gouwu.cdn.yuike.com/data/img/457465/home_model/6489aae41e71a87c36ca927da1c07be3.jpg";
    private String bottom_left_bottompath = "http://gouwu.cdn.yuike.com/data/img/457465/home_model/9648d37a07559b089b42fac1e58a0ca1.jpg";
    private String bottom_right_toppathpath = "http://gouwu.cdn.yuike.com/data/img/457465/home_model/dfb8a5d540db74876e6d67036c06c239.jpg";
    private String bottom_right_bottompath = "http://gouwu.cdn.yuike.com/data/img/457465/home_model/66b8038998fcaa05d1c21fd29befd45b.jpg";
    private void initSupermarketRetrofit() {
        Retrofit retrofit = JsonUtils.getRetrfit();
        JsonUtils.SuppoerMarketAPI smAPI =
                retrofit.create(JsonUtils.SuppoerMarketAPI.class);
        Call<SupperMarket> call = smAPI.getJson();
        call.enqueue(new Callback<SupperMarket>() {
            @Override
            public void onResponse(Call<SupperMarket> call, Response<SupperMarket> response) {
                SupperMarket body = response.body();
                List<SupperMarket.DataBean> data = body.getData();
                Glide.with(getContext()).load(path).into(mid);
                Glide.with(getContext()).load(bottom_left_toppath).into(bottom_left_top);
                Glide.with(getContext()).load(bottom_left_bottompath).into(bottom_left_bottom);
                Glide.with(getContext()).load(bottom_right_toppathpath).into(bottom_right_top);
                Glide.with(getContext()).load(bottom_right_bottompath).into(bottom_right_bottom);

                List<SupperMarket.DataBean.ContentDataBean.TqgLeftPartBean.ItemsBean> items = data.get(0).getContent_data().getTqg_left_part().getItems();
                Glide.with(getContext()).load(data.get(0).getContent_data().getTqg_left_part().getTop_pic_url()).into(top_left_top);
                Glide.with(getContext()).load(items.get(2).getPic_url()).into(top_left_bottom);
                String top_right_toppath = data.get(0).getContent_data().getTqg_right_part().getRight_top_part().getPic_url();
                Glide.with(getContext()).load(top_right_toppath).into(top_right_top);

                List<SupperMarket.DataBean.ContentDataBean.TqgRightPartBean.RightBottomPartBean> top_right_bottom_part = data.get(0).getContent_data().getTqg_right_part().getRight_bottom_part();
                Glide.with(getContext()).load(top_right_bottom_part.get(0).getPic_url()).into(top_right_bottom_left);
                Glide.with(getContext()).load(top_right_bottom_part.get(1).getPic_url()).into(top_right_bottom_right);
            }

            @Override
            public void onFailure(Call<SupperMarket> call, Throwable t) {

            }
        });
    }

//    HomeList retrofit
    private void initHomeListRetrofit(View view) {
        ImageView homelist_img = (ImageView) view.findViewById(R.id.homlist_img);
        Retrofit retrofit = JsonUtils.getRetrfit();
        JsonUtils.HomeListAPI homeListAPI = retrofit.create(JsonUtils.HomeListAPI.class);
        Call<HomeList> call = homeListAPI.getJson();
        call.enqueue(new Callback<HomeList>() {
            @Override
            public void onResponse(Call<HomeList> call, Response<HomeList> response) {
                HomeList body = response.body();
                List<HomeList.DataBean.ObjectsBean> objects = body.getData().getObjects();
                list.clear();
                for (HomeList.DataBean.ObjectsBean bra:objects){
                    list.add(bra);
                }

            }

            @Override
            public void onFailure(Call<HomeList> call, Throwable t) {

            }
        });
    }
}