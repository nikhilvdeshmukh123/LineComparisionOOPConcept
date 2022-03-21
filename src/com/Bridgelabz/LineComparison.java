package com.Bridgelabz;

import java.util.Scanner;

public class LineComparison {
	static Scanner scan = new Scanner(System.in);
	int x1;
	int y1;
	int x2;
	int y2;
	
	public void enterCoordinatesValues(){
		System.out.println("Enter the Coordinates");
		x1 = scan.nextInt();
		System.out.println("Enter the Coordinates");
		y1 = scan.nextInt();
		System.out.println("Enter the Coordinates");
		x2 = scan.nextInt();
		System.out.println("Enter the Coordinates");
		y2 = scan.nextInt();
		
		System.out.print("Length of Line: " + calculateLength());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to line comparision");
		
		LineComparison lineComparison1 = new LineComparison();
		lineComparison1.enterCoordinatesValues();
	}
	public double calculateLength(){
		double length = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2)); 
			return length;
	}
}
