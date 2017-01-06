package com.easyweather.sunyb3.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jyh on 2017/01/06.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
