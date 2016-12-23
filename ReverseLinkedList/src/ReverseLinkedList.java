
public class ReverseLinkedList {
	
	public static void main(String[] args){
		LinkedListT r = new LinkedListT();
		
	
		
		r.addAtBegin(50);
		r.addAtBegin(40);
		r.addAtBegin(30);
		r.addAtBegin(20);
		r.addAtBegin(10);
		
		r.display(r.head);
		
		r.reverseIterative(r.head);
		
		LinkedListT r1 = new LinkedListT();
		
		r1.addAtBegin(500);
		r1.addAtBegin(400);
		r1.addAtBegin(300);
		r1.addAtBegin(200);
		r1.addAtBegin(100);
		System.out.println();
		System.out.println();
		System.out.println();
		r1.display(r1.head);
		r1.reverseRecursion(r1.head, r1.head.next, null);
		
		
	}

}
