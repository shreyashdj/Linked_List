package com.bridgelabz.linkedList;

import java.util.Scanner;

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
	public void addMiddle(int data) {
		
		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		
		Node check = head;
		
		if(check == null) {
			
			head = newNode;
			tail = newNode;
	    	
	    } else {
	    	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n Enter data after you want to add new data : ");
		int previousData = scan.nextInt();

	    	while (check.data != previousData) {
	    		check = check.next;
	    	}
	    	Node temp;
	    	temp = check.next;
	    	check.next = newNode;
	    	newNode.next = temp;
		}

	}
	
}
