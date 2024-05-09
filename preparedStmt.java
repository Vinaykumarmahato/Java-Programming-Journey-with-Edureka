 


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
 
public class preparedStmt {
 
    public static void main(String[] args) throws ClassNotFoundException {
         
        Connection con = null;
        PreparedStatement ps = null;
        String query = "insert into emp (name, sal) values (?,?)";
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
         
              con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","pwd");
            System.out.println("Connected to the database");
        	
              
            ps = con.prepareStatement(query);
             
            String name1 = "Charan";
            String name2="Charan Kumar"; //longer than column length
            String name3="Kumar";
             
            ps.setInt(2, 1000);
            ps.setString(1, name1);
            ps.addBatch();
             
            ps.setInt(2, 2000);
            ps.setString(1, name2);
            ps.addBatch();
             
            ps.setInt(2, 3000);
            ps.setString(1, name3);
            ps.addBatch();
             
            int[] results = ps.executeBatch();
             
            System.out.println(Arrays.toString(results));
             
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
 
}