package sorting;

import java.util.Random;

public class List {
	
	//Private variables

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
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * Adds node
	 * @param node
	 */
	public void add(Node node) {
		//if list is empty add node to front of list
		if (isEmpty()) {

			head = node;
			size++;
			return;
		}

		Node current = head;
		
		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(node);
		size++;

	}

	/**
	 * adds node with int input
	 * @param input
	 */
	public void add(int input) {

		Node node = new Node(input);

		if (isEmpty()) {

			head = node;
			size++;
			return;
		}

		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(node);
		size++;

	}
	
	/**
	 * adds random number between 1 and 50
	 */
	public void addRandom() {
		Random rand = new Random();

		int n = rand.nextInt(50) + 1;

		this.add(n);
	}
	
	/**
	 * fills list to user defined size
	 * @param total
	 */

	public void fillList(int listSize) {

		for (int i = 1; i <= listSize; i++) {

			this.addRandom();

		}

	}

	/**
	 * sorts list using bubble sort algorithm
	 */
	public void bubbleSort() {
		if (isEmpty()) {
			System.out.println("List is Empty!");
		}
		if (size == 1) {
			System.out
					.println("List only contains one item, so, you know, it's already sorted!");
		}

		boolean swapped = true;
		Node current = this.head;

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

	public int size() {
		return size;
	}

	/**
	 * prints list
	 */
	public void print() {

		if (isEmpty()) {
			System.out.println("List is empty");
		}

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
