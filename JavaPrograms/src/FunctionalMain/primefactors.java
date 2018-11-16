package trushali1;
import java.util.*;
public class primefactors 
{
			   public static void main(String args[])
			   {
			      int n;
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Enter a number :");
			      n = sc.nextInt();
			      System.out.println("The prime factors are:");
			      utility.primefactor(n);
			   }
}
