package com.uber.poc.lcss;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a comma seperated String : ");
		String input = sc.nextLine();
		input = input.trim();
		String[] strArray = input.split(",");
		int[] intArray = new int[strArray.length];
		try {
			for (int i = 0; i < strArray.length; i++) {
				String temp = strArray[i].trim();
				intArray[i] = Integer.parseInt(temp);
			}
			Lcss lcss = new Lcss();
			System.out.println("The length of Longest Contiguous Sub-Array is : " + lcss.findLength(intArray));
		} catch (NumberFormatException ex) {
			System.out.println("Invalid input. Terminating!");
		} finally {
			 sc.close();
		}
	}

}
