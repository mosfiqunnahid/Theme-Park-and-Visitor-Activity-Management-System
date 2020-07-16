
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQLConnect {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    
     public static Connection getConnection()
   {
       Connection con;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/theme_park", "root","root");
           return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
    
}
