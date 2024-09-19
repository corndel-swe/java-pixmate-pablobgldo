package com.corndel.pixmate.drawings;

public class Checkerboard {
    public static void main(String[] args) {
        StringBuilder checkerboard = new StringBuilder();
        int height = 5;
        int width = 4;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0) {
                    checkerboard.append("* ");
                } else {
                    checkerboard.append(" *");
                }
            }
            checkerboard.append(i % 2 == 0 ? "*" : " ");
            checkerboard.append('\n');
        }
        System.out.println(checkerboard);
    }
}
