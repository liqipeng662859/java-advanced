package com.java.util;

import com.sun.org.apache.bcel.internal.generic.D2F;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String startTime = "2019-03-16 20:31:58";
        String stopTime = "2019-03-17 22:43:48";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-m-ddHH:mm:ss");
        Date d1;
        Date d2;
        long diff = 0;
        try {
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime);
            diff  = d2.getTime() - d1.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (1000*60);
        long diffHours = diff / (1000*60*60);
        long diffDays = diff / (1000*60*60*24);
        System.out.println("两个时间差：" + Math.abs(diffSeconds) + "秒");
        System.out.println("两个时间差：" + Math.abs(diffMinutes) + "分");
        System.out.println("两个时间差：" + Math.abs(diffHours) + "小时");
        System.out.println("两个时间差：" + Math.abs(diffDays) + "天");
    }
}
