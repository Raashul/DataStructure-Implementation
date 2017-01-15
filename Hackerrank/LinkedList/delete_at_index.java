 /*
Node is defined as
class Node { int data; Node next;
} */
Node RemoveDuplicates(Node head) {
// This is a "method-only" submission.
// You only need to complete this method.
	Node tmp = new Node(); 
	Node nextNode = new Node();
	tmp = head;
	
	if(head == null || tmp.next == null) return head;
	
	while(tmp.next != null){ 
		
		if(tmp.data == tmp.next.data){
			tmp.next = tmp.next.next; }else{
			tmp = tmp.next; }
		}
	return head;
}
