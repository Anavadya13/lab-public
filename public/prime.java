import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner myobj=new Scanner(System.in);
		System.out.println("enter the number to check");
		int n=myobj. nextInt();
		int i,flag=-1;
		for(i=2;i<n;i++)
		{	if (n%i==0)
				flag++;
		}
		if (flag==-1)
			System.out.println("NUMBER IS PRIME");
		else
			System.out.println("NUMBER IS NOT PRIME");

	}
}
