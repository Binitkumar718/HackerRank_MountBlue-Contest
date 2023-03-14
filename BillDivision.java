import java.util.*;
public class BillDivision {
	 public static void bonAppetit(List<Integer> bill, int k, int b) {
		    // Write your code here
		        int totalcost=0;
		        for(int i=0;i<bill.size();i++){
		            if(i!=k){
		                totalcost+=bill.get(i);
		            }
		        }
		        int bactual=totalcost/2;
		        int extra= b-bactual;
		        if(extra==0){
		          System.out.println("Bon Appetit");

		        }
		        else
		          System.out.println(extra);

		    }
//Explanation:
//		Anna didn't eat item bill[1] = 10, but she shared the 
//		rest of the items with Brian. The total cost of the shared
//		items is 3+2+9= 14 and, split in half, the cost per person is 
//		bactual = 7. Brian charged her bcharged = 12 for her portion of 
//		the bill. We print the amount Anna was overcharged, beharged-bactual = 12-7=5,
//		on a new line.
		
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	List<Integer> bill = new ArrayList<>();
	bill.add(3);
	bill.add(10);
	bill.add(2);
	bill.add(9);
	System.out.println(" Enter the value of k and b ");
	int k=in.nextInt();
	int b=in.nextInt();
	bonAppetit(bill, k, b);// k=1,b=7;
	
}
}
