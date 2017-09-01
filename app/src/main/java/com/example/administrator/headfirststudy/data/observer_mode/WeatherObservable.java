package com.example.administrator.headfirststudy.data.observer_mode;

import com.example.administrator.headfirststudy.data.observer_mode.base.Observable;
import com.example.administrator.headfirststudy.data.observer_mode.base.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * User: laomao
 * Date: 2017-04-26
 * Time: 14-51
 */

public class WeatherObservable implements Observable {

    private List<Observer> mObserverList;
    private Weather mWeather;

    public WeatherObservable() {
        mObserverList = new ArrayList<>();
    }

    @Override
    public void regist(Observer observer) {
        mObserverList.add(observer);
    }

    @Override
    public void unRegist(Observer observer) {
        mObserverList.remove(observer);
    }

    @Override
    public void notityDataChanged() {
        for (Observer observer : mObserverList) {
            observer.update(mWeather);
        }
    }

    // 模拟数据发生改变
    public void simulateDataChanged(Weather weather) {
        mWeather = weather;
        notityDataChanged();
    }
}
