package student_assist_database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class validate {
	   public static boolean checkuser(String USN,String password) {
		
		   String usn1;
		   String pass1;
		      Connection con=null;
//			  Statement stmt=null;
			  ResultSet resultSet=null;
			  try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="select * from login where USN=? and password=?";
							  PreparedStatement ps=con.prepareStatement(query);
						       ps.setString(1, USN);
 					          ps.setString(2, password);
							  resultSet=ps.executeQuery();
//		                      st=resultSet.next();
							  while(resultSet.next())
							  {
								   usn1=resultSet.getString("USN");
								   pass1=resultSet.getString("password");
								   if(USN.equals(usn1)&&password.equals(pass1))
									  {
										  return true;
									  }
								
							  }
						
				  }
				  catch(ClassNotFoundException e) 
				  {
					  e.printStackTrace();
				  }
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }
			  }catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			
			  finally {
				  try {
					  if(con!=null)
						  con.close();
//					  if(stmt!=null)
//						  stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
				 return false;
	   }
	}
								  