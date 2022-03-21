package com.Bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Coordinates of line1 x1,y1: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter Coordinates of line1 x2,y2: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        int line1 =(int) Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2 );
        System.out.println("Line 1 length: " + line1);


        System.out.println("Enter Coordinates of line2 x3,y3: "); //enter value
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.println("Enter Coordinates of line2 x4,y4: ");
        int x4 = scan.nextInt();
        int y4 = scan.nextInt();

        int line2 = (int)Math.sqrt( (x4 - x3) ^ 2 + (y4 - y3) ^ 2 );
        System.out.println("Line 2 length: " + line2);


        if (line1 == line2){
            System.out.println("Line1 is equal to line2");
        }
        else {
            System.out.println("Line1 is not equal to line2");
        }
    }
}