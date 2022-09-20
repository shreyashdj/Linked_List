package com.bridgelabz.linkedList;

/*
 * @author SHREYASH JADHAV
 */
public class LinkedList {
	
	// variables
	
	Node head;
	Node tail;
	
	/*
	 * 	method to print Linked List
	 */
	
	public void display() {

		Node temp = head;

	    if(temp == null) {
	    	System.out.println("\n LinkedList is empty");
	    } else {
	    	System.out.print("\n Linked List : ");
	    	while (temp != null) {
	    		System.out.print(temp.data + " -> ");
	    		temp = temp.next;
	    	}
	    	System.out.print("null");
		}
	    System.out.println();
	}
	
	/*
	 *	method to add data at start of Linked List
	 */
	
	public void addFirst(int data) {
		
		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		
		if (head == null) {
			
			head = newNode;
			tail = newNode;
			
		} else {
			
			newNode.next = head;
			head = newNode;
		}
	}
	
	/*
	 * 	method to add data at end of Linked List
	 */
	
	public void addEnd(int data) {
		
		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		
		if (head == null) {
			
			head = newNode;
			tail = newNode;
			
		} else {
			
			tail.next = newNode;
			tail = newNode;
		}
		
	}

	/*
	 *	method to add data at middle of Linked List
	 */
	public void addMiddle(int data, int previousData) {
		
		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		
		Node check = head;
		
		if(check == null) {
			
			System.out.println("\n previousData not Found \n Linked List is Empty");
	    	
	    } else {

	    	while (check.data != previousData && check.next != null) {
	    		check = check.next;
	    	}
	    	
	    	if (check.data == previousData) {
	    		
	    		Node temp;
		    	temp = check.next;
		    	check.next = newNode;
		    	newNode.next = temp;
		    	
	    	} else {
	    		System.out.println("\n previousData not Found");
	    	}   	
	    }

	}

	/*
	 * 	method to Delete First element of Linked List
	 */
	
	public void deleteFirst() {
		
		if (head == null) {
			
			System.out.println("\n LinkedList is empty");
			
		} else {
			
			head = head.next;
		}
	}

	/*
	 * 	method to Delete Last element of Linked List
	 */
	
	public void deleteEnd() {
		
		if (head == null) {
			
			System.out.println("\n LinkedList is empty");
			
		} else {
			
			Node temp = head;
			while (temp.next != tail) {
				
	    		temp = temp.next;
	    	}
			tail = temp;
			tail.next = null;
		}
		
	}
	
	/**
	 * 	method to search element in Linked List
	 */
	public void search(int data) {
		
		Node check = head;
		
		if(check == null) {
			
			System.out.println("\n Data not found : " + data + "\n Linked List is Empty");
	    	
	    } else {

	    	while (check.data != data && check.next != null) {
	    		check = check.next;
	    	}
	    	if (check.data == data) {
	    		System.out.println("\n Data found : " + data );
	    	} else {
	    		System.out.println("\n Data not Found : " + data);
	    	}
		}
		
	}
	
}
