package trushali1;
import java.util.*;
public class permutation 
{

			// generate all permutations of a String in Java
		public static void main(String[] args)
		{
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Enter the string:");
			String s=sc.nextLine();
			System.out.println("Permutations are:");
			utility.permutations(s.toCharArray(), 0);
			
			
			
		}		
	
}





