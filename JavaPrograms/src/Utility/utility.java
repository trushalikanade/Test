package trushali1;

import java.io.PrintWriter;
import java.util.Scanner;

public class utility 
{
//	*********************************1.String****************************************************************//	
public static void string(String username)
 {
	String str1 = "Hello "  +username+ ",How are you?";
    String str2= "trushali kanade";
	if(username.length()<3)
    {
        System.out.println("Ensure username has min 3 char");
    }
   else
   {
     String str3 = str1.replaceAll(username,str2);
     System.out.println(str3);
   }
}
 
//************************2.Flipcoin*********************************************************************//
public static void coin(int flips)
{
	int heads=0;
    int tails=0;
    
double a[]= new double[flips];
if(flips<0)
{
    System.out.println("Ensure it is positive integer");
}
else
{
  
   for(int i=0; i<flips;i++)
   {
       a[i]= Math.random();
       
   }
   for(int i=0; i<flips;i++)
   {
       System.out.println(a[i]);
       
   }
   for(int i=0; i<flips;i++)
   {
   if(a[i]<0.5)
   {
       System.out.println("tails");
       tails++;
   }
   else
   {
       System.out.println("heads");
       heads++;
   }
   }
}
System.out.println("count of tails is " +tails);
System.out.println("count of heads is " +heads);
float pertails = (float)(tails*100)/flips;
float perheads = (float)(heads*100)/flips;
System.out.println(pertails);
System.out.println(perheads);
}

//************************3.Leapyear*********************************************************************//
public static void leapyear(int year)
{
	 if(year<4)
     {
         System.out.println("ivalid entry");
     }
     else
     {
          if(year%4==0 || year%100==0 || year%400==0)
         	{
        	 	System.out.println("leap year");
         	}
       	  else
       		{
       			System.out.println("not a leap year");
	        }
     }
}
//************************4.Power of 2*********************************************************************//
public static void table(int n)
{
	if(n>=31)
    {
        System.out.println("invalid input");
    }
    else
    {
        
        for(int i=0; i<=n;i++)
        {
            System.out.println(i+ "*"+2+ "="+(i*2));
        }
    }
}



//	*********************************5.Gambler****************************************************************//
	public static void gambler(int stake, int goal, int trials)
	{
		int wins=0;
		int loss=0;
		  for (int t = 0; t <trials; t++) 
		     {
	             int cash = stake;
		            while(cash > 0 && cash <goal) 
		            {
		                if (Math.random()< 0.5)
		                cash++;    
		                
		                else 
		                cash--;  
		            }
		            if (cash == goal)
	                {    
	                  wins++;
	                }
	                else
	                {
	               	 loss++;
	                }
		     }
		     System.out.println(wins + " wins of " + trials);
		     double won=(wins*100)/trials;
		     System.out.println("Percent of games wons = "+won);
		     
		     System.out.println(loss + " loss of " + trials);
		     double los=(loss*100)/ trials;
		     System.out.println("Percent of games loss= "+los);
	
	}
//************************6.Factors*********************************************************************//	
public static void primefactor(int n) 
{
	
    for(int i = 2; i< n; i++) 
    {
       while(n%i == 0) 
       {
          System.out.println(i);
          n = n/i;
       }
    }
    if(n>2) 
    {
       System.out.println(n);
    }
}	
	
//************************7.Harmonic*********************************************************************//
public static void harmonic(int n)
{
	double sum = 0.0;
    for (int i = 1; i <= n; i++) 
    {
        sum += 0.1/ i;
    }

   
    System.out.println(sum);
}

//************************8.2DArray*********************************************************************//
	
public static void array(int rows, int columns, int a[][])	
{
	Scanner sc = new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out,true);
	
	
	for(int m=0;m<rows;m++)
	{
		for(int n=0;n<columns;n++)
		{
			a[m][n] = sc.nextInt();
		
		}
		pw.println(" ");
	}
	pw.println("Elements are:");
	for(int m=0;m<rows;m++)
	{
		for(int n=0;n<columns;n++)
		{
		  pw.print(a[m][n]);
		}
		 pw.println(" ");
	}
	
}
//************************10.triplets*********************************************************************//
public static void triplets(int n,int a[])
{
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("distict triplets are:");
	for(int i=0;i<n-2;i++)
	{
		for(int j=i+1;j<n-1;j++)
		{
			for(int k=i+2; k<n;k++)
			{
				if(a[i]+a[j]+a[k]==0)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			
			}
		}
	}
}
	
//************************11.Euclidean*********************************************************************//	
	
public static void Euclidean(int x, int y)
{
	double distance= Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)); 
	System.out.println("The Euclidean Distance is:"+distance);

    
}

//************************12.Permutation*********************************************************************//
public static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	public static void permutations(char[] ch, int CI)
	{
		if (CI == ch.length - 1) 
		{
			//System.out.println(String.valueOf(ch));
			System.out.println(ch);
		}
	    else
	    {
		    for (int i = CI; i < ch.length; i++)
		        {
		        	swap(ch, CI, i);
			        permutations(ch, CI + 1);
			        swap(ch, CI, i);
		        }
		}
	


}	
	
//************************13.Stopwatch*********************************************************************//
	
public static void stopwatch(long start,long stop)
{
	long elapsedTime;
	Scanner sc= new Scanner(System.in);
	System.out.println("Press 1 to start:");
    start=sc.nextLong();
	if(start==1)
	{
		start=System.currentTimeMillis();
		System.out.println(start);
	}
	
	System.out.println("Press 2 to stop:");
    stop=sc.nextLong();
	if(stop==2)
	{
		stop=System.currentTimeMillis();
		System.out.println(stop);
	}
	
	elapsedTime=(stop-start);
	System.out.println("The elapsed time is:"+elapsedTime);
	double timeinsec =(elapsedTime*60)/1000;
	System.out.println("The elapsed time in sec is:"+timeinsec);
}
//************************14.Quadratic*********************************************************************//
	
	
public static void quadratic(double a,double b,double c)
{
	double delta=((b*b)-(4*a*c));
	System.out.println(delta);
	
	
	double root1 = (-b+Math.sqrt(delta))/(2*a);
	double root2 = (-b-Math.sqrt(delta))/(2*a);

	System.out.println("The root1 and root2 are:"+root1+" "+root2);

}

//************************15.Windchill*********************************************************************//

public static void windchill(double t, double v) 
{
	 double w = ((35.74 + 0.6215*t )+ (0.4275*t - 35.75) )* Math.pow(v, 0.16);
     System.out.println("Temperature = " + t);
     System.out.println("Wind speed  = " + v);
     System.out.println("Wind chill  = " + w);

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
