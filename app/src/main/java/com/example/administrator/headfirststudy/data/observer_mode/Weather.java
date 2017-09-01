package com.example.administrator.headfirststudy.data.observer_mode;

/**
 * User: laomao
 * Date: 2017-04-26
 * Time: 14-49
 */

public class Weather {
    private float temp;
    private float humidity;
    private float pressure;

    public Weather() {
    }

    public Weather(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
