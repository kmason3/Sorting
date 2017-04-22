package sorting;

import java.util.Random;

public class List {

	private int size = 0;
	private Node head = null;

	public List() {

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void add(Node node) {

		if (isEmpty()) {

			head = node;
			size++;
			return;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(node);
		size++;

	}

	public void add(int input) {

		Node node = new Node(input);

		if (isEmpty()) {

			head = node;
			size++;
			return;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(node);
		size++;

	}

	public void addRandom() {
		Random rand = new Random();

		int n = rand.nextInt(50) + 1;

		this.add(n);
	}

	public void fillList(int total) {

		for (int i = 1; i <= total; i++) {

			this.addRandom();

		}

	}

	public int size() {
		return size;
	}

	public void print() {

		if (isEmpty()) {
			System.out.println("List is empty");
		}

		Node temp = head;

		while (temp != null) {

			if (temp.getNext() != null) {
				System.out.print(temp.getElement() + ",");
			} else {
				System.out.print(temp.getElement());
				System.out.println();
			}

			temp = temp.getNext();
		}
	}

}
