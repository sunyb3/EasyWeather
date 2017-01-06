package com.easyweather.sunyb3.easyweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import static android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.NOW;

/**
 * Created by jyh on 2017/01/06.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
