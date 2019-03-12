package com.java.util;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建扫描器，获取控制台输出的值
        System.out.println("请输入六位密码：");
        int password = sc.nextInt();
        boolean result = (password == 924867);
        System.out.println("用户密码是否正确：" + result);  //输出结果
        sc.close();
    }
}

