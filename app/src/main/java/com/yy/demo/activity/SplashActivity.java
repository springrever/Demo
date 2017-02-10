package com.yy.demo.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yy.demo.MainActivity;
import com.yy.demo.R;

public class SplashActivity extends Activity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        inti();
    }

    int i = 3;
    boolean flag = true;
    private void inti() {
        textView = (TextView) this.findViewById(R.id.tv_skip);
        new Thread(){
            @Override
            public void run() {
                while (i>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText("跳转"+"("+(i--)+")");
                        }
                    });
                }
                if (flag){
                    jump();
                    flag = false;
                }

            }
        }.start();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    jump();
                    flag = false;
                }
            }
        });
    }


    private void jump() {
        SharedPreferences sp = getSharedPreferences("args", Context.MODE_PRIVATE);
        boolean isFirst = sp.getBoolean("isFirst", true);
        Intent it=null;
        //第一次启动app
        if(isFirst){
            it=new Intent(this,GuideActivity.class);
        }else{
            //不是第一次启动
            it=new Intent(this,MainActivity.class);
        }
        startActivity(it);
        finish();
    }
}
