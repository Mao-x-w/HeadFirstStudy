package com.example.administrator.headfirststudy.data.decorate_mode;

import com.example.administrator.headfirststudy.data.decorate_mode.base.Beverage;
import com.example.administrator.headfirststudy.data.decorate_mode.base.CondimentDecorator;

/**
 * User: laomao
 * Date: 2017-04-28
 * Time: 10-56
 */

public class SugarDecorator extends CondimentDecorator {

    private Beverage mBeverage;

    public SugarDecorator(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public Double cost() {
        return 0.8+mBeverage.cost();
    }

    @Override
    public String getDesc() {
        return mBeverage.getDesc()+"*sugar";
    }
}
