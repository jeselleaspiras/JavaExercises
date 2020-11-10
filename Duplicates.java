/* Find the duplicate characters in a string */

import java.util.*;

public class Duplicates {
	public static void main ( String args[] ){
		
		String name = "jeselleaspiras"; 
		char[] nameChar = name.toCharArray();

		for ( int i=0; i<name.length(); i++ ){
			for (int j = i + 1; j<name.length(); j++) {
            	if ( nameChar[i] == nameChar[j] ) {
               		System.out.println(nameChar[j] + " ");
               		break;
            	}
         	}
		}

	}//psvm
}//class
