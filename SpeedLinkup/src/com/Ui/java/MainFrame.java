package com.Ui.java;

import javax.swing.*;
import java.awt.*;

/**
 * The main frame of the game.
 *
 * @author lonelyinnovator
 * @date 2020/12/22
 */
public class MainFrame extends JFrame {
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 800;
    private static final int BOUNDS_X = 500;
    private static final int BOUNDS_Y = 150;
    Graphics graphics = this.getGraphics();

    public MainFrame() {
        Container p = getContentPane();
        p.setBackground(Color.white);
        this.setTitle("连连看");
        this.setBounds(BOUNDS_X, BOUNDS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainPanel mainPanel = new MainPanel(this);//把自己窗口进行关联。
        this.getContentPane().add(mainPanel);
        new DrawGameMap();
    }
}
