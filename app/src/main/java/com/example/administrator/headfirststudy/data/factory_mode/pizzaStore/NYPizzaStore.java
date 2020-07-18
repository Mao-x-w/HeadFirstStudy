package com.example.administrator.headfirststudy.data.factory_mode.pizzaStore;

import com.example.administrator.headfirststudy.data.factory_mode.pizza.Pizza;

/**
 * User: laomao
 * Date: 2018-10-15
 * Time: 15-45
 */

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;

        if ("cheese".equals(type)){

        }else if ("clam".equals(type)){

        }else if ("veggie".equals(type)){

        }
        return null;
    }
}
