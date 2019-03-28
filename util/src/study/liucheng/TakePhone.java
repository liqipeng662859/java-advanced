package study.liucheng;

import java.util.Scanner;

public class TakePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建扫描器
        System.out.println("请输入要拨打的号码");//输出提示
        int phoneNumber = scanner.nextInt();//创建变量，保存电话号码
        if (phoneNumber != 84592165)
            //如果不是84592165，则号码不存在
            System.out.println("对不起，你拨打电话不存在");
        if (phoneNumber == 84592165);
        System.out.println("你好！");

    }
}
