import java.util.*;

class Palindrome{
	public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
        	System.out.println("Enter a number:");
                String text = scan.next(); 
    		
                String arr[] = text.split("");
                int length = arr.length;
                int flag = 0;
                int i = 1;
                int j = length-1;

                while(i<length/2){
			if(arr[i].equals(arr[j])){
				flag = 1;
                                i++; 
				j--;
			}
                        else{
				flag = 0;
                             	break;
			}
		}
		if(flag == 1){
			System.out.println("palin");
		}
                else{
			System.out.println("!palin");
		}
		
	}	
}
