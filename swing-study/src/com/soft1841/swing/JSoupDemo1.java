package com.soft1841.swing;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSoupDemo1 {
    public static void main(String[] args) throws Exception {
        String url = "https://www.w3cschool.cn/collection/recommendations/";
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();
        Elements elements = document.getElementsByClass("collection-article-intro");
        System.out.println(elements.size());
        for (Element element : elements){
            Element link = element.child(0).child(0);
            String titleString = link.text();
            System.out.println(titleString);
        }
    }
}
