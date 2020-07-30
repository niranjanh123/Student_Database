package student_assist_database2;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
public class Bloodlistchecker {
	 public static List<Studentblood> stlist;
	 public static void bloodcheck(String blood)
	 { Connection con=null;
	   Statement stmt=null;
	   ResultSet resultSet=null;
//	   List<Studentblood> stlist = new ArrayList<Studentblood>();
       if(blood.equals("1"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='O+' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
//								  stlist.add(new Studentblood(empid,empbranch,empname,empsem,empsec,empgender,empho));
//								  System.out.println(stlist.get(0).getEmpid());
							   }
							  
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }
       else if(blood.equals("2"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='O+' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
//								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
//								  stlist.add(bl);
								  System.out.println(bl.getEmpname());
							  }
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }
       
       else if(blood.equals("3"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='A-' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
								  stlist.add(bl);
							      
							  }
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }
       
       else if(blood.equals("4"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='A+' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
//								  stlist.add(bl);
								  System.out.println(bl.getEmpname());
							      
							  }
							  
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }
       
       else if(blood.equals("5"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='B-' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
								  stlist.add(bl);
							      
							  }
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }
       
       else if(blood.equals("6"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='B+' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
								  stlist.add(bl);
							      
							  }
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }
       
       else if(blood.equals("7"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='AB-' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
								  stlist.add(bl);
							      
							  }
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }
       
       else if(blood.equals("8"))
       {   
    	   try {
				  //1.Load the driver
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
					  String dbur = "jdbc:mysql://localhost:3306/student_assist?user=root&password=admin";
							  con= DriverManager.getConnection(dbur);
							  String query="SELECT * FROM student s,blood_finder b" +
					                   " WHERE b.blood_group='AB+' and s.USN=b.USN";
							
							  stmt=con.createStatement();
							  resultSet = stmt.executeQuery(query);
							  while(resultSet.next())
							  {
								  String empid= resultSet.getString("USN");
								  String empbranch= resultSet.getString("dpt_name");
								  String empname=resultSet.getString("name");
								  String empsem=resultSet.getString("sem");
								  String empsec= resultSet.getString("sec");
								  String empgender= resultSet.getString("gender");
								  String empho= resultSet.getString("phone no");
								  System.out.println("empid"+empid);
								  Studentblood bl= new Studentblood();
								  bl.setEmpid(empid);
								  bl.setEmpbranc(empbranch);
								  bl.setEmpname(empname);
								  bl.setEmpsem(empsem);
								  bl.setEmpsec(empsec);
								  bl.setEmpgender(empgender);
								  bl.setEmpho(empho);
								  stlist.add(bl);
							      
							  }
							    
							  
				  }catch(ClassNotFoundException e) 
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
				      if(stmt!=null)
					      stmt.close();
					  if(resultSet!=null)
						  resultSet.close();
				  }
				  catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
			  }
       }

	
	
	 }
}
					