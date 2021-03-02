package ua.lviv.lgs;

import java.util.Iterator;

public class hw {
     public static void main(String[] args) {
		
    	byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4l;
		
		double e = 2.2;
		float f = 1.2f;
		
		boolean g = true;
		boolean h = false;
		
		char i = 'i';
		
		System.out.println("byte min = " + Byte.MIN_VALUE);
		System.out.println("byte max = " + Byte.MAX_VALUE);
		
		System.out.println("short min = " + Short.MIN_VALUE);
		System.out.println("short max = " + Short.MAX_VALUE);
		
		System.out.println("Integer min = " + Integer.MIN_VALUE);
		System.out.println("Integer max = " + Integer.MAX_VALUE);
		
		System.out.println("Long min = " + Long.MIN_VALUE);
		System.out.println("Long max = " + Long.MAX_VALUE);
		
		System.out.println("Float min = " + Float.MIN_VALUE);
		System.out.println("Float max = " + Float.MAX_VALUE);
		
		System.out.println("Double min = " + Double.MIN_VALUE);
		System.out.println("Double max = " + Double.MAX_VALUE);
		
		System.out.println("Char max = " + Character.MAX_VALUE);
		
		System.out.println("Boolean min = " + Boolean.FALSE);
		System.out.println("Boolean max = " + Boolean.TRUE);
		
		int [] array = {24, 3560, -152, 15, 32, 456, -456, 8404, -7, 150};
		int min = 0;
		int max = array[1];

		for (int y = 0; y < array.length; y++) {
			if (array[y] < min) { 
				min = array[y];
			}
		}

		System.out.println("array min = " + min);

		for (int y = 0; y < array.length; y++) {
			if (array[y] > max) {  
				max = array[y];
			}
		}	

		System.out.println("array max = " + max);

	}
}
