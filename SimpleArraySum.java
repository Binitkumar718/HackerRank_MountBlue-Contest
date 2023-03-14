import java.util.*;
public class SimpleArraySum{
	public static int simpleArraySum(List<Integer> ar) {
	        // Write your code here.
            //It Just simple Instead of Array we got List. so, simply iterate through List and keep on adding the element.
	        int n=ar.size();
            int sum=0;
             for(int i=0;i<n;i++){
               sum=sum+ar.get(i);
}
        return sum;
    }
	    
public static void main(String[] args) {
    System.out.println("Hello");
	Scanner in= new Scanner(System.in);
	List<Integer> ar = new ArrayList<Integer>();
	
	for (int i=0;i<6;i++) {
		ar.add(in.nextInt());
	}
	
	System.out.println(simpleArraySum( ar));
}
}
