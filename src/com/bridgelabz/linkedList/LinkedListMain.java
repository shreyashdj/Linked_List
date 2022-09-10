package com.bridgelabz.linkedList;

/*
 * @author SHREYASH JADHAV
 */
public class LinkedListMain {

	public static void main(String[] args) {

		System.out.println("\n Welcome to Linked List Program");
		
		LinkedList list = new LinkedList();		// created object of LinkedList class

		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		
		list.display();
	}

}
