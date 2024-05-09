
public final class final_demo {
	final int x = 20;
	
	final void testFunction()
	{
		System.out.println("In the final method...");
	}
	
	public static void main (String args[])
	{
		final_demo f1 = new final_demo();
		f1.testFunction();
	}
}
