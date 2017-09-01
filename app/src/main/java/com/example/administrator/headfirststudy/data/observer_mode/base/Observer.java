package com.example.administrator.headfirststudy.data.observer_mode.base;

import com.example.administrator.headfirststudy.data.observer_mode.Weather;

/**
 * User: laomao
 * Date: 2017-04-26
 * Time: 14-43
 */

public interface Observer {
    void update(Weather weather);
}
