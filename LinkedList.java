 class LinkedList {
	 Node head;
    
	 void insert(int key){
	Node temp= new Node();
	temp.data= key;
	if(head==null)
		head= temp;
	else{
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;
	}
	curr.next=temp;
	}}
	 
	 
	 void print() {
    Node curr = head;
    while (curr.next != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
       }
    		System.out.print(curr.data + " ");
    		System.out.println();
}

	 
	 int search(int key){
	Node curr=head;
	int pos=0;
	while(curr!=null){
		if (curr.data==key)
			return pos;
		else{
			curr=curr.next;
			pos++;
			
		}
	}
	return -1;
}
	 void insert(int pos, int key)
	 {
		 Node temp= new Node();
		 temp.data=key;
		 if (pos==0){
			 temp.next=head;
			 head=temp;
		 }
		 else{
			 Node curr=head;
			 for (int i=0;i<pos-1;i++)
				 curr=curr.next;
			 temp.next=curr.next;
			 curr.next=temp;
		 }
	 }
	 
	 
	 void delete(int key)
	 {
		 int pos= search (key);
		 if (pos==-1)
			 return;
		 if (pos==0){
			 head=head.next;
			 return;
		 }
		 Node curr=head;
		 for (int i=0;i<pos-1;i++)
			 curr=curr.next;
		Node temp=curr.next;
		curr.next= temp.next;
		temp.next=null;
		 
	 }
	 
	 
	 
	 
}