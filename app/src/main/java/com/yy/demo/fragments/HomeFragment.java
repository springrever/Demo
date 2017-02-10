package com.yy.demo.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.yy.demo.R;
import com.yy.demo.activity.MessageActivity;
import com.yy.demo.activity.SearchActivity;
import com.yy.demo.home_fragment.CarFragment;
import com.yy.demo.home_fragment.CosFragment;
import com.yy.demo.home_fragment.FruitFragment;
import com.yy.demo.home_fragment.ManFragment;
import com.yy.demo.home_fragment.NumFragment;
import com.yy.demo.home_fragment.RecomFragment;
import com.yy.demo.home_fragment.ShoesFragment;
import com.yy.demo.home_fragment.WomenFragment;

import java.util.ArrayList;
import java.util.List;

import static com.yy.demo.R.id.tab_HomeFragment_title;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    private ImageButton ib_search;
    private ImageButton ib_message;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home,null);

        ib_search = (ImageButton) root.findViewById(R.id.search);
        ib_message = (ImageButton) root.findViewById(R.id.message);
        ib_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initSearche();
            }
        });
        ib_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initMessage();
            }
        });

        initControls(root);
        return root;
    }

    //  消息中心
    private void initMessage() {
        Intent intent = new Intent(getContext(), MessageActivity.class);
        startActivity(intent);
    }
    //  搜索
    private void initSearche() {
        Intent intent = new Intent(getContext(), SearchActivity.class);
        startActivity(intent);

    }


    private TabLayout home_Tablayout_title;             //定义tablayout
    private ViewPager home_ViewPager;                   //定义viewpager
    private FragmentPagerAdapter fAdapter;              //定义adapter

    private List<Fragment> list_Fragment;               //定义fragment集合
    private List<String> list_Title;                    //定义title集合

    private CarFragment carFragment;
    private CosFragment cosFragment;
    private ManFragment manFragment;
    private NumFragment numFragment;
    private RecomFragment recomFragment;
    private ShoesFragment shoesFragment;
    private WomenFragment womenFragment;
    private FruitFragment fruitFragment;

    //初始化tablayout布局
    private void initControls(View root) {
        home_Tablayout_title = (TabLayout) root.findViewById(tab_HomeFragment_title);
        home_ViewPager = (ViewPager) root.findViewById(R.id.home_ViewPager);

        carFragment = new CarFragment();
        cosFragment = new CosFragment();
        manFragment = new ManFragment();
        numFragment = new NumFragment();
        recomFragment = new RecomFragment();
        shoesFragment = new ShoesFragment();
        womenFragment = new WomenFragment();
        fruitFragment = new FruitFragment();


        list_Fragment = new ArrayList<>();
        list_Fragment.add(recomFragment);
        list_Fragment.add(manFragment);
        list_Fragment.add(numFragment);
        list_Fragment.add(carFragment);
        list_Fragment.add(shoesFragment);
        list_Fragment.add(womenFragment);
        list_Fragment.add(cosFragment);
        list_Fragment.add(fruitFragment);

        list_Title = new ArrayList<String>() ;
        list_Title.add("推荐");
        list_Title.add("男装");
        list_Title.add("数码");
        list_Title.add("车配");
        list_Title.add("鞋包");
        list_Title.add("女装");
        list_Title.add("美妆");
        list_Title.add("水果");

        //设置tablayout的模式
        home_Tablayout_title.setTabMode(TabLayout.MODE_SCROLLABLE);
        //为TabLayout添加tab名称
        home_Tablayout_title.addTab(home_Tablayout_title.newTab().setText(list_Title.get(0)));
        home_Tablayout_title.addTab(home_Tablayout_title.newTab().setText(list_Title.get(1)));
        home_Tablayout_title.addTab(home_Tablayout_title.newTab().setText(list_Title.get(2)));
        home_Tablayout_title.addTab(home_Tablayout_title.newTab().setText(list_Title.get(3)));
        home_Tablayout_title.addTab(home_Tablayout_title.newTab().setText(list_Title.get(4)));
        home_Tablayout_title.addTab(home_Tablayout_title.newTab().setText(list_Title.get(5)));
        home_Tablayout_title.addTab(home_Tablayout_title.newTab().setText(list_Title.get(6)));

        fAdapter = new Home_Tab_Adapter(getActivity().getSupportFragmentManager(),list_Fragment,list_Title);

        //viewpager加载adapter

        home_ViewPager.setAdapter(fAdapter);
        home_Tablayout_title.setupWithViewPager(home_ViewPager);


    }


    //tab title 适配器
     public class Home_Tab_Adapter extends FragmentPagerAdapter{
        private List<Fragment> list_Fragment;
        private List<String> list_Title;

        public Home_Tab_Adapter(FragmentManager fm ,List<Fragment> list_Fragment ,List<String> list_Title) {
            super(fm);
            this.list_Fragment = list_Fragment;
            this.list_Title = list_Title;
        }

        @Override
        public Fragment getItem(int position) {
            return list_Fragment.get(position);
        }

        @Override
        public int getCount() {
            return list_Fragment.size();
        }

         //显示tab名字
         @Override
         public CharSequence getPageTitle(int position) {

             return list_Title.get(position % list_Title.size());
         }
     }




}
