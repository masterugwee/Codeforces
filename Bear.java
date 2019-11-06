package com.Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Bear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
 String s = scan.nextLine();
 int[] numbers = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();  
 int count = 0;
 //int a[];
 //a[0] = Integer.valueOf(s.)
 //int a = Integer.valueOf(s.indexOf(0));
 //int b = Integer.valueOf(s.indexOf(2));
 //System.out.println(numbers[0]+" "+numbers[1]);
     while(numbers[0]<=numbers[1])
     {
    	 numbers[0] = numbers[0]*3;
    	 numbers[1] = numbers[1]*2;
    	 count++;
     }
     System.out.println(count);
	}

}
