/* Iterate HashMap using While and advance for loop */

import java.util.*;

public class IterateHashmap {
	public static void main ( String args[] ){
		
		Map<Integer, String> wordsMap = new HashMap<Integer, String>();

		String firstSentence = "hello world I am jeselle hello again";
		String[] firstWords = firstSentence.split(" ");

		int i=0;
		while ( i<firstWords.length ){
			wordsMap.put(i, firstWords[i]);
			i++;
		}

		System.out.println(wordsMap.size());

		String secondSentence = "hi again";
		String[] secondWords = secondSentence.split(" ");
		for (String j : secondWords) {
			wordsMap.put(i, j);
			i++;
		}

		System.out.println(wordsMap.size());

	}//psvm
}//class