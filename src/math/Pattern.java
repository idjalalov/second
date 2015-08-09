package math;

import java.util.ArrayList;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32
		 * 
		 */
		
		int num1 = 101;
		int num2 = 90;
		int num3 = 70;
		int num4 = 40;
	
		
		while (num1>90){
			num1=num1-1;
		System.out.print(num1+",");
		}
		
		while (num2>70){
			num2=num2-2;
		System.out.print(num2+",");
		}
		
		while (num3>40){
			num3=num3-3;
		System.out.print(num3+",");
		}
		
		while (num4>32){
			num4=num4-4;
		System.out.print(num4+",");
		}
	}
}
		        


		
       
       