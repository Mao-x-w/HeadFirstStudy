package com.example.administrator.headfirststudy.data.strategy_mode.base;

import com.example.administrator.headfirststudy.tools.ToastUtils;

/**
 * User: laomao
 * Date: 2017-04-19
 * Time: 16-26
 */

public abstract class Duck {

    protected FlyBehavior mFlyBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        mFlyBehavior=flyBehavior;
    }

    public void quack(){
        ToastUtils.showShortToast("quack()");
    }

    public void swim(){
        ToastUtils.showShortToast("swim()");
    }

    public abstract void display();

    public void flyDisplay(){
        mFlyBehavior.fly();
    }

}
