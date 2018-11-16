package trushali1;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input values for a,b and c:");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		double c= sc.nextDouble();
		utility.quadratic(a, b, c);
	}

}

