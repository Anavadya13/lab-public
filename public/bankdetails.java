import java.util.*;
class bankacc
{
	int acc_no,balance;
	String acc_name,type;
	Scanner sc=new Scanner(System.in);
	public void initialize()
	{
		System.out.println("enter account holder name");
		acc_name=sc.nextLine();
		System.out.println("enter account number");
		acc_no=sc.nextInt();
		sc.nextLine();
		System.out.println("enter account type");
		type=sc.nextLine();
		System.out.println("enter balance amount");
		balance=sc.nextInt();
		System.out.println(acc_name);
	}
	public void deposit()
	{
		System.out.println("amount to deposit");
		int amount=sc.nextInt();
		balance=balance+amount;
		System.out.println("BALANCE OF"+acc_name+"is"+balance);
	}
	public void withdraw()
	{
		System.out.println("amount to withdraw");
		int amount=sc.nextInt();
		if (amount>balance)
			System.out.println("INSUFFICIENT BALANCE");
		else
			balance-=amount;
		System.out.println("BALANCE OF"+acc_name+"is"+balance);
	}
	public void printbalance()
	{
		System.out.println("BALANCE OF"+acc_name+"is"+balance);
	}
}
public class bankdetails
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		boolean inloop=true;
		bankacc acc=new bankacc();
		while(inloop){
			System.out.println("1.INITIALISE");
			System.out.println("2.DEPOSIT");
			System.out.println("3.WITHDRAW");
			System.out.println("4.RETURN BALANCE");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
		
			switch(ch)
				{
				case 1:
					acc.initialize();
					break;
				case 2:
					acc.deposit();
					break;
				case 3:
					acc.withdraw();
					break;
				case 4:
					acc.printbalance();
					break;
				case 5:
					inloop=false;
					break;
				default:
					System.out.println("INVALID OPTION");
					break;
				}
			}
	}
}
		
		
		
		
		
		

