/* Find the second-highest number in an array */

import java.util.*;

public class SecondHighest {
	public static void main ( String args[] ){
		
		int[] numArray = {10, 5, 25, 15, 20, 1};

		Arrays.sort(numArray);

		System.out.println(numArray[numArray.length-2]);

	}//psvm
}//class