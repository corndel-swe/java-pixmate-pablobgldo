package com.corndel.pixmate.drawings;

public class InvertedDiagonal {
    public static void main(String[] args) {
        StringBuilder inverted = new StringBuilder();
        int height = 5;
        int space = 4;
        for (int i = 0; i < height; i++) {
            inverted.append(" ".repeat(space));
            inverted.append('*');
            space--;
            inverted.append('\n');
        }
        System.out.println(inverted);
    }
}
