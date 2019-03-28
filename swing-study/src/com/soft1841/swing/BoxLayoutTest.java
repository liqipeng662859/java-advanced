package com.soft1841.swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.security.KeyStore;

public class BoxLayoutTest extends JFrame {
    public BoxLayoutTest(){
        init();
        setTitle("BoxLayout布局");
        setSize(410,730);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void init() {
        //重新设置窗体布局
        setLayout(new BorderLayout(20, 20));
        //顶部面板
        JPanel topPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(topPanel, BoxLayout.X_AXIS);
        topPanel.setLayout(boxLayout);
        //topPanel设置背景色和合适大小
        topPanel.setBackground(new Color(45, 65, 97));
        topPanel.setPreferredSize(new Dimension(414, 100));

        //左侧按钮
        JButton leftButton = new JButton("开始");
        leftButton.setPreferredSize(new Dimension(80, 30));
        topPanel.add(leftButton);
        topPanel.add(Box.createHorizontalGlue());
        //右侧按钮
        JButton rightButton = new JButton("返回");
        rightButton.setPreferredSize(new Dimension(80, 30));
        topPanel.add(rightButton);
        //topPanel加入窗体顶部
        add(topPanel, BorderLayout.NORTH);
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
        //创建三个面板
        for (int i = 0; i < 3; i++) {
            JPanel jPanel = new JPanel();
            jPanel.setPreferredSize(new Dimension(410, 120));
            jPanel.setBackground(new Color(168, 54, 100));
            middlePanel.add(jPanel);
            middlePanel.add(Box.createVerticalStrut(20));
        }
        add(middlePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle= BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
    } catch (Exception e) {
            e.printStackTrace();
        }
        new BoxLayoutTest();
    }
}
