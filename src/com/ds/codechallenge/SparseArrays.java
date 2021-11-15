package com.ds.codechallenge;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

	public static List<Integer> sparseArray(List<String> strings, List<String> queries) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		List<Integer> ans = new ArrayList<>();
		for(String s : strings) {
			if(map.get(s) == null) map.put(s, 1);
			else map.put(s, map.get(s) + 1);
		}
		for (String query : queries) {
			if(map.get(query) == null) ans.add(0);
			else ans.add(map.get(query));
		}
		System.out.println(ans);
		return ans;
	}
}
