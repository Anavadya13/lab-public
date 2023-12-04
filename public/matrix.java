import java.util.Scanner;
class matrix
{
	public static void main(String args[])
	{
		Scanner myObj=new Scanner(System.in);
		System.out.println("enter number of rows and columns of first matrix");
		int r1=myObj.nextInt();
		int c1=myObj.nextInt();
		System.out.println("enter number of rows and columns of second matrix");
		int r2=myObj.nextInt();
		int c2=myObj.nextInt();
		//int a[r1][c1],b[r2][c2],c[20][20];
		int[][] a = new int[r1][c1];
		int[][] b = new int[r2][c2];
		int[][] c = new int[r1][c2];		
		int i,j,k;
		for (i=0;i<r1;i++)
		{	for (j=0;j<c1;j++)
			{	System.out.println("enter elements");
				a[i][j]=myObj.nextInt();
			}
		}
		for (i=0;i<r2;i++)
		{	for (j=0;j<c2;j++)
			{	System.out.println("enter elements");
				b[i][j]=myObj.nextInt();
			}
		}
 		if(c1==r2)
		{	for (i=0;i<r1;i++)
			{	for (j=0;j<c2;j++)
				{	c[i][j]=0;
					for(k=0;k<c1;k++)
					{	c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
				}
			}
		}
		for (i=0;i<r1;i++)
			{	for (j=0;j<c2;j++)
				{	System.out.print(c[i][j]+" ");
				}
}

	}
}			
		

