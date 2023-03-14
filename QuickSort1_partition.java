import java.util.*;
public class QuickSort1_partition {
	public static List<Integer> quickSort(List<Integer> arr) {
	    // Write your code here
	        int pivot= arr.get(0);
	      System.out.println(pivot);
	        List<Integer> right = new ArrayList<>();
	        List<Integer> left = new ArrayList<>();
	         List<Integer> equal = new ArrayList<>();
	        for(int i=0;i<arr.size();i++){
	            if(arr.get(i)==pivot)
	                equal.add(arr.get(i));
	            
	            else if(arr.get(i)<pivot)
	                left.add(arr.get(i));
	        
	            else if(arr.get(i)>pivot)       
	                right.add(arr.get(i));
	            
	        }
	        System.out.println("left list: "+left);
	        System.out.println("equal list: "+equal);
	        System.out.println("right list: "+right);
	        left.addAll(equal);
	        left.addAll(right);

	      return left;  
	        
	    }
	public static void main(String[] args) {
		List<Integer> arr= new ArrayList<>();
		arr.add(4);
		arr.add(5);
		arr.add(3);
		arr.add(7);
		arr.add(2);
		
		System.out.println(quickSort(arr));
	}
}
