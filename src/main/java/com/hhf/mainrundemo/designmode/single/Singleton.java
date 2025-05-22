package com.hhf.mainrundemo.designmode.single;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @description: 枚举方式实现单例模式
 * @author: HuangHeFu
 * @date: 2025-05-10
 **/
public enum Singleton {
    INSTANCE;

    private final ObjectMapper objectMapper;

    Singleton() {
        System.out.println("枚举Demo私有构造参数");
        objectMapper = new ObjectMapper();
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
