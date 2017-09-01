package com.example.administrator.headfirststudy.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.headfirststudy.R;
import com.example.administrator.headfirststudy.data.observer_mode.CurrentConditionDisplay;
import com.example.administrator.headfirststudy.data.observer_mode.Weather;
import com.example.administrator.headfirststudy.data.observer_mode.WeatherObservable;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/**
 * User: laomao
 * Date: 2017-04-21
 * Time: 14-11
 */

public class ObserverModeActivity extends AppCompatActivity{

    private WeatherObservable mObservable;
    private Weather mWeather;
    private CurrentConditionDisplay mDisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_mode);

        // 被观察者
        mObservable = new WeatherObservable();

        // 观察者
        mDisplay = new CurrentConditionDisplay();

        mWeather = new Weather();

        // 模拟天气变化
        simulateWeatherChange();
    }

    /**
     * 模拟天气变化
     */
    private void simulateWeatherChange() {
        Observable.interval(0,1000, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        mWeather.setTemp(mWeather.getTemp()+5);
                        mWeather.setHumidity(mWeather.getHumidity()+4);
                        mWeather.setPressure(mWeather.getPressure()+3);
                        mObservable.simulateDataChanged(mWeather);
                    }
                });

    }

    /**
     * 注册当前天气变化，以便数据变化时能接收到
     * @param view
     */
    public void onclick(View view){
        mObservable.regist(mDisplay);
    }

    /**
     * 取消注册当前天气变化，不会再接收数据
     * @param view
     */
    public void onclick1(View view){
        mObservable.unRegist(mDisplay);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mObservable.unRegist(mDisplay);
    }
}
