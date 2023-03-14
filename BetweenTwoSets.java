import java.util.*;
public class BetweenTwoSets {
	 public static int getTotalX(List<Integer> a, List<Integer> b) {
		    // Write your code here
		        int count=0;
		        int current_fac=a.get(a.size()-1),flag;
		        while(current_fac<=b.get(0)){
		            flag=0;
		            for(int i=0;i<a.size();i++){
		                if(current_fac%a.get(i)!=0){
		                    flag=1;
		                    break;
		                }
		            }
		            if(flag==0){
		                for(int i=0;i<b.size();i++){
		                   if(b.get(i)%current_fac!=0){
		                    flag=1;
		                    break;
		                }  
		                }
		            }
		            if(flag==0){
		                count++;
		            }
		            current_fac++;
		        }
		        
		        return count;

		    }
	 public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		a.add(2);
		a.add(4);
		b.add(16);
		b.add(32);
		b.add(96);
		System.out.println(getTotalX(a, b));
	}
}
