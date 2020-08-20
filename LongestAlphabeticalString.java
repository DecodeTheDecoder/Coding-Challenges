package com.examples.string;

import java.util.HashMap;
import java.util.Map;

public class LongestAlphabeticalString {
	
	  public static String longestAlpabeticalSubstring(String text) {
	      // Your code here
		  Map<Character,Integer> table = new HashMap<Character,Integer>();
			 
			 for (Character c: text.toCharArray()) {
				 
				if (table.containsKey(c)) {
					table.put(c, (table.get(c))+1);
				}
				else {
					table.put(c, 1);
				}
			 }
			 
			 int textLength=text.length();

	     if (textLength==0 || textLength ==1) return text;
		 int begin=0;
		 int end=1;
		 String ans=Character.toString(text.charAt(0));
			 while(end<textLength) {
				 
				 int previousCharAscii= (int)text.charAt(end-1);
				 int endCharAscii=(int)text.charAt(end);
				 if(previousCharAscii<=endCharAscii) {
					 	end++;
					 if(end-begin>ans.length()) {
					ans=text.substring(begin, end);
					 System.out.println(begin+" "+end+" "+ans);
					 }
				 }
				 else {
					 begin=end;
					 end++;
				 }
				 
			 }
			 
		    return ans;
	  
	  }
	public static void main(String gg[]) {
		System.out.println(longestAlpabeticalSubstring("asdabcde"));
	}
}
