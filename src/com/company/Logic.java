package com.company;

public class Logic {
    public static void main(String[] args) {
        boolean sunny = true;
        boolean rainy = false;

        System.out.println(sunny && rainy);

        boolean confusing = true;
        boolean understood = false;

        System.out.println(confusing || understood);

        int a = 1;
        int b = 3;
        int c = 5;
        int d = 2;
        int e = 4;

        System.out.println(((a > b) && !(b-a < c)) || (d==e*e));

        System.out.println((1 > 3 && !(3 - 1 < 5) || 2== 4 * 4));
    }
}
