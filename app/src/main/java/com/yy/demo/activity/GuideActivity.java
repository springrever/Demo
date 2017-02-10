package com.yy.demo.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerClickListener;
import com.yy.demo.MainActivity;
import com.yy.demo.R;
import com.yy.demo.entity.GuideImageLoader;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends Activity {
   /* //三个view
    List<View> datas=new ArrayList<>();
    //三个点
    ImageView images[]=new ImageView[3];
    ImageView[] imageViews = new ImageView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initData();
        initView();
    }

    private void initData() {

        ImageView imageView=null;

        for (int i = 0; i < 3; i++) {
//            TextView x=new TextView(this);
//            x.setText("aaa"+i);

            imageView= new ImageView(this);
            imageViews[i]=imageView;


            if(i==2){
                imageView.setClickable(true);
                imageView.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        jump();
                    }
                });
            }
            datas.add(imageView);
        }

        imageViews[0].setImageResource(R.drawable.yuike_waterfallv2_t2);
        imageViews[1].setImageResource(R.drawable.yuike_waterfallv2_t3);
        imageViews[2].setImageResource(R.drawable.yuike_waterfallv2_t4);
    }

    private void jump() {
        SharedPreferences sp = getSharedPreferences("args", Context.MODE_PRIVATE);
        sp.edit().putBoolean("isFirst",false).commit();
        Intent it=new Intent(this, MainActivity.class);
        startActivity(it);
        finish();
    }

    private void initView() {
        ViewPager vp= (ViewPager) findViewById(R.id.first_vp);
        vp.setOnPageChangeListener(new A());
        vp.setAdapter(new Adapter_vp());
        // vp.setCurrentItem();
        LinearLayout ll= (LinearLayout) findViewById(R.id.first_point);
        //获取子view的数量
        int count = ll.getChildCount();
        for (int i = 0; i <count ; i++) {
            ImageView child = (ImageView) ll.getChildAt(i);
            images[i]=child;
        }

    }
    class  A implements ViewPager.OnPageChangeListener{
        int current=0;
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            images[current].setImageResource(android.R.drawable.presence_invisible);
            images[position].setImageResource(android.R.drawable.presence_online);
            current=position;
        }

        @Override
        public void onPageSelected(int position) {


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
    class  Adapter_vp extends PagerAdapter{

        @Override
        public int getCount() {
            return datas.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(datas.get(position));
            return datas.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(datas.get(position));
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
    }*/



    private List<Integer> images = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        initData();
        Banner banner = (Banner) findViewById(R.id.banner);
        //设置样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.setImageLoader(new GuideImageLoader());
        //设置图片集合
        banner.setImages(images);
        banner.isAutoPlay(true);
        banner.setDelayTime(1500);
        banner.start();

        banner.setOnBannerClickListener(new OnBannerClickListener() {
            @Override
            public void OnBannerClick(int position) {
                if (position==4){
                   jump();
                }
            }
        });

    }

    private void jump() {
        SharedPreferences sp = getSharedPreferences("args", Context.MODE_PRIVATE);
        sp.edit().putBoolean("isFirst",false).commit();
        Intent it=new Intent(this, MainActivity.class);
        startActivity(it);
        finish();
    }

    private void initData() {
        images.add(R.drawable.yuike_path_bg1);
        images.add(R.drawable.yuike_path_bg3);
        images.add(R.drawable.yuike_path_bg4);
        images.add(R.drawable.yuike_path_bg5);
    }


}
