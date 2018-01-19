import java.util.*;

class Fib{
	public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
        	System.out.println("Enter a number:");
                int n = scan.nextInt(); 
   
                int first = 0;
                int second = 1;
                int temp;
                
		if(n == 0){
			System.out.println("No terms!!!!");
		}
                else if(n == 1){
              		System.out.println(first);
		}else if(n == 2){
			System.out.println(first+" \t "+second);
		}else{  
 			System.out.print(first+" \t "+second);
                        for(int i = 3;i<= n;i++){
				temp = first + second;
                                System.out.print(" \t "+temp);
				first = second;
                                second = temp;
			}
                           
		}

	}	
}