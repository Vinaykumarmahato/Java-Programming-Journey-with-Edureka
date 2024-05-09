
import java.io.*;
import java.util.Scanner;


public class FileReadDemo 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("c:\\data files\\file.txt");
		FileInputStream fis = null;		 
		try {
			fis = new FileInputStream(file);			 
			int input;
			while ((input = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) input);				
			}	
		} catch (IOException e) {
			e.printStackTrace();
		} 
		 fis.close();
		 }
	}