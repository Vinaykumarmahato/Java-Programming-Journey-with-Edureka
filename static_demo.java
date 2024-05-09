
public class static_demo {	
	static int x = 230;	
	public static void DisplayMessage() {System.out.println("In the static function...");}
	static
	{
		System.out.println("In the static block...");
	}
	public static void main (String args[])
	{		
		System.out.println("Value of static variable : " +static_demo.x);
		static_demo.DisplayMessage();		
	}}