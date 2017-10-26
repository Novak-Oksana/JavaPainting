package com.work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Ksu on 11.09.2017.
 */
public class Draw implements MouseMotionListener, MouseListener {
    public JPanel Panel;
    private JComboBox WidthComboBox;
    private JComboBox ColorComboBox;

    int x = 0;
    int y = 0;
    Color col=Color.RED;
    int width=1;

    public Draw() {
        ColorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JComboBox jComboBox = (JComboBox) e.getSource();
                switch (ColorComboBox.getSelectedIndex())
                {
                    case 1:
                        col = Color.GREEN;
                        break;
                    case 2:
                        col = Color.BLUE;
                        break;
                    default:
                        col = Color.RED;
                        break;
                }

            }
        });

        WidthComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (WidthComboBox.getSelectedIndex())
                {
                    case 1:
                        width = 3;
                        break;
                    case 2:
                        width = 5;
                        break;
                    default:
                        width = 1;
                        break;
                }
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics2D gg = (Graphics2D) Panel.getGraphics();
        gg.setColor(col);
        gg.setStroke(new BasicStroke(width));
        gg.drawLine(x, y, e.getX(), e.getY());
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
