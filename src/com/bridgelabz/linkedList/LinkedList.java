package com.bridgelabz.linkedList;

/*
 * @author SHREYASH JADHAV
 */
public class LinkedList {
	
	// variables
	
	Node head;
	Node tail;
	
	/*
	 * 	method to insert data in list
	 */
	
	public void insert(int data) {
		
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
	 * 	method to print list
	 */
	
	public void display() {

		Node temp = head;

	    if(temp == null) {
	    	System.out.println(" LinkedList is empty");
	    } else {
	    	System.out.print("\n Linked List : ");
	    	while (temp != null) {
	    		System.out.print(temp.data + " -> ");
	    		temp = temp.next;
	    	}
	    	System.out.print("null");
		}
	}
	
}
