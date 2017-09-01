package com.example.administrator.headfirststudy.data.decorate_mode.base;

/**
 * User: laomao
 * Date: 2017-04-28
 * Time: 09-47
 */

public abstract class Beverage {

    private String desc;

    public Beverage() {
    }

    public Beverage(String desc) {
        this.desc = desc;
    }

    public abstract Double cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
