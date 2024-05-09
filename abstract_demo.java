
abstract   class abstract1 {
	abstract   void test();
}
public class abstract_demo extends abstract1
{	 
	void   test() { System.out.println("in the test...");}
	public static void main (String arg[])
	{
		abstract_demo a1 = new abstract_demo();
		a1.test();		
	}	
}