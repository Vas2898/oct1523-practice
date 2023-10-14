package javapractise;

public class LinkedListDemo {

	public static void main(String[] args) {
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		a.data = 5;
		a.next = b;
		b.data = 10;
		b.next = c;
		c.data = 15;
		c.next = null;
		
		System.out.println(a.data);
		System.out.println(a.next);
		System.out.println(b.data);
		System.out.println(b.next);
		System.out.println(c.data);
		System.out.println(c.next);
		

	}

}
