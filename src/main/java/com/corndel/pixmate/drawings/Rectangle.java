package com.corndel.pixmate.drawings;

public class Rectangle {
    public static void main(String[] args) {

        StringBuilder rectangle = new StringBuilder();
        int width = 5;
        int height = 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle.append('*');
            }
            rectangle.append("\n");
        }
        System.out.println(rectangle);
    }

};
