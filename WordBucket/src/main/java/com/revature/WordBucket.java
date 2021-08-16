package com.revature;

import java.util.ArrayList;
import java.util.List;

public class WordBucket {

	public List<String> primitiveToDeclaritive(String[] array){
		List<String> result = new ArrayList<String>();
		for(String string: array) {
			result.add(string);
		}
		return result;
	}
	
	public String cutLastCharacter(String string) {
		String result = "";
		for(int i=0; i<string.length()-1;i++) {
			result += string.charAt(i);
		}
		return result;
	}
	
	public List<String> bucketize(String string, int count){
		List<String> result = new ArrayList<String>();
		String temp = "";
		String addedString = "";
		List<String> listOfWords = primitiveToDeclaritive(string.split(" "));
		for(int i=0; i<listOfWords.size()+2;i++) {
			if(i == listOfWords.size()+1) {
				if(0 <= i && i < listOfWords.size()) temp += listOfWords.get(i)+" ";
				result.add(cutLastCharacter(addedString));
			}
			
			if(temp.length()-1 > count) {
				result.add(cutLastCharacter(addedString));
				if(0 <= i-1 && i-1 < listOfWords.size()) temp = listOfWords.get(i-1)+" ";
				addedString = "";
			}
			
			if(i < listOfWords.size()) temp += listOfWords.get(i)+" ";
			if(0 <= i-1 && i-1 < listOfWords.size()) addedString += listOfWords.get(i-1)+" ";
		}
		return result;
	}
	
}
