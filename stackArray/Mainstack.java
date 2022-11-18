package stackArray;

public class Mainstack {

	public static void main(String[] args) {
		Stack1 stack=new Stack1();
		
		stack.push(12);
		stack.push(5);                      //lifo,filo
		stack.push(10);
		stack.push(4);
		stack.push(7);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
