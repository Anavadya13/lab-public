import java.util.*;

public class vblength
{
	static void Area(float... args)
	{
		if(args.length==1)
			System.out.println("THE AREA OF CIRCLE IS "+3.14*args[0]*args[0]);
		else if(args.length==2)
			System.out.println("THE AREA OF RECTANGLE IS "+args[0]*args[1]);
		else if(args.length==3)
			System.out.println("THE AREA OF RECTANGLE IS "+args[0]*args[1]*args[2]); 
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("1.AREA OF CIRCLE");
		System.out.println("2.AREA OF RECTANGLE");
		System.out.println("3.AREA OF TRIANGLE");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("ENTER RADIUS");
				float r=sc.nextFloat();
				Area(r);
				break;
			case 2:
				System.out.println("ENTER LENGTH AND BREADTH");
				float l=sc.nextFloat();
				float b=sc.nextFloat();
				Area(l,b);
				break;
			case 3:
				
				System.out.println("ENTER BREADTH AND HEIGHT");
				float ba=sc.nextFloat();
				float h=sc.nextFloat();
				Area(0.5f,h,ba);
				break;
		}
	}
}
