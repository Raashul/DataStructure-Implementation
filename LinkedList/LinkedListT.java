
public class LinkedListT {
	public Node head;
	public int size;
	
	public LinkedListT(){
		head = null;
		
	}
	
	
	
	
	
	/*
	 * Set element at the head of the list
	 * The next element of the New Head will be the previous head
	 * Increase size by 1
	 */
	public void addAtBegin(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
		
	}
	
	
	
	
	/*
	 * Delete the first element in the list
	 * New Head will be the element next to the head
	 * Decrease size by 1
	 * 
	 */
	
	public int deleteAtBegin(){
		int tmp = head.data;
		head = head.next;
		size--;
		return tmp;
	}
	
	
	
	public void deleteAtEnd(){
		Node currNode = head;
		
		if(head.next == null){
			head = null;
		}else{
			while(currNode.next.next != null){
				currNode = currNode.next;
			}
			int temp = currNode.next.data;
			currNode.next = null;
			size--;
		}
	}
	
	
	
	
	/*
	 * Check if the Node is empty. If empty head is the element
	 * Loop till the end of the loop
	 * The next element of the previous tail is the new element
	 * Decrease size by 1
	 */
	
	public void addAtEnd(int data){
		if(head == null){
			addAtBegin(data);
		}else{
			Node n = new Node(data);
			Node currNode = head;
			while(currNode.next != null){
				currNode = currNode.next;
			}
			
			currNode.next = n;
			size++;
			
		}
		
	}
	
	
	
	/*
	 * If given index is invalid return -1
	 * Let initial node is head. Continue loop till we reach the index number
	 * If Index is 5, loop from the start until index-1 is not 0 and keep changing the value of the Node position.
	 * When index-1 is 0. The Node next to the Node position we're on is the element we're searching for.
	 */
	
	public int elementAt(int index){
		if(index > size){
			return -1;
		}else{
			Node n = head;
			while(index-1 != 0){
				n = n.next;
				index--;
			}
			return n.data;
		}
	}
	
	
	// Simply return the size
	public int getSize(){
		return size;
	}
	
	
	
	
	/*
	 * Start comparing from the first node
	 * If it is the first node return the count(default value 1)
	 * If Not
	 * 	Keep Looping to the next node until there is data in the list
	 */
	
	public int search(int data){
		
		Node n = head;
		int count =1;
		
		while( n != null){
			if(n.data == data){
				return count;
			}else{
				n = n.next;
				count++;
			}
		}
		return -1; // Means we did not find the data
	}
	
	
	
	

	public void addAtIndex(int data, int position){
		if(position ==1){
			addAtBegin(data);
		}
		
		int len = size;
		
		if(position > len +1 || position < 1){
			System.out.println("Invalid index number given");
		}
		
		if(position == len + 1){
			addAtEnd(data);
		}
		
		if(position <= len && position > 1){
			Node n = new Node(data);
			Node currNode = head;
			
			while((position-2) > 0){
				System.out.println(currNode.data);
				currNode = currNode.next;
				position--;
			}
			n.next = currNode.next;
			currNode.next =n;
			size++;
		}
	}
	
	
	public void display(){
		System.out.println();
		Node currNode = head;
		while(currNode != null){
			System.out.println("->" + currNode + " ");
			currNode = currNode.next;
		}
	}
	
}
