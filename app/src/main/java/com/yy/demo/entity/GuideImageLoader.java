package com.yy.demo.entity;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by Administrator on 2017/2/7.
 */

public class GuideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //Glide 加载图片简单用法
        System.out.println("---"+path.toString());
       Glide.with(context).load(path).into(imageView);

        //Picasso 加载图片简单用法
//        if(path instanceof String){
//            Picasso.with(context)
//                    .load((String)path)
//                    .into(imageView);
//            System.out.println("---"+path.toString());
//        }else if(path instanceof Integer){
//            Picasso.with(context)
//                    .load((int) path)
//                    .into(imageView);
//            System.out.println("---"+path.toString());
//        }
            //用fresco加载图片简单用法，记得要写下面的createImageView方法
//        Uri uri = Uri.parse((String) path);
//        imageView.setImageURI(uri);
    }
}
