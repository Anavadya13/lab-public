import java.util.*;
public class fibo
{
	static int fibonacci(int n)
	{
		if (n==0)
			 return 1;
		else if (n==1)
			 return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	} 
	public static void main(String args[])
	{
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO UPTO WHERE YOU HAVE TO FIND FIBONACCI");
		int n= sc.nextInt();
		System.out.println("0\n");
		while(fibonacci(i)<=n)
		{
			System.out.println(fibonacci(i));
			System.out.print("\n");
			i++;
		}
	}
}
			
