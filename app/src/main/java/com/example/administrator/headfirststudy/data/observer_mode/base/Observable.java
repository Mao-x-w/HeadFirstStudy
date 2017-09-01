package com.example.administrator.headfirststudy.data.observer_mode.base;

/**
 * User: laomao
 * Date: 2017-04-26
 * Time: 14-43
 */

public interface Observable {

    void regist(Observer observer);

    void unRegist(Observer observer);

    void notityDataChanged();
}
