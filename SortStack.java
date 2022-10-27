package practice_Question;
import java.util.* ;
import java.io.*; 
public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(-2);
		s.push(8);
		s.push(0);
		s.push(-5);
		s.push(10);
		sortStack(s);
	
		System.out.println(s.peek());
		

	}
	public static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty()){
            return;
        }
        int num=stack.peek();
        stack.pop();
        sortStack(stack);
        sortedinsert(stack,num);
	}
    public static void sortedinsert(Stack<Integer>stack,int num){
        if(stack.isEmpty()|| (!stack.isEmpty())&&stack.peek()<num){
            stack.push(num);
            return;
        }
         int n=stack.peek();
        stack.pop();
        sortedinsert(stack,num);
        stack.push(n);
        
    }

}



	

