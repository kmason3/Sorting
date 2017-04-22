package sorting;

import java.util.Random;

public class List {

	// Private variables

	private int size = 0;
	private Node head = null;

	/**
	 * Empty Constructor
	 */
	public List() {

		head = null;

	}

	/**
	 * Checks is list is empty
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Adds node
	 * 
	 * @param node
	 */
	public void add(Node node) {
		// if list is empty add node to front of list
		if (isEmpty()) {

			head = node;
			size++;
			return;
		}

		// if list is not empty, adds to end of list
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(node);
		size++;

	}

	/**
	 * adds node with int input
	 * 
	 * @param input
	 */
	public void add(int input) {
		// creates new node with element of the integer input
		Node node = new Node(input);
		// adds new node to list
		this.add(node);

	}

	/**
	 * adds random number between 1 and 50
	 */
	public void addRandom() {
		// new random variable
		Random rand = new Random();
		// variable for a random integer between 1 and 50
		int randomNumber = rand.nextInt(50) + 1;
		// adds random number to list
		this.add(randomNumber);
	}

	/**
	 * fills list to user defined size
	 * 
	 * @param total
	 */

	public void fillList(int listSize) {
		// adds random numbers to list until size reaches the user defined size
		for (int i = 1; i <= listSize; i++) {

			this.addRandom();

		}

	}

	/**
	 * sorts list using bubble sort algorithm
	 */
	public void bubbleSort() {
		// if list is empty prints list is empty
		if (isEmpty()) {
			System.out.println("List is Empty!");
		}
		// if list has one element prints list has one element and is sorted
		if (size == 1) {
			System.out
					.println("List only contains one item, so, you know, it's already sorted!");
		}

		// variables for if something has been swapped and current node
		boolean swapped = true;
		Node current = this.head;
		/*
		 * if an item has been swapped or it's the first iteration enters loop
		 * while the current element is not null checks if the current element
		 * is larger than the next if it is swaps them then goes to next node
		 * and test the element until no items are swapped then the list is
		 * sorted!
		 */
		while (swapped) {

			swapped = false;

			while (current != null) {

				if (current.getNext() != null
						&& current.getElement() > current.getNext()
								.getElement()) {

					int temp = current.getElement();
					current.setElement(current.getNext().getElement());
					current.getNext().setElement(temp);

					swapped = true;

				}
				current = current.getNext();

			}
			current = this.head;
		}
	}

	/**
	 * 
	 * @return list size
	 */
	public int size() {
		return size;
	}

	/**
	 * prints list
	 */
	public void print() {
		// if empty print list is empty
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		// if list is not empty prints out all elements separated by commas
		// except the last, which has no comma
		Node current = head;

		while (current != null) {

			if (current.getNext() != null) {
				System.out.print(current.getElement() + ",");
			} else {
				System.out.print(current.getElement());
				System.out.println();
			}

			current = current.getNext();
		}
	}

}
