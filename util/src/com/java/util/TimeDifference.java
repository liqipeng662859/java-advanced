package com.java.util;


import sun.java2d.d3d.D3DDrawImage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDifference {
    public static void main(String[] args) {
        //分别定义起止时间
        String startTime = "2019-03-17 06:58:10";
        String stopTime1 = " 2019-03-18 07:22:22   " ;
        String stopTime2 = " 2019-03-18 06:55:14   " ;
        String stopTime3 = " 2019-03-18 08:01:45   " ;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        Date d2;
        Date d3;
        Date d4;

        long diff = 0;
        //通过SimpleDateFormat的对象来把String类型的时间对象转化成Date类型的对象
        try {
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime1);
            d3 = format.parse(stopTime2);
            d4 = format.parse(stopTime2);


            //毫秒的差值
            diff = d2.getTime() - d1.getTime();
            diff = d3.getTime() - d1.getTime();
            diff = d4.getTime() - d1.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        //将毫秒分别换算成分、小时 、天

        Long diffMinutes =  diff/(1000 * 60);
        Long diffHours = diff/(1000 * 60 * 60);
        Long diffDays = diff/(1000 * 60 * 60 * 24);
        System.out.println("现在时间：" + startTime);
        System.out.println(stopTime1   +  Math.abs(diffMinutes) + "分前 ");
        System.out.println(stopTime2   +  Math.abs(diffHours)   + "小时前 ");
        System.out.println(stopTime3   +     Math.abs(diffDays)    + "天前 ");
    }
}


