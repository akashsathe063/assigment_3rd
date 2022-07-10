package com.blz.line_comparision;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparision {
    static int x1;
    static int y1;
    static int x2;
    static int y2;

    public static void main(String[] args) {
        System.out.println("Welcome to line comparision computation");
        LineComparision line1 = new LineComparision();
        LineComparision line2 = new LineComparision();
        Integer Line1 = new Integer(line1.length_of_line());
        System.out.println("length of first line: " + Line1);
        Integer Line2 = new Integer(line2.length_of_line());
        System.out.println("length of second line: " + Line2);
        if (Line1.equals(Line2)) {
            System.out.println("length of two line are same");
        } else {
            System.out.println("length of two line are not same");
        }
    }

    public int length_of_line() {
        System.out.println("Enter a co-ordinates");
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        System.out.println("x1: " + x1);
        y1 = sc.nextInt();
        System.out.println("y1: " + y1);
        x2 = sc.nextInt();
        System.out.println("x2: " + x2);
        y2 = sc.nextInt();
        System.out.println("y2: " + y2);
        double c = Math.pow((x2 - x1), 2);
        double d = Math.pow((y2 - y1), 2);
        int length_Of_Line = (int) sqrt(c + d);
        return length_Of_Line;
    }
}

