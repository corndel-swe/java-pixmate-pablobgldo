package com.corndel.pixmate.drawings;

public class InvertedTriangle {
    public static void main(String[] args) {

        StringBuilder inverted = new StringBuilder();
        int height = 5;
        int width = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                inverted.append('*');
            }
            width -= 1;
            inverted.append('\n');
        }
        System.out.println(inverted);
    }
}

