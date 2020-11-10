/* Check Armstrong number */

public class Armstrong {
	public static void main ( String args[] ){
		
	int x=0;
	int a, tmp;  
    int num=153;

    tmp=num;  
    while(num > 0){  
	    a = num%10;  
	    num = num/10;  
	    x = x+(a*a*a);  
    }  

    if(tmp == x){
    	System.out.println("It is an armstrong number.");
    }  
    else {  
        System.out.println("It is not an armstrong number.");   
   	}  

	}//psvm
}//class
