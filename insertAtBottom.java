package practice_Question;

import java.util.Stack;

public class insertAtBottom {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(4);
		s.push(2);
		s.push(7);
		s.push(0);
		int x=10;
		pushAtBottom(s,x);
		while(!s.isEmpty()) {
			System.out.println(s.pop()+" ");
		}
		
		
		

	}
	public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
	  {
	      solve(myStack,x);
	      return myStack;
	  }
	public static void solve(Stack<Integer> s, int x){
	    //base case
	    if(s.isEmpty()){
	        s.push(x);
	        return;
	    }
	    int num=s.peek();
	    s.pop();
	    //recursive call
	    solve(s,x);
	    s.push(num);
	}

}
