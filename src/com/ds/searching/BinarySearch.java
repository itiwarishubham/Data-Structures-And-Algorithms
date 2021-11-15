package com.ds.searching;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] arr, int data) {
		int low = 0;
		int high = arr.length - 1;
		Arrays.sort(arr);
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == data)
				return mid;
			if (arr[mid] < data)
				low = mid + 1;
			if (arr[mid] > data)
				high = mid - 1;
		}
		return -1;
	}

	public static int recursiveBinarySearch(int[] arr, int low, int high, int data) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == data)
				return mid;
			if (arr[mid] > data)
				return recursiveBinarySearch(arr, low, mid - 1, data);
			else
				return recursiveBinarySearch(arr, mid + 1, high, data);
		}
		return -1;
	}
}
