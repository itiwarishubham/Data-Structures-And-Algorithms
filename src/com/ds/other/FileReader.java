package com.ds.other;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReader {

	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);
		list = gradingStudents(list);
		System.out.println(list);
	}
	
	// hackerrank
	public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> ans = new ArrayList<>();
        for(Integer grade:grades){
            if(grade > 37){
            	boolean grace = false;
                if(grade % 10 > 0 ){
                    int temp = grade;
                    for(int i=1;i<=9;i++){
                        temp++;
                        if(temp%5 == 0 && (temp-grade) < 3){
                        	grace = true;
                        	System.out.println(temp +", "+ (temp-grade)+" tempdata: "+ temp);
                            ans.add(temp);
                            break;
                        }
                    }
                }
                if(grace) continue;
            }
            System.out.println("data: "+ grade);
            ans.add(grade);
        }
        return ans;

    }

	static int rulingPair(int arr[], int n) {
		if (n <= 1)
			return -1;
		Arrays.sort(arr);
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for (int num : arr) {
			int dS = findSumOfDigits(num);
			ArrayList<Integer> list = map.getOrDefault(dS, new ArrayList<Integer>());
			list.add(num);
			map.put(dS, list);
		}
		System.out.println(map);
		int max = -1;
		for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
			ArrayList<Integer> value = entry.getValue();
			int size = value.size();
			System.out.println("max " + max + " size " + size);
			if (size > 1) {
				max = Math.max(max, value.get(size - 1) + value.get(size - 2));
			}
		}
		return max;
	}

	static int RulingPair(int arr[], int n) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		int countRulingPair = 1;
		for (int i = 0; i < n; i++) {
			int sumOfDigits = findSumOfDigits(arr[i]);
			if (map.containsKey(sumOfDigits)) {
				int count = map.get(sumOfDigits).get(1);
				if (count == 2)
					continue;
				List<Integer> val = new ArrayList<>();
				val.add(map.get(sumOfDigits).get(0) + arr[i]);
				val.add(++count);
				map.put(sumOfDigits, val);
				countRulingPair++;
			} else {
				List<Integer> val = new ArrayList<>();
				val.add(arr[i]);
				val.add(1);
				map.put(sumOfDigits, val);
			}
		}
		if (countRulingPair < 2)
			return -1;
		int ans = Integer.MIN_VALUE;
		for (Map.Entry<Integer, List<Integer>> set : map.entrySet()) {
			System.out.println(set.getValue().get(1));
			if (ans < set.getValue().get(0) && set.getValue().get(1) == 2)
				ans = set.getValue().get(0);
		}

		return ans;
	}

	static int findSumOfDigits(int val) {
		int sum = 0;
		while (val != 0) {
			sum += (val % 10);
			val = val / 10;
		}
		return sum;
	}

	static String secondSmallest(int S, int D) {
		int count = 0;
		int temp = S;
		int sum = 0;
		String ans = "";
		while (count != 2) {
			temp++;
			System.out.println("temp " + temp % 10);
			while (temp != 0) {
				temp %= 10;
				sum += temp;
				if (sum == S) {
					count++;
					ans = "" + sum;
					sum = 0;
				}
				// System.out.println("temp "+temp +", sum "+sum);
			}

		}
		return ans;
	}
}
