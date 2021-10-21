package com.ds.linkedlist;

public class LinkedList {

	DNode head;
	SNode sHead;

	// DLL impl
	void addDNode(int data) {
		DNode temp = head;
		DNode new_DNode=new DNode(data, null, null);
		if (head == null) {
			new_DNode.left = null;
			head = new_DNode;
			return;
		}
		while (temp.right != null) {
			System.out.println(temp.right);
			temp = temp.right;
		}
		new_DNode.left = temp;
		temp.right = new DNode(data, temp, null);
	}
	
	// SLL impl
	void addSNode(int data) {
		
		SNode temp = sHead;
		if(sHead ==  null) {
			sHead = new SNode(data,null);
			return;
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new SNode(data, null);
	}
	
	public void printlist(DNode DNode)
    {
        DNode last = null;
        System.out.println(
            "Traversal in forward Direction");
        while (DNode != null) {
            System.out.print(DNode.data + " ");
            last = DNode;
            DNode = DNode.right;
        }
        System.out.println();
        System.out.println(
            "Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.left;
        }
    }
	
	public void print() {
		SNode temp = sHead;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}
	
	
}
