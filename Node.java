package tp2_listes;

public class Node {
	private String element;
	Node next;
	public String data;
	
	public Node(String string, Node n) {
		element = string;
		next = n;
	}

	public String getElement() {
		return element;
		}
	
	public Node getNext() {
		return next;
	}
	
	public void setElement(String newElem) {
		element = newElem;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}
	
}
