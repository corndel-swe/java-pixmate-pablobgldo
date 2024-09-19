package com.corndel.pixmate.drawings;

public class Diagonal {
    public static void main(String[] args) {
        StringBuilder diagonal = new StringBuilder();
        int height = 5;
        int space = 0;
        for (int i = 0; i < height; i++) {
            diagonal.append(" ".repeat(space));
            diagonal.append('*');
            space++;
            diagonal.append('\n');
        }
        System.out.println(diagonal);
    }
}
