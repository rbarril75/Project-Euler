//
//  P6.java
//  
//
//  Created by Ryan Barril on 10/5/12.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class P6 {
	public static void main(String[] args) {
		int sum = 0;
		int sum_squares = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			sum_squares += i * i;
		}
		int square_sum = sum * sum;
		
		System.out.println(square_sum - sum_squares);
	}
}
