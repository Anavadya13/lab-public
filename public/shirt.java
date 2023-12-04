import java.util.*;
class testshirt
{
	String csize;
	String slen;
	String material="cotton";
	testshirt(String a,String b)
{
	csize=a;
	slen=b;
	System.out.println("the collar size is "+a+"\nthe sleeve length is "+b+"\n material is cotton");
}
}
class shirt
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the collar size ,sleeve length for the 1st person");
		String c=ob.nextLine();
		String d=ob.nextLine();
		System.out.println("Enter the collar size ,sleeve length for the 2nd person");
		String e=ob.nextLine();
		String f=ob.nextLine();
		System.out.println("Enter the collar size ,sleeve length for the 3rd person");
		String g=ob.nextLine();
		String h=ob.nextLine();
		shirt a=new shirt(c,d);
		shirt b=new shirt(e,f);
		shirt i=new shirt(g,h);
	}
}

