package practice_Question;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack<>();
		int i=1;
		while(i<5) {
			stack.push(i);
			i++;
		}
		reverseStack(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.peek()+" ");
			stack.pop();
		}
		
		

	}
	public static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty()){
            return;
        }
        int num=stack.peek();
        stack.pop();
        reverseStack(stack);
        insertAtbottom(stack,num);
		
	}
    public static void insertAtbottom(Stack<Integer>stack,int x ){
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int num=stack.peek();
        stack.pop();
        insertAtbottom(stack,x);
        stack.push(num);
    }

}
