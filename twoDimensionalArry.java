import java.util.Scanner;


public class twoDimensionalArry {

	public static void main (String args[])
	{
		int a[][] = new int [2] [2];
		int i,j;
		
		System.out.println("Enter 4 elements for matrix...");
		Scanner sc = new Scanner (System.in);
		
		for (i=0; i < 2; ++i)
			for (j=0; j < 2; ++j)
			{
				a[i][j] = sc.nextInt();	
			}
		
		//Display the matrix.
		for (i=0; i < 2; ++i)
		{
			for (j=0; j < 2; ++j)
			{
				System.out.print (a[i][j] + " ");	
			}
			System.out.println();
		}


	}

}
