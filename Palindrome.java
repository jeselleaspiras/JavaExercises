/* Find whether a string or number is palindrome or not */

import java.util.*;

public class Palindrome {
	public static void main ( String args[] ){
		
		String pal = "abcdcba"; 
		char[] palChar = pal.toCharArray();
		boolean palBool = true;
		int i=0;
		int j=pal.length()-1;

		while ( i<j ){
			if (palChar[i] == palChar[j]){
				palBool = true;
			}
			else {
				palBool = false;
			}
			i++;
			j--;
		}

		if (palBool == true){
			System.out.println(pal + " is a palindrome");
		}
		else {
			System.out.println(pal + " is not a palindrome");
		}

	}//psvm
}//class
