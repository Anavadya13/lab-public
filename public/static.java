import java.util.Scanner;
class patient
{
	int IDno;
	int age;
	String BloodData;

	patient()
	{
		this.IDno=0;
		this.age=0;
		this.BloodData="0";
	}	
	patient(int IDno,int age,String BloodData)
	{
		
		this.IDno=IDno;
		this.age=age;
		this.BloodData=BloodData;
	}
	public int getIDno()
	{
		return IDno;
	}
	public int getage()
	{
		return age;
	}
	public String getBloodData()
	{
		return BloodData;
	}
}

class TestPatient
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		patient p1=new patient();
		
		System.out.println("Patient 1");
		System.out.println("ID:"+ p1.getIDno());
		System.out.println("Age:"+p1.getage());
		System.out.println("Blood Data:"+p1.getBloodData());
		
		System.out.print("Enter Blooddata:");
		String b2=sc.nextLine();
		System.out.print("Enter ID:");
		int id2=sc.nextInt();
		System.out.print("Enter Age:");
		int age2=sc.nextInt();
		
		patient p2=new patient(id2,age2,b2);
		System.out.println("Patient 2");
		System.out.println("ID:"+ p2.getIDno());
		System.out.println("Age:"+p2.getage());
		System.out.println("Blood Data:"+p2.getBloodData());
		
	}
}

