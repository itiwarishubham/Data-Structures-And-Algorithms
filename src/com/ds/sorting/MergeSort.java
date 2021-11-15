package com.ds.sorting;

public class MergeSort {

	public static void mergeSort(int[] arr, int left, int right) {
		divide(arr, left, right);
	}

	public static void divide(int[] arr, int left, int right) {
		int mid;
		int[] temp = new int[arr.length];
		if (right > left) {
			mid = (left + right) / 2;
			System.out.println("1st left "+left+" mid "+mid+" right "+ right);
			divide(arr, left, mid);
			System.out.println("2nd left "+left+" mid "+mid+" right "+ right);
			divide(arr, mid + 1, right);
			System.out.println("----conquer------- l " + left + " m " + (mid + 1) + " r " + right);
			conquer(arr, left, mid + 1, right, temp);
		}
	}

	public static void conquer(int[] arr, int left, int mid, int right, int[] temp) {
		int leftEnd = mid - 1, size = right - left + 1, tempPos = left;
		while (left <= leftEnd && mid <= right) {
			System.out.println("first");
			if (arr[left] <= arr[mid]) {
				System.out.println("first-1 -> " + arr[left] + ", " + arr[mid]);
				temp[tempPos] = arr[left];
				tempPos++;
				left++;
			} else {
				System.out.println("first-2 ->" + arr[left] + ", " + arr[mid]);
				temp[tempPos] = arr[mid];
				tempPos++;
				mid++;
			}
		}
		while (left <= leftEnd) {
			System.out.println("second " + left + ", " + leftEnd + " ,tempPos " + tempPos);
			temp[tempPos] = arr[left];
			tempPos++;
			left++;
		}

		while (mid <= right) {
			System.out.println("third " + mid + ", " + right + " ,tempPos " + tempPos);
			temp[tempPos] = arr[mid];
			tempPos++;
			mid++;
		}

		for (int i = 0; i < size; i++) {
			System.out.println("merging " + arr[right] + ", " + temp[right]);
			arr[right] = temp[right];
			right--;
		}
	}
}
