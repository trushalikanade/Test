package trushali1;
import java.util.*;
import java.io.*;

public class array 
{

public static void main(String[] args)throws IOException
{   

 
		PrintWriter pw = new PrintWriter(System.out,true);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of array");
	    int rows = sc.nextInt();
		
		System.out.println("Enter the columns of array");
	    int columns = sc.nextInt();
	    
		int a[][] = new int[rows][columns];
		pw.println("Enter elements of  matrix");
			
		utility.array(rows, columns, a);
 }

}



