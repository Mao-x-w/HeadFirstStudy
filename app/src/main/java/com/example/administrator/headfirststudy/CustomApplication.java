package com.example.administrator.headfirststudy;

import android.app.Application;
import android.content.Context;

/**
 * User: laomao
 * Date: 2017-04-19
 * Time: 16-33
 */

public class CustomApplication extends Application {

    private static CustomApplication mAppInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppInstance=this;
    }

    public static CustomApplication getInstance(){
        return mAppInstance;
    }

    public Context getGloableContext(){
        return getApplicationContext();
    }
}
