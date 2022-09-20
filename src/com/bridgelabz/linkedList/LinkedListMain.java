package com.bridgelabz.linkedList;

/*
 * @author SHREYASH JADHAV
 */
public class LinkedListMain {

	public static void main(String[] args) {

		System.out.println("\n Welcome to Linked List Program");
		
		LinkedList list = new LinkedList();		// created object of LinkedList class
		
		/*
		 * 	Adding data 56, 30, 70 at End of Linked List using addEnd method
		 */
		
		list.addEnd(56);
		list.addEnd(30);
		list.addEnd(70);
		
		list.display();		// printing Linked List using display method
		
		list.search(30);	// searching data 30 in Linked List using search method
	}

}
