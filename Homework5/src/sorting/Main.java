package sorting;

public class Main {

	public static void main(String[] args) {
		List test = new List();
		System.out.println("Unsorted:");
		test.fillList(10);

		test.print();

		test.bubbleSort();
		System.out.println("Sorted:");
		test.print();
	}

}
