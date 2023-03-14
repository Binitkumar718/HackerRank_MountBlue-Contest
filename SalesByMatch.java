import java.util.*;

public class SalesByMatch {
	//using Hashset 
	public static int sockMerchant(int n,List<Integer> ar) {
	int count=0;
	//create an empty hashset
	HashSet<Integer> set= new HashSet<Integer>();
	for(int i=0;i<n;i++) {
        //It will check the element is present in the set or not if present
        //it will remove that element and increase the count.
        //"If Not Present :"Then else case will simply add the element in the set
		if(set.contains(ar.get(i))) {
			set.remove(ar.get(i));
			count++;
		}
        //At first list is empty then it simply add that element
		else {
			set.add(ar.get(i));
		}
	}
	return count;
	}
	// example: Input-[1,2,1,2,1,3,2];
    // 1.It will enter the the for loop
    // 2.if condition: It will only work if the element is already present or not. If it is present then it will remove that element and increment the count.
    // 3.Else condition: At first the hashset will be empty so it will simply add the first element.Then in the second iteration
    // if the similar element is not present then it will add that element too. 
    // 4.Final output will be count.
    //Above input There is one pair of color 1  and one of color 2 . There are three odd socks left, one of each color. The number of pairs is 2 .
public static void main(String[] args) {
    // This part is just for assigning the list as per method in the question.
	Scanner in= new Scanner(System.in);
	List<Integer> ar = new ArrayList<Integer>();
	System.out.println(ar);
	for (int i=0;i<7;i++) {
		ar.add(in.nextInt());
	}
    int n=ar.size();
System.out.println(sockMerchant(n,ar));
}
}