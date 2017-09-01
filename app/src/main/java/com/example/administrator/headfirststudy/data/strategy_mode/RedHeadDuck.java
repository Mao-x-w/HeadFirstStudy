package com.example.administrator.headfirststudy.data.strategy_mode;

import com.example.administrator.headfirststudy.data.strategy_mode.base.Duck;
import com.example.administrator.headfirststudy.tools.ToastUtils;

/**
 * User: laomao
 * Date: 2017-04-19
 * Time: 18-13
 */

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior=new FlyNoWayBehavior();
    }

    @Override
    public void display() {
        ToastUtils.showShortToast("RedHeadDuck display()");
    }

}
