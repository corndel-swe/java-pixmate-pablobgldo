package com.corndel.pixmate.drawings;

public class Triangle {
    public static void main(String[] args) {
        StringBuilder triangle = new StringBuilder();
        int height = 5;
        int width = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                triangle.append('*');
            }
            width += 1;
            triangle.append('\n');
        }
        System.out.println(triangle);
    }
}
