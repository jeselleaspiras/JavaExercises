/* Swap two numbers using the third variable */

import java.util.*;

public class SwapNumbers {
	public static void main ( String args[] ){
		
		int x = 1;
		int y = 2;
		int tmp;

		tmp=x;
		x=y;
		y=tmp;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}//psvm
}//class
