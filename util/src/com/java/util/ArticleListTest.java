package com.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleListTest {
    public static void main(String[] args) throws ParseException {
        List<Article> articleList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        articleList.add(new Article(1, "敬畏，是对生活真正的热爱",       "毕淑敏", simpleDateFormat.parse("2019-03-18 20:45:36")));
        articleList.add(new Article(2, "一朝春去红颜老，花落人亡两不",   "丰子恺",simpleDateFormat.parse("2019-03-18 19:25:12")));
        articleList.add(new Article(3, " 你怕的越多，欺负你的人就越多",  "张爱玲",    simpleDateFormat.parse("2019-03-18 21:31:25")));
        System.out.println("----文章简介----");
        System.out.println("编号  标题   作者   写作时间");
        Iterator<Article> iterator = articleList.iterator();
        while (iterator.hasNext()) {
            Article article = iterator.next();
            String result;
            result = timeCal(simpleDateFormat.format(article.getWriteTime()));
            System.out.println(article.getId()+"  "+article.getTitle().substring(0,10)+"..."+
                    article.getAuthor()+"  "+result);
        }

    }

    private static String timeCal(String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        long diff = 0;
        try {
            d1 = format.parse(time);
            Date now = new Date();
            diff = now.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long seconds = diff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        if (seconds < 60) {
            return "刚刚";
        } else if (minutes < 60) {
            return minutes + "分钟前";
        } else if (hours < 24) {
            return hours + "小时前";
        } else {
            return days + "天前";
        }
    }
}

