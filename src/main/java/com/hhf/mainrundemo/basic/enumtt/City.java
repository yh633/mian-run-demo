package com.hhf.mainrundemo.basic.enumtt;

/**
 * @description:
 * @author: HuangHeFu
 * @date: 2025-05-10
 **/
public enum City {
    SHANGHAI("上海", "SH"),
    BEIJING("北京", "BJ"),
    HANGZHOU("杭州", "HZ");

    private final String cityName;
    private final String cityCode;

    City(String cityName, String cityCode) {
        this.cityName = cityName;
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

}
