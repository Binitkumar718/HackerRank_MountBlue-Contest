import java.util.*;
public class CompareTheTriplet {
	 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
int count1=0;
int count2=0;
		 for(int i=0;i<a.size();i++) {
	if(a.get(i)==b.get(i)) {
		
	}
	else if(a.get(i)>b.get(i)) {
		count1++;
	System.out.println("check "+count1);
		 }
	else {
		count2++;
		System.out.println("check "+count1);
}
		 }
		 List<Integer> score = new ArrayList<>();
		 score.add(count1);
		 score.add(count2);
		 
		 
		 return score;
	    }
        //In the above Input
//a= (a[0], a[1], a[2]) = (5,6,7)

// b= (b[0], b[1], b[2]) = (3,6,10)

// Now, let's compare each individual score:

// a[0]> b[0], so Alice receives 1 point.

// a[1]=b[1], so nobody receives a point.

// a[2]< b[2], so Bob receives 1 point.

// Alice's comparison score is 1, and Bob's comparison score is 1. Thus, we return the Array [1,1];
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(5);
	list.add(6);
	list.add(7);
	List<Integer> list1 = new ArrayList<>();
	list1.add(3);
	list1.add(6);
	list1.add(10);
	System.out.println(compareTriplets(list, list1));
	
}
}
