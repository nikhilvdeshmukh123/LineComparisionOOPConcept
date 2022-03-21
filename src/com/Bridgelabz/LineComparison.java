package com.Bridgelabz;

import java.util.Scanner;

public class LineComparison {
	
	static Scanner scan = new Scanner(System.in);
	int x1, y1, x2, y2; 
	
	public void enterCoordinates() {
		System.out.println("Enter coordinate x1");
		x1 = scan.nextInt();
		System.out.println("Enter coordinate y1");
		y1 = scan.nextInt();
		System.out.println("Enter coordinate x2");
		x2 = scan.nextInt();
		System.out.println("Enter coordinate y2");
		y2 = scan.nextInt();

	}
	
	public static void compareTwoLengths(Double length1, Double length2) {
		if(length1.compareTo(length2) == 0) {
			System.out.println("Two lines are equal");
		}
		else if(length1.compareTo(length2) < 0) {
			System.out.println("Line1 is smaller than line2");
		}
		else if(length1.compareTo(length2) > 0) {
			System.out.println("Line1 is greater than line2");
		}
	}
	
    public static void main(String[] args) {
    	
    	System.out.println("Welcome TO Line Comparision Computation");
    
    	LineComparison lineComparision1 = new LineComparison();
    	System.out.println("Enter coordinates of line1");
    	lineComparision1.enterCoordinates();
    	
    	LineComparison lineComparision2 = new LineComparison();
    	System.out.println("Enter coordinates of line2");
    	lineComparision1.enterCoordinates();
    	
    	double length1 = lineComparision1.calculateLength();
    	System.out.println("Line1: "+length1);    	
    	double length2 = lineComparision2.calculateLength();
    	System.out.println("Line2: "+length2);
    	
    	compareTwoLengths(length1, length2);
      }
    
    private double calculateLength() {
    	return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
    }
}