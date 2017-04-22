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
