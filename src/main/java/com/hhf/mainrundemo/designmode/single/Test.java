package com.hhf.mainrundemo.designmode.single;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @description:
 * @author: HuangHeFu
 * @date: 2025-05-10
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println("hello world");
        ObjectMapper objectMapper = Singleton.INSTANCE.getObjectMapper();
        System.out.println(objectMapper);
        ObjectMapper objectMapper2 = Singleton.INSTANCE.getObjectMapper();
        System.out.println(objectMapper2);
        System.out.println(objectMapper == objectMapper2);


        singleEnum s1 = singleEnum.getInstance();
        singleEnum s2 = singleEnum.getInstance();
        System.out.println(s1 == s2);

    }

}
