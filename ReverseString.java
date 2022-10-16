package practice_Question;
import java.util.*;
public class ReverseString {

	public static void main(String[] args)
	{
		String str="Love";
		
		String ans=ReverseString(str);
		System.out.println(ans);

	}

	private static  String ReverseString(String str) 
	{  
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		String ans="";
		while(!stack.isEmpty()) {
			char top=stack.peek();
			ans+=top;
			stack.pop();
		}

		return ans;
	}

}
