import java.util.*;
public class SuperReducedString {

		    // *****************************Using StringBuilder and it buildin-method*************************
		 public static String superReducedString(String s) {
			    // Write your code here
			        StringBuilder sb= new StringBuilder(s);
			        for(int i=1;i<sb.length();i++){
			            if(sb.charAt(i)==sb.charAt(i-1)){
			                sb.delete(i-1,i+1);
			                
			            }
			        }
			        String ans=sb.toString();
			        if(ans.length()==0){
			            return "Empty String";
			        }
			return ans;
		
	 }
     //***********************************USING STACK********************************************
     //you will find print statement inside condition it just to check or debug if i am getting resonable output or not;
		 public static  String usingstack (String s) {
			 Stack<Character> stack = new Stack<Character>();
			 for(int i=0;i<s.length();i++) {
				 char c= s.charAt(i);
				 if(!stack.empty()&& stack.peek()==c) {
					 stack.pop();
					 System.out.println("inside if : "+stack);
				 }
				 else {
					 stack.push(c);
					 System.out.println("inside else"+stack);
				 }
			 }
			 if(stack.empty()) {
				 return "Empty String";
			 }
			 
			 else {
				 StringBuilder sb= new StringBuilder();
				 for(char c:stack) {
					 sb.append(c);
				 }
				 return sb.toString();
			 }
			 
		 }
		 
		 
	 public static void main(String[] args) {
		String s = new String("aaabccddd");
		System.out.println(superReducedString(s));
		System.out.println(usingstack(s));
	}
}
