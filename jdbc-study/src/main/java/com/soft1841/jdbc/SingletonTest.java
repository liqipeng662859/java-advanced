package com.soft1841.jdbc;

/**
 * 单例模式测试程序
 */

public class SingletonTest {
    public static void main(String[] args) {
        //通过Singleton的类方法Singleton.getInstance()获取唯一可用对象
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}
