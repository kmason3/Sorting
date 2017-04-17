package sorting;


public class List {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * Constructor for an empty list
	 */

	public List() {
		this.head = new Node(null);
		this.tail = new Node(null);
		head.setNext(tail);
		tail.setPrev(head);

	}

	/**
	 * gets size
	 * 
	 * @return int size
	 */

	public int getSize() {
		return size;
	}

	/**
	 * if empty returns true else returns false
	 * 
	 * @return boolean
	 */

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * add node element to the first position
	 * 
	 * @param String
	 *            input
	 * 
	 */

	public void addFirst(String input) {

		Node newNode = new Node(input);

		if (isEmpty()) {
			this.head = newNode;
			head.setNext(tail);
			tail.setPrev(head);

			size++;

		} else {

			head.setPrev(newNode);

			newNode.setNext(head);

			this.head = newNode;

		}

	}

	/**
	 * Adds string to end of list
	 * 
	 * @param input
	 */
	public void addLast(String input) {
		Node newNode = new Node(input);

		if (isEmpty()) {
			this.tail = newNode;

			size++;
		}
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(newNode);
		newNode.setPrev(tail);
		this.tail = newNode;

		tail.setPrev(current);

	}

	/**
	 * Adds to list in alphabetical order
	 * 
	 * @param input
	 */
	public void add(String input) {
		Node current = head;
		Node newNode = new Node(input);

		if (isEmpty()) {
			head = newNode;

		}

		else if (current.getElement().compareToIgnoreCase(input) >= 0) {
			addFirst(input);
		}

		else {
			while (input.compareToIgnoreCase(current.getElement()) > 0
					&& current.getNext() != null) {
				current = current.getNext();
			}

			if (current.getNext() == null
					&& input.compareToIgnoreCase(current.getElement()) > 0) {
				addLast(input);

			}

			else {
				current.getPrev().setNext(newNode);
				newNode.setPrev(current.getPrev());
				newNode.setNext(current);
				current.setPrev(newNode);

			}
		}
		size++;

	}

	/**
	 * Finds if input is in list
	 * 
	 * @param input
	 * @return
	 */
	public boolean find(String input) {
		if (isEmpty())
			return false;

		Node current = head;

		if (input == current.getElement())
			return true;

		while (current.getNext() != null) {
			current = current.getNext();

			if (current.getElement() == input)
				return true;
		}
		return false;

	}

	/**
	 * Finds string in list and prints statement telling user if it is there or
	 * not
	 * 
	 * @param input
	 */
	public void findString(String input) {

		if (isEmpty())
			System.out.println("List is empty.");

		Node current = head;

		if (input == current.getElement())
			System.out.println(input + " is in list.");
		else {
			while (current.getNext() != null) {
				current = current.getNext();

				if (current.getElement() == input) {
					System.out.println(input + " is in list.");
				} else {
					System.out.println(input + " is not in list.");
				}
				break;

			}
		}

	}

	/**
	 * Deletes node containing input string
	 * 
	 * @param input
	 */

	public void deleteNode(String input) {

		if (isEmpty()) {
			System.out.println("List is empty.");
		}

		if (head.getElement() == input) {

			head.getNext().setPrev(null);
			head = head.getNext();
		}

		if (tail.getElement() == input) {
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
		}

		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();

			if (current.getElement() == input) {

				current.getPrev().setNext(current.getNext());
				current.getNext().setPrev(current.getPrev());

			}
		}

	}

	/**
	 * Deletes entire list.
	 */
	public void deleteList() {
		if (isEmpty()) {
			System.out.println("List is Empty.");
		}

		else {
			head.setNext(tail);
			tail.setPrev(head);
			head = null;
			tail = null;
			size = 0;

			System.out.println("List has been deleted!");
		}
	}

	/**
	 * Prints list forward
	 */
	public void printForward() {

		if (isEmpty())
			System.out.println("List is Empty");

		Node current = head;

		while (current != null) {

			System.out.print(current.getElement() + " ");
			current = current.getNext();

		}
		System.out.println("");

	}

	/**
	 * Prints list backward
	 */

	public void printBackward() {

		if (isEmpty())
			System.out.println("List is Empty");

		Node current = tail;

		while (current != null) {

			System.out.print(current.getElement() + " ");
			current = current.getPrev();

		}
		System.out.println("");

	}

}

