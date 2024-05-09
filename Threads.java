import java.util.Scanner;

  
public class Threads extends Thread {
	Threads()
	{		
		//System.out.println("Invoking the another thread..");
		start();		
	}
	
	public void run()
	{
		try
		{
 
			
			int i;
			for (i = 1; i <= 10; ++i)
				System.out.println(5 + " * " + i + " = "+i * 5);
		}
		catch (Exception ex)
		{
			System.out.println("Exception is : "+ex);
		}
	}

	//main function.
	public static void main (String args[])
	{		
		new Threads();
		
		
		try
		{
			
			Thread.sleep(1000);
			
			//System.out.println("Starting the main thread...");
			for (int i = 0; i <= 40; i += 2)
			{
				
				System.out.println("");
				System.out.println("Main Thread " +i);
				Thread.sleep(500);
			}
		}
		catch (Exception ex)
		{
			System.out.println("Exception is : "+ex);
		}

	}


}
