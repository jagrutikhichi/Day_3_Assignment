package com.bridgelab;

public class endPoints {
	public static void main(String args[]) {
		int x1 = 2, y1 = 3;
        int x2 = 6, y2 = 4;
        
        int p1 = 3, q1 = 4;
        int p2 = 7, q2 = 1;
        
		int a1 = (y2 - y1) * p1 + (x1 - x2) * q1 + (x2 * y1 - x1 * y2);
		int a2 = (y2 - y1) * p2 + (x1 - x2) * q2 + (x2 * y1 - x1 * y2);
		
		if (a1 < a2) {
			System.out.println("The A1 is less then A2");
		}
		else if (a1 > a2) {
			System.out.println("The A2 is less then A1");
			
		}
		else {
			System.out.println("The A1 is equal then A2");
		}

	}

}
