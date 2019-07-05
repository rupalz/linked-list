
		class LLTest{
			  public static void main(String[] args) {
			LinkedList l=new LinkedList();
			l.insert(5);  
	        l.insert(20);
	        l.insert(12);
	        l.insert(25);
	        l.print();
	        System.out.println( l.search(12) );
	        System.out.println( l.search(15) );  
	        l.insert(0,50); 
	        l.delete(30);
	        l.print(); 
	        }


}
