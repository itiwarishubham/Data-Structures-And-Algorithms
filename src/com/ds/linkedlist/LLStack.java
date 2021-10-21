package com.ds.linkedlist;

public class LLStack {
	SNode head;
	
	public void push(int data) {
		SNode temp = new SNode(data, null);
		if(head == null) {
			head = temp;
			return;
		}else {
			temp.next = head;
			head = temp;
		}
		
	}
	
	public int pop() {
		if(head == null) return Integer.MIN_VALUE;
		int res = head.data;
		head = head.next;
		return res;
	}
	
	public void print() {
		SNode temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int peek() {
		if(head != null) return head.data;
		
		return Integer.MIN_VALUE;
	}

}
