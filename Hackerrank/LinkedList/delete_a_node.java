/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    

    if(head == null) return head;
    
     Node nextNode = new Node();
     Node currentNode = new Node();
    
    currentNode = head;
    
    if(position ==0){
        head = head.next;
        return head;
    }
    
    if(position > 0 && currentNode.next != null){
        while(position -1 > 0){
            currentNode = currentNode.next;
            position--;
            
        }
           
        currentNode.next = currentNode.next.next;
      

        
    }else{
        currentNode.next = null;
    }
    
      return head;
    
 
}

