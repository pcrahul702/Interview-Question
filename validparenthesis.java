package practice_Question;



import java.util.Stack;
public class validparenthesis {
	public static boolean isValidParenthesis(String expression) {
       // Write your code here.
       Stack<Character>s=new Stack<>();
      for(int i=0;i<expression.length();i++) {
    	  char ch=expression.charAt(i);
    	  if(ch=='('||ch=='{'||ch=='[') {
    		  s.push(ch);
    	  }
    	  else {
    		  if(!s.isEmpty()) {
    			  char top=s.peek();
    			  if(top=='('&& ch==')'||top=='{'&& ch=='}'||top=='['&& ch==']') {
    				  s.pop();
    			  }
    			  else {
    				  return false;
    			  }    			  
    		  }
    		  else {
    			  return false;
    		  }
    	  }
      }
      if(s.isEmpty())
    	  return true;
      else
    	  return false;

   }

	public static void main(String[] args) {
		String ans="{()}";
		System.out.print(isValidParenthesis(ans)
);
	}

}
