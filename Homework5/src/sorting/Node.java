package sorting;



public class Node {
	private String element;
	private Node prev;
	private Node next;

	public Node(String input) {
		this.element = input;
	}

	/**
	 * constructor for node
	 * 
	 * @param String
	 *            element
	 * @param Node
	 *            previous
	 * @param Node
	 *            next
	 */
	public Node(String input, Node p, Node n) {
		setElement(input);
		setPrev(p);
		setNext(n);
	}

	// getters and setters
	public String getElement() {

		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
