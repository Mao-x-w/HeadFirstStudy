package com.example.administrator.headfirststudy.data.factory_mode.pizzaStore;

import com.example.administrator.headfirststudy.data.factory_mode.pizza.Pizza;

/**
 * User: laomao
 * Date: 2018-10-15
 * Time: 15-26
 */

public abstract class PizzaStore {

    protected void orderPizza(String type){
        Pizza pizza= createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
    }

    protected abstract Pizza createPizza(String type);
}
