package practice_Question;

import java.util.Stack;

public class DeleteMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		int i=1;
		while(i<=10) {
			stack.push(i);
			i++;
		}
		int count=0;
	
		deleteMiddleElement(stack,stack.size(),count);
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
			
		}

	}

	public static void deleteMiddleElement(Stack<Integer> stack, int size,int count) {
		//base case
		if(count==size/2) {
			stack.pop();
			return;
		}
		//ek element ko hata kr rakh liya;
		int num=stack.peek();
		stack.pop();
		//recursive call
		deleteMiddleElement(stack,size,count+1);
		//function bapas ja rha hai to usko de de rhai jo rakha tha
		stack.push(num);
	}
	
}
