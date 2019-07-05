public class Nodetest {

	public static void main(String[]args) 
	{
		Node n= new Node();
		n.data=7;
		Node m=new Node();
		m.data=11;
		n.next=m;// making m as next node of n
		System.out.println(n.data);  // prints 7
        System.out.println(n.next.data);  
}}