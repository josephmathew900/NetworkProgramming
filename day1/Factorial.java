import java.util.*;

class Factorial{
	public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
        	System.out.println("Enter a number:");
		int fact = 1;
                int n = scan.nextInt();
                
                if(n == 0){
			System.out.println("Factorial:1");	
 		}
 		else{
			while(n>0){
				fact = fact *n;
                                n--;		
			}
                        System.out.println("Factorial:" + fact);
		}
	}
}