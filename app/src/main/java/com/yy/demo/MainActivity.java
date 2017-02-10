package com.yy.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.yy.demo.fragments.CateFragment;
import com.yy.demo.fragments.CheFragment;
import com.yy.demo.fragments.HomeFragment;
import com.yy.demo.fragments.MineFragment;
import com.yy.demo.fragments.SaleFragment;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb_home;
    private RadioButton rb_sale;
    private RadioButton rb_cate;
    private RadioButton rb_che;
    private RadioButton rb_mine;

    private RadioGroup  rg_bottom;
    private FragmentManager manager;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRb();

        rg_bottom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.nav_bottom_home:
                        transaction=manager.beginTransaction();
                        Fragment fragment_home=new HomeFragment();
                        transaction.replace(R.id.content,fragment_home);
                        transaction.commit();
                        break;
                    case R.id.nav_bottom_sale:
                        transaction=manager.beginTransaction();
                        Fragment fragment_sale=new SaleFragment();
                        transaction.replace(R.id.content,fragment_sale);
                        transaction.commit();
                        break;
                    case R.id.nav_bottom_cate:
                        transaction=manager.beginTransaction();
                        Fragment fragment_cate=new CateFragment();
                        transaction.replace(R.id.content,fragment_cate);
                        transaction.commit();
                        break;
                    case R.id.nav_bottom_che:
                        transaction=manager.beginTransaction();
                        Fragment fragment_che=new CheFragment();
                        transaction.replace(R.id.content,fragment_che);
                        transaction.commit();
                        break;
                    case R.id.nav_bottom_mine:
                        transaction=manager.beginTransaction();
                        Fragment fragment_mine=new MineFragment();
                        transaction.replace(R.id.content,fragment_mine);
                        transaction.commit();
                        break;
                }
            }
        });

    }

    private void initRb() {
        rb_home = (RadioButton) this.findViewById(R.id.nav_bottom_home);
        rb_sale = (RadioButton) this.findViewById(R.id.nav_bottom_sale);
        rb_cate = (RadioButton) this.findViewById(R.id.nav_bottom_cate);
        rb_che = (RadioButton) this.findViewById(R.id.nav_bottom_che);
        rb_mine = (RadioButton) this.findViewById(R.id.nav_bottom_mine);

        rg_bottom=(RadioGroup) this.findViewById(R.id.nav_bottom_group);

        ((RadioButton)rg_bottom.findViewById(R.id.nav_bottom_home)).setChecked(true);

        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        Fragment fragement_home = new HomeFragment();
        transaction.replace(R.id.content,fragement_home);
        transaction.commit();

    }


}
