/* Fibonacci series */

import java.util.*;

public class Fibonacci {
	public static void main ( String args[] ){
		
		int x=0;
		int y=1;
		int z;

		System.out.println(x);
		System.out.println(y);

		for ( int i=2; i<20; i++ ){

			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}

	}//psvm
}//class