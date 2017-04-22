package sorting;

public class Node {
	// private variables
	private int element;
	private Node next;

	/**
	 * Node Constructor
	 * 
	 * @param input
	 */
	public Node(int input) {

		this.setElement(input);

	}

	/**
	 * Node Constructor
	 * 
	 * @param input
	 * @param n
	 */
	public Node(int input, Node n) {

		setElement(input);
		setNext(n);

	}

	// Getters and Setters

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;

	}

}
