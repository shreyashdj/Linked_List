package com.bridgelabz.linkedList;

/**
 * @author SHREYASH JADHAV
 */
public class SortedLinkedList {

	// variable
	
	Node head;
	
	/**
	 * 	method to print Sorted Linked List
	 */
	public void print() {
		
		/*
		 * 	if head is null Linked List is Empty
		 * 	else traverse through LinkedList using while loop till end
		 * 	and print data one by one
		 */
		
		System.out.print("\n Linked List : ");
		
		Node temp = head;
		
		if(temp == null) {
			
			System.out.println("\n Linked List is Empty");
			
	    } else {
		
	    	while(temp != null) {
	    		System.out.print(temp.data + " -> ");
	    		temp = temp.next;
	    	}
	    	System.out.print("null");
	    }	
		System.out.println();
	}
	
	/**
	 * 	method to add element in Linked List in sorted form
	 */
	public void addSort(int data) {
		
		/*
		 * 	if head is null or data at head is greater than inserting data
		 * 	then add data before head and make it head
		 * 	else
		 * 	traverse through LinkedList till inserting data is larger
		 * 	then insert data after that Node
		 */
		
		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		Node check = head;					// store head in check variable
		
		if(head == null || head.data >= data) {
			
			newNode.next = head;
			head = newNode;
	    
	    } else {
	    	
	    	while (check.next != null && check.next.data < data) {
	    		check = check.next;
	    	}

		    newNode.next = check.next;
		    check.next = newNode;
		    
	    }
		
	}
	
}
