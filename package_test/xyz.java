package package_test;

import java.util.Scanner;

import test.test_class;

public class xyz {

	public static void main(String[] args) 
	{
		    test_class t1 = new test_class();
		 
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter two numbers");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int result_add = t1.add(x, y);
			int result_multiply = t1.mul(x, y);
		 
			System.out.println("Added result is "+result_add);
			System.out.println("Multiplied value is "+result_multiply);
			 
	}

}
