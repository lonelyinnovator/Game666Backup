package com.Ui.java;

import java.awt.*;
import java.util.Random;

/**
 * @author lonelyinnovator
 * @date 2020/12/22
 */
public class DrawGameMap {
    private static final int MAP_SIZE_X = 10;
    private static final int MAP_SIZE_Y = 10;
    private static final int PICTURE_WIDTH = 30;
    private static final int PICTURE_HEIGHT = 30;
    private static final int PICTURE_INIT_X = 100;
    private static final int PICTURE_INIT_Y = 100;
    private static final int PICTURE_NUMBER = 10;
    private int[][] map = new int[MAP_SIZE_Y][MAP_SIZE_X];

    public DrawGameMap() {
        InitMap();
        LoadPicutre();
    }

    public void InitMap() {
        for (int i = 0; i < MAP_SIZE_Y; i++) {
            for (int j = 0; j < MAP_SIZE_X; j++) {
                map[i][j] = new Random().nextInt(PICTURE_NUMBER) + 1;
            }
        }
    }
    public void LoadPicutre(){

    }
}
