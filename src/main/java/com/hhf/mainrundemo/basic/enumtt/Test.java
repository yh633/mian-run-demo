package com.hhf.mainrundemo.basic.enumtt;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * @description:
 * @author: HuangHeFu
 * @date: 2025-05-10
 **/
public class Test {

    public static void test(City city) {

        EnumSet<City> set = EnumSet.allOf(City.class);
        if (set.contains(city)) {
            System.out.println("欢迎来到 "+city.getCityName());
        } else {
            System.out.println("请选择正确的城市");
        }

    }

    public static void main(String[] args) {
        test(City.SHANGHAI);
        test(City.BEIJING);
    }

}
