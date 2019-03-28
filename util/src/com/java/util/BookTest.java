package com.java.util;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("西游记",1,66.66));
        list.add(new Book("三国",2,22.66));
        list.add(new Book("骆驼祥子",3,33.66));
        System.out.println(list);
        list.add(2,new Book("Java",1,22.33));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(3,new Book("高数",1,54.2));
        System.out.println(list);
        list.remove("高数");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list);
        list.add(new Book("骆驼祥子",1,33.66));
        System.out.println(list.indexOf("骆驼祥子"));
        System.out.println(list.lastIndexOf("骆驼祥子"));


    }
}
