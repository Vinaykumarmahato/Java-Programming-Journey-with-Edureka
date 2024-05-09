
import java.sql.*;
public class insert1 {

	public static void main(String arg[])throws Exception
	{   
    	Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded...");
     
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","charan");
        System.out.println("Connected to the database");

		Statement stmt=con.createStatement();
		ResultSet rst=stmt.executeQuery("select * from student");
		System.out.println("No   Name");
		while(rst.next())
		{
			try
			{
				System.out.print(rst.getString(1));
				System.out.print(" "+rst.getString(2));			  
			}
			catch (Exception e)
			{
				System.out.println("Exception : "+e);
			}
			System.out.println("");
		}           
	}      
}
