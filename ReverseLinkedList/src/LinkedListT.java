
public class LinkedListT {
	public Node head;
	
	public LinkedListT(){
		head = null;
	}
	
	/*
	 * Set element at the head of the list
	 * The next element of the New Head will be the previous head
	 */
	public void addAtBegin(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
		
	}
	
	/* create 3 nodes currNode, PrevNode and next Node
	 * Because you loose reference to the previous and next Node when you change the pointers
	 * 
	 */
	public void reverseIterative(Node head){
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;
		
		while(currNode != null){
			nextNode 		= currNode.next;
			currNode.next 	= prevNode;
			prevNode 		= currNode;
			currNode		= nextNode;
		}
		
		head = prevNode;
		System.out.println("\n Reverse Through Iteration");
		display(head);
		
	}
	
	public void reverseRecursion(Node ptrOne, Node ptrTwo, Node prevNode){
		if(ptrTwo != null){
			
			if(ptrTwo.next != null){
				Node t1 = ptrTwo;
				Node t2 = ptrTwo.next;
				
				ptrOne.next = prevNode;
				prevNode = ptrOne;
				
				reverseRecursion(t1, t2, prevNode);
				
			}else{
				ptrTwo.next = ptrOne;
				ptrOne.next = prevNode;
				System.out.println("\n Reverse Through Recursion");
				display(ptrTwo);
			}
			
			
		}else if(ptrOne != null){
			System.out.println("\n Reverse Through Recursion");
			display(ptrOne);
		}
	}
	
	public void display(Node head){
		Node currNode = head;
		while(currNode != null){
			System.out.print("-->" + currNode.data);
			currNode = currNode.next;
		}
	}

	
	
}
