package com.example.administrator.headfirststudy.data.decorate_mode;

import com.example.administrator.headfirststudy.data.decorate_mode.base.Beverage;

/**
 * User: laomao
 * Date: 2017-04-28
 * Time: 10-49
 */

public class MongoMilkTea extends Beverage {

    public MongoMilkTea() {
        setDesc("MongoMilkTea");
    }

    @Override
    public Double cost() {
        return 3.00;
    }
}
