package com.examples.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

public class MinimumWindow {

	public static String minWindow(String s,String t) {
		Map<Character,Integer>table= new HashMap<Character,Integer>();
		
		for(char c: t.toCharArray()) {
			if (table.containsKey(c)) {
				Integer k=table.get(c);
				table.put(c, k+1);
			}
			else
			{
				table.put(c, 1);
			}
		}
		int counter = table.size();
		int begin=0; int len=1000000;
		int end=0;
		String ans= "";
		while(end<s.length()) {
			Character endChar=s.charAt(end);
			if (table.containsKey(endChar)) {
				int endCharCount= table.get(endChar);
				table.put(endChar, endCharCount-1);
				if (table.get(endChar)==0) counter--;
			}
			
			end++;
			while(counter==0) {
				if (end-begin<len) {
					len=end-begin;
					ans= s.substring(begin, end);					
				}
			Character startChar= s.charAt(begin);
			if (table.containsKey(startChar)) {
				table.put(startChar, table.get(startChar)+1);
				if(table.get(startChar)>0) counter++;
			}
					begin++;
			}
			
		}
		
		
		return ans;
		
	}
	
	
public static void main(String gg[]) {
	String s="Himammlaya";
	String t="amay";
	System.out.println(minWindow(s,t));
	
}



}
