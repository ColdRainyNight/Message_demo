package com.message_demo.base;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import org.xutils.BuildConfig;
import org.xutils.x;


/**
 * 类描述：
 * 创建人：xuyaxi
 * 创建时间：2017/7/13 20:57
 */
public class BaseApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);

       AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

     /*  // 通过代码注册你的AppKey和AppSecret
        MobSDK.init(this, "1f6eab334ac34", "c71a088df00671d712611370ef6a2a5e");*/

    }
}
