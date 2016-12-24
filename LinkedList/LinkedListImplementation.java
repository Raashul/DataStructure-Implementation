
public class LinkedListImplementation {
	public static void main(String[] args){
		
		LinkedListT ll = new LinkedListT();
		
		ll.addAtBegin(5);
		ll.addAtBegin(15);
		ll.addAtBegin(100);
		ll.addAtBegin(200);
		ll.addAtBegin(15);
		ll.addAtEnd(20);
		ll.addAtEnd(21);
		ll.deleteAtBegin();
		ll.deleteAtEnd();
		ll.addAtIndex(10, 2);
		ll.addAtIndex(500, 4);
		ll.addAtIndex(3, 3);
		ll.addAtEnd(15);
		ll.display();
		
		
		System.out.println("\n Size of the list is: " + ll.size);
		System.out.println(" Element at 2nd position : " + ll.elementAt(2));
		System.out.println(" Searching element 15, location : " + ll.search(15));
		
		
		if(ll.hasCycle(ll.head) == true){
			System.out.print("cycle");
		}else{
			System.out.println("not a cycle");
		}
		
		
	}
}
