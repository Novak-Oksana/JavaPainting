package com.work;

import javax.swing.*;

/**
 * Created by Ksu on 11.09.2017.
 */
public class DMain {
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Draw draw = new Draw();
        draw.Panel.addMouseListener(draw);
        draw.Panel.addMouseMotionListener(draw);
        jFrame.setContentPane(draw.Panel);
        jFrame.setVisible(true);
        jFrame.setBounds(100, 100, 600, 500);
    }
}
