package com.easyweather.sunyb3.easyweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import static android.R.string.ok;

/**
 * Created by jyh on 2017/01/04.
 */

public class HttpUtil {
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
