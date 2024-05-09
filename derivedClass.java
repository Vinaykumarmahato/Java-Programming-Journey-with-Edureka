

class baseClass
{	
	int x=220;	
	public void displayX() {System.out.println("Value of x : "+x);}	
}
public class derivedClass extends baseClass
{
	public static void main (String args[])
	{
		derivedClass d1 = new derivedClass();
		d1.displayX();
	}
}