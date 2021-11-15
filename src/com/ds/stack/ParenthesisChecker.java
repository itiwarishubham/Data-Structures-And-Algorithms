package com.ds.stack;

import java.util.Stack;

public class ParenthesisChecker {

	public static boolean isBalancedParenthesis(String x) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < x.length(); i++) {
			if(!stack.isEmpty() && stack.peek() == '{' && x.charAt(i) == '}') {
				stack.pop();
			}else if (!stack.isEmpty() && stack.peek() == '(' && x.charAt(i) == ')') {
				stack.pop();
			}else if (!stack.isEmpty() && stack.peek() == '[' && x.charAt(i) == ']') {
				stack.pop();
			}else {
				stack.push(x.charAt(i));
			}
		}
		return stack.size() ==0? true:false;
	}
}
