package com.ds.sorting;

public class SortingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {9,8,7,6,5}; 
		BubbleSort.bubbleSort(arr);
		print(arr);
	}
	static void print(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
