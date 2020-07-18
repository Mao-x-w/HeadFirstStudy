package com.example.administrator.headfirststudy.data.factory_mode.pizza;

/**
 * User: laomao
 * Date: 2018-10-15
 * Time: 15-18
 */

public abstract class Pizza {

    public void prepare(){
        System.out.println("prepare()");
    }

    public void bake(){
        System.out.println("bake()");
    }

    public void cut(){
        System.out.println("cut()");
    }

    public void box(){
        System.out.println("box()");
    }

}
