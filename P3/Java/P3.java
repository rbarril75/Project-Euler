//
//  P3.java
//  
//
//  Created by Ryan Barril on 10/4/12.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class P3 {
	
	static long findLargestPrimeFactor(long n) {
		return findLargestPrimeFactor_aux(n, 2l);
	}
	
	static long findLargestPrimeFactor_aux(long n, long start) {
		for (long i = start; i * i <= n; i++) {
			if (n % i == 0) {
				long r = findLargestPrimeFactor_aux(n / i, ++i);
				return (r > i) ? r : i;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		long n = 600851475143l;		
		System.out.println(findLargestPrimeFactor(n));
	}
}
