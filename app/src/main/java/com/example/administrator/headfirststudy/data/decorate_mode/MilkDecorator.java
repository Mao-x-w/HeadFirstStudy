package com.example.administrator.headfirststudy.data.decorate_mode;

import com.example.administrator.headfirststudy.data.decorate_mode.base.Beverage;
import com.example.administrator.headfirststudy.data.decorate_mode.base.CondimentDecorator;

/**
 * 摩卡装饰类，只需要传入需要加摩卡的类即可。
 * User: laomao
 * Date: 2017-04-28
 * Time: 10-50
 */

public class MilkDecorator extends CondimentDecorator {

    private Beverage mBeverage;

    public MilkDecorator(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDesc() {
        return mBeverage.getDesc()+"*Milk";
    }

    /**
     * 返回当前调料的价钱和被装饰的咖啡的价钱
     * @return
     */
    @Override
    public Double cost() {
        return 0.5+mBeverage.cost();
    }

}
