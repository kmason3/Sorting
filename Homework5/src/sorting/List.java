package sorting;


public class List {
	// variables for size and root node
		private int size = 0;
		private Node head = null;

		// empty constructor for node list
		public List() {

		}

		// if size is zero then true if not false
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void add(Node node) {
			// if list is empty add node to first position and increment size by one
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

			// if list is not empty add node to next position in list and increment
			// size by one

		}

		/*
		 * It has to take a new Node and add that to the next address of previous
		 * Node. If the list is empty, assign it as the "root"
		 * 
		 * @Param - Node
		 */
		
		/*
		 * It has to return the size of the NodeList
		 * 
		 * @return size
		 */
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
