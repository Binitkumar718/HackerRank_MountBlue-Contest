import java.util.Scanner;

public class NumberLineJumps{
public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        if(v2>=v1)
            return "NO";
        
        while(x1<x2){
            x1+=v1;
            x2+=v2;
            if(x1==x2)
                return "YES";
            
        }
        
        return "NO";

    }



	    
public static void main(String[] args) {
    System.out.println("Hello");
	Scanner in= new Scanner(System.in);
    int x1=in.nextInt();
    int v1=in.nextInt(); 
    int x2=in.nextInt(); 
    int  v2=in.nextInt();
   
	
	

System.out.println(kangaroo(  x1 ,v1,  x2,  v2));
}
}
