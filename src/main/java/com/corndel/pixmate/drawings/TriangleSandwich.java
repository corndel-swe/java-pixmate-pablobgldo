package com.corndel.pixmate.drawings;

public class TriangleSandwich {
    public static void main(String[] args) {
        StringBuilder sandwich = new StringBuilder();
        int height = 9;
        int width = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sandwich.append('*');
            }

            width += i < height / 2 ? 1 : -1;
            sandwich.append('\n');
        }
        System.out.println(sandwich);

    }
}
