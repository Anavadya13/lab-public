import java.util.Scanner;
class binarysearch
{
  int binarySearch(int array[], int element, int low, int high) {

   
    while (low <= high)
    {

     
      int mid = low + (high - low) / 2;

     
      if (array[mid] == element)
        return mid;

     
      if (array[mid] < element)
        low = mid + 1;

     
      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[])
  {

   
    binarysearch obj = new binarysearch();

   
   
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int[] array=new int[30];
    System.out.println("enter elements");
    for(int i=0;i<n;i++)
    {
    array[i]=sc.nextInt();
    }
    System.out.println("elements are");
    for(int i=0;i<n;i++)
    {
    System.out.println(array[i]);
    }

   
    Scanner input = new Scanner(System.in);

    System.out.println("Enter element to be searched:");

   
    int element = input.nextInt();
    input.close();

   
    int result = obj.binarySearch(array, element, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}


