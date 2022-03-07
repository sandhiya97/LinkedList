package LinkedList;

public class Main {
	/**
	* Main method for manipulation linkedList
	* @param args - Default Java param (Not used)
	*/
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	/*
	* PROCEDURE
	* 1. Creating Lined list
	* 2. Adding nodes to linkedList
	* 3. Printing linedList after adding nodes
	* 4. Deleting node from start of the linkedlist
	* 5. Printing linedList after deleting node from start of the linkedlist
	* 6. Deleting node from end of the linkedlist
	* 7. Printing linedList after deleting node from end of the linkedlist
	*/

	/*
	* 1. Creating Lined list
	*/
	LinkedList list = new LinkedList();

	/*
	* 2. Adding nodes to linkedList
	*/
	Node head = list.addNode(null, 1);
	list.addNode(head, 2);
	list.addNode(head, 3);
	list.addNode(head, 4);
	list.addNode(head, 5);
	list.addNode(head, 6);
	list.addNode(head, 7);
	list.addNode(head, 8);
	list.addNode(head, 9);

	/*
	* 3. Printing linedList after adding nodes
	*/
	list.printLinkedList(head);
	System.out.println();

	/*
	* 4. Deleting node from start of the linkedlist
	*/
	head = list.deleteNodeFromStart(head);

	/*
	* 5. Printing linedList after deleting node from start of the linkedlist
	*/
	list.printLinkedList(head);
	System.out.println();

	/*
	* 6. Deleting node from end of the linkedlist
	*/
	list.deleteNodeFromEnd(head);

	/*
	* 7. Printing linedList after deleting node from end of the linkedlist
	*/
	list.printLinkedList(head);

	}
}
