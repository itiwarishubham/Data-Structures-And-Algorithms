package com.ds.sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			int maxIndex = i;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			swap(i, maxIndex, arr);
		}
	}

	public static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

/*
 * {9,8,7,6,5} 89765 79865 69875 59875
 */