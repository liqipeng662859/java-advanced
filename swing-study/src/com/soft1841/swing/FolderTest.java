package com.soft1841.swing;

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        //要遍历的路径
        String path = "D:\\img";
        File file = new File(path);
        //遍历path下的文件和目录，放在File数组中
        File[] fs = file.listFiles();
        for (File f:fs ){
            if (!f.isDirectory())
                System.out.println(f);
        }
    }
}

