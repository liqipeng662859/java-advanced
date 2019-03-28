package com.java.util;

import java.util.*;

public class StudentListTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(1,"王平"));
        list1.add(new Student(2,"董兴照"));
        list2.add(new Student(3,"董萱"));
        list2.add(new Student(4,"陈雨"));
        Map<String,List<Student>> map = new HashMap<>();
        map.put("男",list1);
        map.put("女",list2);
        System.out.println("按性别输出的结果是：");
        Iterator<Map.Entry<String,List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            Iterator<Student> listIter = entry.getValue().iterator();
            while (listIter.hasNext()){
                System.out.println(listIter.next());
            }
        }
    }
}




