import java.util.*;
class sortstring
{	
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF ARRAY");
		int n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("ENTER ELEMENTS");
		for (int i=0;i<n;i++)
		{	
			s[i]=sc.nextLine();
		}
		for(int i=0;i<n-1;i++)
		{	
			for(int j=0;j<n-i-1;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]= temp;
				}
			}
		}
		System.out.println("THE SORTED STRING IS");
		for (int i=0;i<n;i++)
		{	
			System.out.println(s[i]);
		}
	}
}
					
			
