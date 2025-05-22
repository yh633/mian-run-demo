package com.hhf.mainrundemo.designmode.single;

/**
 * @description: 使用枚举+静态内部类实现单例模式 优点:实现简单、调用效率高，枚举本身就是单例，由jvm从根本上提供保障!避免通过反射和反序列化的漏洞， 缺点没有延迟加载。
 * @author: HuangHeFu
 * @date: 2025-05-10
 **/
public class singleEnum {

    private singleEnum() {
    }

    public static singleEnum getInstance() {
        return singleEnumE.INSTANCE.getInstance();
    }

    //定义枚举
    private enum singleEnumE {
        INSTANCE;
        // 枚举元素为单例
        private final singleEnum demo4;

        singleEnumE() {
            System.out.println("枚举Demo私有构造参数");
            demo4 = new singleEnum();
        }

        public singleEnum getInstance() {
            return demo4;
        }
    }
}
