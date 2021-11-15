package com.ds.sorting;

import java.util.Arrays;

public class SortingTest {

	public static void main(String[] args) {
		int arr[] = new int[] {9,8,7,6,5}; 
		//BubbleSort.bubbleSort(arr);
		//SelectionSort.selectionSort(arr);
		//InsertionSort.insertionSort(arr);
		//MergeSort.mergeSort(arr, 0, arr.length-1);
		//QuickSort.quickSort(arr, 0, arr.length-1);
		Arrays.stream(arr).forEach(i->System.out.print(i+" "));
	}

}
