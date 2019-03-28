package com.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        //创建一个List接口对象
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("Java");
        list.add("HTML");
        list.add("高数");
        list.add("高数");
        int length = list.size();
        System.out.println(length);
        Random random = new Random();
        int index = random.nextInt(length);
        System.out.println(index);
        //取出list中索引为index的元素
        System.out.println(index);
        //输出所有list元素
        for (int i= 0; i < length; i++){
            System.out.println(list.get(i));
        }
    }
}
