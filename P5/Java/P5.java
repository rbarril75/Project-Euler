//
//  P5.java
//  
//
//  Created by Ryan Barril on 10/5/12.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class P5 {
	public static void main(String[] args) {
		int i = 20;
		while (true) {
			if ((i % 19 == 0) && (i % 18 == 0) && (i % 17 == 0) && (i % 16 == 0) && (i % 15 == 0) && 
				(i % 14 == 0) && (i % 13 == 0) && (i % 12 == 0) && (i % 11 == 0)) {
					System.out.println(i); 
					break; 
			}
			i += 20;
		}
	}
}
