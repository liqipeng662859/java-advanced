package com.soft1841.jdbc;

public class Proxy implements Subject {
    @Override
    public void buyMac() {
        //引用并创建真实对象，即我
        RealSubject realSubject = new RealSubject();
        //调用真实对象方法，进行代理购买Mac
        realSubject.buyMac();
        //代理对象额外做的操作
        this.WrapMac();
    }
    public void WrapMac(){
        System.out.println("用盒子包装好Mac");
    }
}
