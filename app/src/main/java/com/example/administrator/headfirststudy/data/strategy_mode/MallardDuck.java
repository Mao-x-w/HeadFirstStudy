package com.example.administrator.headfirststudy.data.strategy_mode;

import com.example.administrator.headfirststudy.data.strategy_mode.base.Duck;
import com.example.administrator.headfirststudy.tools.ToastUtils;

/**
 * User: laomao
 * Date: 2017-04-19
 * Time: 18-12
 */

public class MallardDuck extends Duck {

    public MallardDuck() {
        mFlyBehavior=new FlyWithWingsBehavior();
    }

    @Override
    public void display() {
        ToastUtils.showShortToast("MallardDuck display()");
    }

}
