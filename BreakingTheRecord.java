import java.util.*;
public class BreakingTheRecord {
	 public static List<Integer> breakingRecords(List<Integer> scores) {
		    // Write your code here
            // This question is similar to find max and min in an Array.
            // First we have check for how many time max increase and how many time we get the lowest min . Store all in count od min and max.
            //lastly Initialize the list and add the count of max and min score .Because the return type is "List".
		        int count1=0;
		        int count2=0;
		        int max=scores.get(0);
		        int min=scores.get(0);
		        for(int i=1;i<scores.size();i++) {
		        	if(scores.get(i)>max) {
		        		max=scores.get(i);
		        		count1++;
		        	}
		        	else if(scores.get(i)<min) {
		        		min=scores.get(i);
		        		count2++;
		        	}
		        }
		        List<Integer> breakrecode =new ArrayList<>();
		        	breakrecode.add(count1);
		        	breakrecode.add(count2);
		        
//		        System.out.println("max score : "+max);
//		        System.out.print("max score break time: "+count1);
//		        
//		        System.out.println("min score : "+min);
//		        System.out.println("min score break : "+count2);
		        
		        return breakrecode;

		    }

		
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	List<Integer> scores=new ArrayList<>();
	System.out.println(scores);
	for(int i=0;i<9;i++) {
		scores.add(in.nextInt());
	}
	System.out.println(scores);
	System.out.println(breakingRecords(scores));
}
}
