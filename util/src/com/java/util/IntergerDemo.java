package com.java.util;

/**
 * Integer类的练习
 * @author 李启鹏
 * 2019.3.12
 */
public class IntegerDemo {
    public static void main(String[] args) {

    private static String convert(int num, int radix) {
       StringBuffer stringBuffer = new StringBuffer();
       while (num!=0){
           int remainder = num % radix;
           stringBuffer.append(String.valueOf(remainder));
           num = num / radix;
       }
       return stringBuffer.reverse().toString();
    }
}