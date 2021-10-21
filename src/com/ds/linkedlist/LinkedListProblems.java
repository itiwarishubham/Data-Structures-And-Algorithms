package com.ds.linkedlist;

public class LinkedListProblems {

	// reverse linkedlist
	public static SNode reverseLinkedList(SNode node) {

		SNode temp = node.next;
		SNode ans = new SNode(node.data, null);

		while (temp != null) {
			SNode newnode = new SNode(temp.data, ans);
			ans = newnode;
			temp = temp.next;
		}
		return ans;
	}
}
