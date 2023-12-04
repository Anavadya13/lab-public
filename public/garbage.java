import java.io.*;

public class garbage
{
	public static void main(String args[])
	{
		System.out.println();
		garbage obj=new  garbage();
		obj=null;
		garbage obj1=new garbage();
		garbage obj2=new garbage();
		obj1=obj2;
		System.gc();
	}
	protected void finalize()
	{
		System.out.println("GARBAGE IS COLLECTED");
	}
}
