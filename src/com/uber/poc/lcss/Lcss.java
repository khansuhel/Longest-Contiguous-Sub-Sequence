package com.uber.poc.lcss;

public class Lcss {

	private int findMin(int a, int b) {
		if (a > b)
			return b;
		else
			return a;
	}

	private int findMax(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public int findLength(int input[]) {
		int length = 1;
		for (int i = 0; i < input.length - 1; i++) {
			int min = input[i];
			int max = input[i];
			for (int j = i + 1; j < input.length; j++) {
				min = findMin(min, input[j]);
				max = findMax(max, input[j]);

				if ((max - min) == j - i) {
					length = findMax(length, max - min + 1);
				}
			}
		}
		return length;
	}

}
