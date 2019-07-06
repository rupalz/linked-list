package stack;

public class Stack extends LinkedList {
	int MAX=10000;
	void push (int key){
	insertFirst(key);
	}
int pop()
{
	int key=head.data;
	deleteFirst();
	return key;
	}
int peek()
{
	if (head==null) {
		System.out.print("stack is empty");
	return  MAX;}
	else 
	return head.data;
}
boolean isempty() {
	if (head==null)
      return true;
	else
		return false;}


}