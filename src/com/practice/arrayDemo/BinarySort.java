package com.practice.arrayDemo;

import java.util.Arrays;

public class BinarySort {

	public static void main(String[] args) {

		int[] input = { 1,2,3,0,4,5,6 };

		int size = input.length;
		int temp = 0;
		boolean check = true;
		int iteration = 0;
		for (int i = 0; i < size; i++) {
			check=true;
			iteration++;
			for (int j = 0; j < (size - 1 - i); j++) {

				if (input[j] > input[j + 1]) {
					temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					check = false;
				}

			}
		if(check)
			break;

		}
		System.out.println(iteration);
		System.out.println(Arrays.toString(input));
	}
}
