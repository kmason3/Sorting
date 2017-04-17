package sorting;


public class Node {
	private String data;
	private Node next;

	public Node() {

		this.setData(null);
		this.setNext(null);

	}

	public Node(String input) {

		this.setData(input);
		this.setNext(null);

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void print() {
		System.out.println(this.data);

	}

}



