package com.example.administrator.headfirststudy.data.observer_mode;

import com.example.administrator.headfirststudy.data.observer_mode.base.DisplayElement;
import com.example.administrator.headfirststudy.data.observer_mode.base.Observer;
import com.example.administrator.headfirststudy.tools.ToastUtils;


/**
 * User: laomao
 * Date: 2017-04-26
 * Time: 15-00
 */

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private Weather mWeather;

    public CurrentConditionDisplay() {
    }

    @Override
    public void update(Weather weather) {
        mWeather = weather;
        display();
    }


    @Override
    public void display() {
        ToastUtils.showLongToast("温度："+mWeather.getTemp()+".......湿度："+mWeather.getHumidity()+".......气压："+mWeather.getPressure());
    }

}
