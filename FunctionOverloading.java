public class FunctionOverloading {
	static int square (int x)
	{
		return x * x;
	}
	static double square (double x){
		return x * x;
	}
	public static void main (String args[])
	{
		int y = FunctionOverloading.square(10);
		double z = FunctionOverloading.square (12.12);
		System.out.println("Square of 10 is " + y);
		System.out.println("Square of 12.12 is " + z);		
	}
}
