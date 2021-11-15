package com.ds.sorting;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {

		int pivot;
		if (low < high) {
			pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot_element = arr[low];
		int left = low;
		int right = high;
		while (left < right) {
			while(right > low && arr[right] > pivot_element) {
				System.out.println(pivot_element+" right-- "+arr[right]);
				right--;
			}
			while(left < high && arr[left] <= pivot_element) {
				System.out.println(pivot_element+" left++ "+arr[left]);
				left++;
			}
			if(left<right) {
				swap(arr, left, right);
			}
		}
		System.out.println(arr[low] +" l, r"+ arr[right]+" pivot_element"+pivot_element);
		swap(arr, low, right);
		return right;
	}

	private static void swap(int[] arr, int left, int right) {
		System.out.println(arr[left] +"l, r"+ arr[right]);
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		System.out.println(arr[left] +" l, r"+ arr[right]);
	}
}
