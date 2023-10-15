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
		Node n = new Node(data);
		if(size == 0) {
			head = tail = n;
		}
		
		tail.next = n;
		tail = tail.next;
		size++;
	}
	
	public void addAt(int data, int idx) throws Exception {
		if (idx<0 || idx>size) {
			throw new Exception("index of bounds");  //Exception lang
		}
		if(idx == 0){
			addFirst(data);
		}
		else if(idx == size) {
			addLast(data);
		}
		else {
			Node temp = head;
			for (int jump = 1; jump <= idx-1; jump++);
			temp = temp.next;
		}
		  
		Node n = new Node(data);
		Node temp = head;
		n.next = temp.next;
		temp.next = n;
		size++;
		
		
		
	}

	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		
		
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
}
