//
//  P4.java
//  
//
//  Created by Ryan Barril on 10/4/12.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class P4 {
	
	static boolean isPalindrome(int n) {
		return (isPalindrome(Integer.toString(n)));
	}
	
	static boolean isPalindrome(String str) {
		if (str.length() == 1)
			return true;
		
		if (str.length() == 2)
			return (str.charAt(0) == str.charAt(1));

		if (str.charAt(0) == str.charAt(str.length() - 1))
			return isPalindrome(str.substring(1, str.length() - 1));
		
		return false;
	}
								
	public static void main(String[] args) {
		int max = 0;
		for (int i = 999; i >= 100; i--)
			for (int j = 999; j >= 100; j--) {
				int prod = i * j;
				if (isPalindrome(prod))
					max = (max > prod) ? max : prod;
			}
		System.out.println(max);
	}
}
