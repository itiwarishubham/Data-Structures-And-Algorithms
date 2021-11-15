package com.ds.codechallenge;

import java.util.ArrayList;
import java.util.List;

public class HackerrankTest {

	public static void main(String[] args) {

//		4
//		aba
//		baba
//		aba
//		xzxb
//		3
//		aba
//		xzxb
//		ab
		
		String s = TimeConversion.timeConversion("07:05:45PM");
		List<String> strings = new ArrayList<String>();
		List<String> queries = new ArrayList<String>();
		
		strings.add("aba");
		strings.add("baba");
		strings.add("aba");
		strings.add("xzxb");
		
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");
		
		System.out.println(SparseArrays.sparseArray(strings,queries));
	}

}
