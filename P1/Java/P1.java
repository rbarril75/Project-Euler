//
//  P1.java
//  
//
//  Created by Ryan Barril on 9/30/12.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class P1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3; i < 1000; i += 3) {
			if (i % 15 != 0)
				sum += i;
		}
		for (int i = 5; i < 1000; i += 5) {
			sum += i;
		}
		System.out.println(sum);
	}
}
