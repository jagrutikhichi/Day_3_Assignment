package com.bridgelab;

public class equalMethod {
	public static void check(int x1, int x2, int y1, int y2, int p1, int p2, int q1, int q2) { // Segment of line 1 is
																								// stored as a1

		int a1 = (y2 - y1) * p1 + (x1 - x2) * q1 + (x2 * y1 - x1 * y2);

		if (a1 < 0) {
// Segment of line 2 is stored as a2
			int a2 = (y2 - y1) * p2 + (x1 - x2) * q2 + (x2 * y1 - x1 * y2);

			if (a2 >= 0)
				System.out.println("Intersecting");

			else if (a2 < 0)
				System.out.println("Not intersecting");
		}

		else if (a1 > 0) {

			int a2 = (y2 - y1) * p2 + (x1 - x2) * q2 + (x2 * y1 - x1 * y2);

			if (a2 <= 0)
				System.out.println("Intersecting");

			else if (a2 > 0)
				System.out.println("Not intersecting");
		}

// lines are coincinding
		else
			System.out.println("points are lying on the line");
	}

// Driver Code
	public static void main(String args[]) {
// Taking the coordinates of first line as input
		int x1 = 4, y1 = 3;
		int x2 = 6, y2 = 5;

// Equation of line using slop point form
		System.out.println("Equation 1: (" + (y2 - y1) + ")x+(" + (x1 - x2) + ")y+(" + (x2 * y1 - x1 * y2) + ") = 0");

// Taking the coordinates of second line as input
		int p1 = 4, q1 = 3;
		int p2 = 6, q2 = 5;

// Equation of line using slop point form
		System.out.println("Equation 2: (" + (q2 - q1) + ")x+(" + (p1 - p2) + ")y+(" + (p2 * q1 - p1 * q2) + ") = 0");

		check(x1, x2, y1, y2, p1, p2, q1, q2);
	}

}
