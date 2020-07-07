package com.example.operator;

public class MathmaticalOperators {
    public static void main(String[] args) {
        System.out.println("Hello, World from IntelliJ Idea!");
        //Math Operations
//        int x;
//        x = 4 + 3 * 2;
//        int y = x - 6;
//        x = x * y;
//        System.out.println("x = " + x);
        Point p1 = new Point(3,4);
        Point p2 = new Point(6,8);
        System.out.println(p1.distance(p2));
        FileResources hw = new FileResources();
        hw.runHello();
    }
}
