//
//  P2.java
//  
//
//  Created by Ryan Barril on 10/4/12.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class P2 {
	public static void main(String[] args) {
		int sum = 0;
		int prev1 = 0;
		int prev2 = 1;
		while (prev2 < 4000000) {
			prev2 = prev1 + prev2;
			prev1 = prev2 - prev1;
			if (prev2 % 2 == 0)
				sum += prev2;
		}
		System.out.println(sum);
	}
}
