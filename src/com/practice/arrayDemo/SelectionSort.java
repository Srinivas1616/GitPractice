package com.practice.arrayDemo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a = {3,-2,4,9,1,5,0,2,6};
		int n = a.length;
		
		for(int i=0; i<n-1;i++) {
			int min=i;
			for(int j=i; j<n;j++) {
				
				if(a[j]<a[min])
				min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
}
