import java.util.*;
import java.lang.*;
import java.io.*;
class even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num<0)
		  System.out.print("Invald input");
		else if(num%2==0)
		  System.out.print("Even number");
		else
		  System.out.print("Odd number");
	}
}
