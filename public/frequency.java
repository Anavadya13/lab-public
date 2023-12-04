import java.util.*;
class frequency
{	
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String s=sc.nextLine();
		System.out.println("ENTER CHARACTER TO SEARCH");
		char ch=sc.next().charAt(0);
		int frequency=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
				++frequency;
		}
		System.out.println("FREQUENCY OF"+ch+"="+frequency);
	}
}
