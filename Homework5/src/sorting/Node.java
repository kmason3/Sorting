package sorting;



public class Node {
	private int element;
	private Node next;
	
	public Node(int input){
		
		this.setElement(input);
		
	}
	
	public Node(int input, Node n){
		
		setElement(input);
		setNext(n);
		
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}
	
	public Node getNext(){
		return next;
	}
	public void setNext(Node next){
		this.next = next;
		
	}
	

}
