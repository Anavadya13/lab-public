import java.util.*;
class palindrome
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
		if(s.equalsIgnoreCase(b))
		{
			System.out.println("THE GIVEN STRING IS PALINDROME");
		}
	}
}
