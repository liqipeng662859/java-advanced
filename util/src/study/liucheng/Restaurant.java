package study.liucheng;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //创建扫描器
        System.out.println("请问有多少人用餐");    //输出提示
        int count = scanner.nextInt();
        if (count < 4){
            System.out.println("请到一楼用餐");

        }
        else if (count >= 4){
            System.out.println("请到二楼用餐");
        }
    }
}
