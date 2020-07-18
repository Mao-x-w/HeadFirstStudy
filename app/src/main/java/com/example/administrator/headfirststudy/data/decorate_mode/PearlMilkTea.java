package com.example.administrator.headfirststudy.data.decorate_mode;

import com.example.administrator.headfirststudy.data.decorate_mode.base.Beverage;

/**
 * User: laomao
 * Date: 2017-04-28
 * Time: 10-46
 */

public class PearlMilkTea extends Beverage {

    public PearlMilkTea() {
        setDesc("PearlMilkTea");
    }

    @Override
    public Double cost() {
        return 2.00;
    }
}
