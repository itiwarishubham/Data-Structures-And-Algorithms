package com.ds.stack;

import java.util.Stack;

public class CountTheReversals {
	
	public static int countTheReversals(String s) {
		// m/2 + n/2
		int n=0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(!stack.isEmpty() && stack.peek() == '{' && s.charAt(i) == '}') {
				stack.pop();
			}else {
				stack.push(s.charAt(i));
			}
		}
		int size = stack.size();
		while(!stack.isEmpty() && stack.peek() =='{') {
			stack.pop();
			n++;
		}
		
		return (size/2) + (n%2);
	}

}
