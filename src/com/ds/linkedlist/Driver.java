package com.ds.linkedlist;

public class Driver {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addSNode(1);
		list.addSNode(2);
		list.addSNode(3);
		list.addSNode(4);
		list.sHead = LinkedListProblems.reverseLinkedList(list.sHead);
		list.print();
		//System.out.println();

		
	}
	
	void testStack() {
		LLStack stack = new LLStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("pop: "+stack.pop());
		System.out.println("peek: "+stack.peek());
		stack.print();
	}
	
	void testLlist() {
		LinkedList list = new LinkedList();
		list.addDNode(1);
		list.addDNode(2);
		list.printlist(list.head);
	}
	
	

}
