package com.soft1841.jdbc;

/**
 * 单例模式
 */

public class Singleton {
    //创建Singleton对象
    private static Singleton instance = new Singleton();
    //让构造方法为private，这样该类就不会实例化
    private Singleton(){
    }
    //让静态方法获取唯一可用对象
    public static Singleton getInstance(){
        return instance;
    }
    //成员方法，显示消息
    public void showMessage(){
        System.out.println("Java设计模式");
    }
}
