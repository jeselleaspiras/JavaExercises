/* Count the number of words in a string using HashMap */

import java.util.*;

public class NumberHashmap {
	public static void main ( String args[] ){
		
		String sentence = "hello world I am jeselle hello again";
		String[] words = sentence.split(" ");
		Map<Integer, String> wordsMap = new HashMap<Integer, String>();

		for (int i=0; i<words.length; i++) {
    		wordsMap.put(i, words[i]);
		}

		System.out.println("Number of words are " + wordsMap.size());

	}//psvm
}//class