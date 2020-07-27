
/*
 * 
 * Program for linked list operation
 * 
 * */

public class LinkedList {
	
	Node head = null;
	Node next = null;
	int data = 0;
	
	public static int counter = 0;
	
	/*
	 * Function to create a link list
	 * 
	 * */
	
	public LinkedList createLinkedList(LinkedList myList, int data) {
		
	
		Node newNode = new Node(data);
		//newNode.next = null;
		
		if(myList.head == null) {
			myList.head = newNode;
			counter++;
		}
		else {
			
			Node curr = myList.head;
			while(curr.next!=null)
				curr = curr.next;
			
			curr.next = new Node(data);
			counter++;		
		}
		
		return myList;
		
	
		
	}
	
	/*
	 * Function to display List
	 * 
	 * */
	public void displayList(LinkedList myList) {
		
		if(myList.head == null) {
			System.out.println("Null List");
		}
		
		Node curr = myList.head;
		while(curr!= null) {
			
			System.out.print(curr.data + "  ");
			curr = curr.next;
		}
		System.out.println(" ");
		
	
		
	}
	
	/*
	 * Function to reverse a list
	 * */
	
	public void reverseList(LinkedList myList) {
		
		Node curr, prev;
		prev = null;
		curr = myList.head;
		Node temp = null;
		
		while(curr!=null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		myList.head = prev;
		
		displayList(myList);
		
		
		
	}
	
	
	/*
	 * Function to reverse a link list in a group
	 * e.g. Link list : 1 -> 2 -> 11-> 6-> 5-> 9-> 7-> 8 and position is 4
	 * Output : 6-> 11-> 2-> 1-> 8 -> 7 -> 9 ->5
	 * */
	
	public void reverseGroupList(LinkedList myList, int pos) {
		
		Node curr = myList.head;
		Node temp, prev = null;
		Node head1 = null;
		
		for(int i = 0 ; i <pos; i ++)
			curr = curr.next;
		
		//Assigning head of the other group to end of the node at position
		head1 = curr;
	
		//Assigning head of first group to the end of first group
		curr = myList.head;
	
		//Reverse the First group
		while(curr != head1) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		
		}
		
		myList.head = prev;
	
		//Reverse the second group
		curr = head1;
		temp = null ;prev = null;
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		
		}
	head1 = prev;
	
	//Attach two groups
	curr = myList.head;
	while(curr.next!= null)
		curr = curr.next;
	
	curr.next = head1;
	
	//Display the list
	myList.displayList(myList);
	
	
		
	}
	
	/*
	 * Function to remove the node
	 * 
	 * */
	
	public void removeNode(LinkedList myList, int data) {
		
		Node curr = myList.head;
		Node prev = curr;
		
		
			if(head.data == data) {
				head = head.next;
				curr.next = null;
			}
			
		
			curr =  prev.next;
			while(curr !=null) {
				if(curr.data == data) {
					prev.next = curr.next;
					
					
					break;
				}
				prev = prev.next;
				curr = curr.next;
				
				
			}
			
			
			myList.displayList(myList);
		
		
		
	}
	
	
	public static void main(String []args) {
		
		
		LinkedList myList = new LinkedList();
		for(int i = 0 ; i<= 14 ; i++)
			myList = myList.createLinkedList(myList, i);
		myList.displayList(myList);
		
		myList.reverseList(myList);
		myList.reverseGroupList(myList, 8);
		
		myList.removeNode(myList, 14);
	}
	
	

}
