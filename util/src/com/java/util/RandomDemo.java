package com.java.util;

import java.util.Random;

/**
 * 随机数类
 * @author liqipeng
 */
public class RandomDemo {
    public static void main(String[] args) {
        //随机生成五以内随机数
        Random random = new Random();
        //[0,bound)
        int num = random.nextInt(35);
        System.out.println(num);
    }
}
