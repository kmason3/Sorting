package sorting;

public class Main {

	public static void main(String[] args) {
		// creates new empty list
		List test = new List();

		// fills list to specified size
		test.fillList(10);

		// prints unsorted list
		System.out.println("Unsorted:");
		test.print();

		// sorts list
		test.bubbleSort();

		// prints sorted list
		System.out.println("Sorted:");
		test.print();

	}

}
