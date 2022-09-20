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
		
		list.addMiddle(40, 30);	// adding data (40) after data (30) in Linked List
		
		list.display();		// printing Linked List using display method
		
		list.dalete(40);	// delete data (40) from Linked List
		
		list.display();		// printing Linked List using display method
		
		list.size();		// printing size of Linked List using size method
		
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		
		sortedLinkedList.addSort(56);
		sortedLinkedList.addSort(30);
		sortedLinkedList.addSort(40);
		sortedLinkedList.addSort(70);
		
		sortedLinkedList.print();
	}

}
