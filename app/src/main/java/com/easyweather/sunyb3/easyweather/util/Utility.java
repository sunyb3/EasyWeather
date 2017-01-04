package com.easyweather.sunyb3.easyweather.util;

import android.text.TextUtils;

import com.easyweather.sunyb3.easyweather.db.City;
import com.easyweather.sunyb3.easyweather.db.County;
import com.easyweather.sunyb3.easyweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.R.attr.anyDensity;
import static android.R.attr.y;

/**
 * Created by jyh on 2017/01/04.
 * 解析和处理服务器返回的省级数据
 */

public class Utility {
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


        return false;
    }

    /*****
     * 解析和处理返回的市级数据
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


        return false;
    }


    /********
     * 解析和处理返回的县级数据
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.save();

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


        return false;
    }
}
