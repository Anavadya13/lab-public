import java.util.*;
class areas
{
	void area(int l, int b)
	{
		System.out.println("THE AREA OF RECTANGLE IS "+ l*b);
	}
	void area(int r)
	{
		System.out.println("THE AREA OF CIRCLE IS "+ 3.14*r*r);
	}
	void area(float ba,float  h)
	{
		System.out.println("THE AREA OF TRIANGLE IS "+ 0.5*ba*h);
	}
}
public class area
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.RECTANGLE");
		System.out.println("2.CIRCLE");
		System.out.println("3.TRIANGLE");
		int ch=sc.nextInt();
		areas a1= new areas();
		areas a2= new areas();
		areas a3= new areas();
		switch(ch)
		{
			case 1 :
				System.out.println("enter the length and breadth of rectangle");
				int l=sc.nextInt();
				int b=sc.nextInt();
				a1.area(l,b);
				break;
			case 2:
				System.out.println("enter the radius of circle");
				int r=sc.nextInt();
				a2.area(r);
				break;
			case 3:
				System.out.println("enter the base and height of triangle");
				float ba=sc.nextFloat();
				float h=sc.nextFloat();
				a3.area(ba,h);
				break;
		}
	}	
}

