import java.util.*;
class reverse
{	
	public static void main(String[] args)
	{	
		String b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String s=sc.nextLine();
		int n=s.length();
		for(int i=n-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println("THE REVERSED STRING IS "+b);
	}
}
