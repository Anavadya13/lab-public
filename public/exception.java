import java.util.*;
class exception
{
     public static void main (String[] args) throws ArithmeticException
     {
        Scanner sc= new Scanner(System.in);
        try
        {
            System.out.println("Program to perform division");
            System.out.print("Enter no.1:");
            int a=sc.nextInt();
            System.out.print("Enter no.2:");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Result="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("EXCEPTION OCCURED");
        }
        finally
        {
            System.out.println("END");
        }
    }
}


