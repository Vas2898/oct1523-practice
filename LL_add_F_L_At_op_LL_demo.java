package javapractise;

public class LinkedListDemo {

	public static void main(String[] args) throws Exception {
	LinkedList l = new LinkedList();
	l.addLast(40);
	l.addFirst(10);
	l.addFirst(20);
	//l.addLast(78);
	l.addFirst(30);
	l.addLast(50);
	l.display();
	
	//System.out.print("  ");
	l.addAt(0, 0);
	l.addAt(100, l.getSize());
	l.display();
	//System.out.print("  ");
	
	l.addAt(4, 3);
	l.display();
	System.out.println(l.getSize());
	

	}

}
