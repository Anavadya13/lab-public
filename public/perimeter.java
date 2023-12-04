import java.util.*;

class Rectangle 
{
    
    	int length, width;
	Rectangle()
	{
		length = 0;
		width = 0;
	}

    	Rectangle(int length, int width)
	{
        	this.length = length;
        	this.width = width;
   	}
 
    	public int perimeter() {
        	int  perimeterOfRectangle;
        	perimeterOfRectangle = 2 * (this.length + this.width);
        	return perimeterOfRectangle;
   	 }
}
public class perimeter
{
    public static void main(String args[])
{
	Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10,5); 
        System.out.println("Perimeter of rectangle 1 = " + rect1.perimeter());
        System.out.println("Perimeter of rectangle 2 = " + rect2.perimeter());
    }
}
