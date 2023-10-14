package javapractise;

public class LinkedList {

	private Node head;
	private Node tail;
	int size;
	
	
	LinkedList(){
		 head = tail = null;  // Constructer 
		 size = 0;
	}
	
	public void addFirst(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		if(size == 0) {
			tail = n;
		}
		size++;
		
	}
	
	public void addLast(int data){
		
	}
	
	public void addAt(int data) {
		
	}

	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		
		
	}
}
