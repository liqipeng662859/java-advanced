package com.java.util;

/**
 * Integer类的练习
 * @author 李启鹏
 * 2019.3.12
 */
public class IntergerDemo {
    public static void main(String[] args) {
        int num = 31;
        //
        //
        String str1 = Integer.toBinaryString(num);
        System.out.println("二进制：" + str1);
        //
        String str2 = Integer.toOctalString(num);
        System.out.println("八进制：" + str2);

        String str3 = Integer.toHexString(num);
        System.out.println("十六进制：" + str3);

        String str4 = Integer.toString(num);
        System.out.println("十五进制：" + str4);
        System.out.println("-----------分割线--------------------");
        System.out.println("转化7进制：" + convert(num, 7));

    }

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