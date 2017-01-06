package com.easyweather.sunyb3.easyweather.gson;

/**
 * Created by jyh on 2017/01/06.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
