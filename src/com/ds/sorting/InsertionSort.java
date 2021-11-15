package com.ds.sorting;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j >= 1 && arr[j - 1] > temp) {
				System.out.println("Pass: "+i);
				System.out.println(j);
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
}
