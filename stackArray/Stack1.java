package stackArray;

public class Stack1 {
private int[] items;
private int top;

public Stack1() {
	this.items=new int[100];
	this.top=-1;
}
 public boolean isEmpty() {return top<0;}
 
 public boolean isFull() {return top==items.length-1;}
 
 public void push(int item) {
	 if (isFull())
		 throw new RuntimeException("stack is full");
	 items[++top] =item;
 }
	 public int pop() {
		 if (isEmpty())
			 throw new RuntimeException("stack is empty");
		 return items[top--];
	 }
public int peek() {
	if(isEmpty())
		throw new RuntimeException("stack is empty");
	return items[top];

  }
}
