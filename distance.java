package com.bridgelab;

public class distance {

	public static void main(String arg[]) {
		int x1, x2, y1, y2;
		double dis;
		x1 = 1;
		y1 = 1;
		x2 = 4;
		y2 = 4;
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis);
		
		int a1, a2, b1, b2;
		double dis2;
		a1 = 1;
		b1 = 1;
		a2 = 4;
		b2 = 4;
		dis2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("distancebetween" + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ")===>" + dis2);
		int s1 = (int)dis;
		int s2 = (int)dis2;
		System.out.println(s1 == s2);
		
	}

}
