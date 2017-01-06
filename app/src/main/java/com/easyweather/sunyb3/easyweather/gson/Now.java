package com.easyweather.sunyb3.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jyh on 2017/01/06.
 */

public class Now {
    @SerializedName("temp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }

}
