package com.bridgelabz.linkedList;

/*
 * @author SHREYASH JADHAV
 */
public class LinkedListMain {

	public static void main(String[] args) {

		System.out.println("\n Welcome to Linked List Program");
		
		LinkedList list = new LinkedList();		// created object of LinkedList class
		
		list.addEnd(56);
		list.addEnd(70);
		
		list.addMiddle(30);
		
		list.display();
	}

}
