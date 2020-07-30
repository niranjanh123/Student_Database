package student_assist_database2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
   protected static Connection intializeDatabase()throws SQLException,ClassNotFoundException {
	   Connection con=null;
	   Class.forName("com.mysql.jdbc.Driver");
		  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
				  con= DriverManager.getConnection(dbur);
	return con;
	   
   }
}
