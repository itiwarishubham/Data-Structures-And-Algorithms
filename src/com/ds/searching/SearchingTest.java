package com.ds.searching;

import java.util.Arrays;

public class SearchingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {9,8,7,6,5}; 
		Arrays.sort(arr);
		int index = BinarySearch.recursiveBinarySearch(arr,0,arr.length-1, 6);
		System.out.println(index);
	}

}
