package stack;

public class reversestack extends LinkedList {
	
	void push (int key){
	insertFirst(key);
	}
	void pop() {
		while(head.next!=null) {
			deleteFirst();
		}
	}
	

}	