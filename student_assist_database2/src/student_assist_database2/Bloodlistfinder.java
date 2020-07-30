package student_assist_database2;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Bloodlistfinder extends HttpServlet{
	   Statement stmt=null;
	   ResultSet resultSet=null;
	   Connection con;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println("Reached here");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		 PrintWriter out=res.getWriter();
		 String a="";
	     a=req.getParameter("Choose").toString();
	     if(a.equals("1"))
	       {   
	    	try {
	    	con=DatabaseConnection.intializeDatabase();
	    	String query="SELECT * FROM student s,blood_finder b" +
	                   " WHERE b.blood_group='O+' and s.USN=b.USN";
			  stmt=con.createStatement();
			  resultSet = stmt.executeQuery(query);
			  out.println("<html><body><b>"+"<table border=\"1\">"+
					   "<caption>BLOOD LIST</caption>"+
					   "<tr>"+
					    "<th scope='col' width='100px'>ID</th>"+
					    "<th scope='col' width='100px'>NAME</th>"+
					    "<th scope='col' width='100px'>BRANCH</th>"+
					    "<th scope='col' width='100px'>SEM</th>"+
					    "<th scope='col' width='100px'>SEC</th>"+
					    "<th scope='col' width='100px'>GENDER</th>"+
					    "<th scope='col' width='100px'>PHONE NO</th>"+
					  "</tr>"+"</tr>"
					  +"</table></b></body></html>");
			  while(resultSet.next())
			  {
				  String empid= resultSet.getString("USN");
				  String empbranch= resultSet.getString("dpt_name");
				  String empname=resultSet.getString("name");
				  String empsem=resultSet.getString("sem");
				  String empsec= resultSet.getString("sec");
				  String empgender= resultSet.getString("gender");
				  String empho= resultSet.getString("phone no");
				  Studentblood bl= new Studentblood();
				  bl.setEmpid(empid);
				  bl.setEmpbranc(empbranch);
				  bl.setEmpname(empname);
				  bl.setEmpsem(empsem);
				  bl.setEmpsec(empsec);
				  bl.setEmpgender(empgender);
				  bl.setEmpho(empho);
				  out.println("<html><body><b>"+"<table border=\"1\">"+
				  "<tr>"+
				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
				  "</tr>"
				  +"</table></b></body></html>");
		}
		  
	    	}catch(ClassNotFoundException e) 
                {
	             e.printStackTrace();
               }
                catch(Exception e)
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
	    else if(a.equals("2"))
	       {   
	    	try {
	    	con=DatabaseConnection.intializeDatabase();
	    	String query="SELECT * FROM student s,blood_finder b" +
	                   " WHERE b.blood_group='O+' and s.USN=b.USN";
			  stmt=con.createStatement();
			  resultSet = stmt.executeQuery(query);
			  out.println("<html><body><b>"+"<table border=\"1\">"+
					   "<caption>BLOOD LIST</caption>"+
					   "<tr>"+
					    "<th scope='col' width='100px'>ID</th>"+
					    "<th scope='col' width='100px'>NAME</th>"+
					    "<th scope='col' width='100px'>BRANCH</th>"+
					    "<th scope='col' width='100px'>SEM</th>"+
					    "<th scope='col' width='100px'>SEC</th>"+
					    "<th scope='col' width='100px'>GENDER</th>"+
					    "<th scope='col' width='100px'>PHONE NO</th>"+
					  "</tr>"+"</tr>"
					  +"</table></b></body></html>");
			  while(resultSet.next())
			  {
				  String empid= resultSet.getString("USN");
				  String empbranch= resultSet.getString("dpt_name");
				  String empname=resultSet.getString("name");
				  String empsem=resultSet.getString("sem");
				  String empsec= resultSet.getString("sec");
				  String empgender= resultSet.getString("gender");
				  String empho= resultSet.getString("phone no");
				  Studentblood bl= new Studentblood();
				  bl.setEmpid(empid);
				  bl.setEmpbranc(empbranch);
				  bl.setEmpname(empname);
				  bl.setEmpsem(empsem);
				  bl.setEmpsec(empsec);
				  bl.setEmpgender(empgender);
				  bl.setEmpho(empho);
				  out.println("<html><body><b>"+"<table border=\"1\">"+
				  "<tr>"+
				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
				  "</tr>"
				  +"</table></b></body></html>");
		}
		  
	    	}catch(ClassNotFoundException e) 
             {
	             e.printStackTrace();
            }
             catch(Exception e)
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
	    else if(a.equals("3"))
  	       {   
     	    	try {
     	    	con=DatabaseConnection.intializeDatabase();
     	    	String query="SELECT * FROM student s,blood_finder b" +
     	                   " WHERE b.blood_group='A-' and s.USN=b.USN";
     			  stmt=con.createStatement();
     			  resultSet = stmt.executeQuery(query);
     			  out.println("<html><body><b>"+"<table border=\"1\">"+
     					   "<caption>BLOOD LIST</caption>"+
     					   "<tr>"+
     					    "<th scope='col' width='100px'>ID</th>"+
     					    "<th scope='col' width='100px'>NAME</th>"+
     					    "<th scope='col' width='100px'>BRANCH</th>"+
     					    "<th scope='col' width='100px'>SEM</th>"+
     					    "<th scope='col' width='100px'>SEC</th>"+
     					    "<th scope='col' width='100px'>GENDER</th>"+
     					    "<th scope='col' width='100px'>PHONE NO</th>"+
     					  "</tr>"+"</tr>"
     					  +"</table></b></body></html>");
     			  while(resultSet.next())
     			  {
     				  String empid= resultSet.getString("USN");
     				  String empbranch= resultSet.getString("dpt_name");
     				  String empname=resultSet.getString("name");
     				  String empsem=resultSet.getString("sem");
     				  String empsec= resultSet.getString("sec");
     				  String empgender= resultSet.getString("gender");
     				  String empho= resultSet.getString("phone no");
     				  Studentblood bl= new Studentblood();
     				  bl.setEmpid(empid);
     				  bl.setEmpbranc(empbranch);
     				  bl.setEmpname(empname);
     				  bl.setEmpsem(empsem);
     				  bl.setEmpsec(empsec);
     				  bl.setEmpgender(empgender);
     				  bl.setEmpho(empho);
     				  out.println("<html><body><b>"+"<table border=\"1\">"+
     				  "<tr>"+
     				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
     				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
     				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
     				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
     				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
     				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
     				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
     				  "</tr>"
     				  +"</table></b></body></html>");
     		}
     		  
     	    	}catch(ClassNotFoundException e) 
                     {
     	             e.printStackTrace();
                    }
                     catch(Exception e)
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
	    else if(a.equals("4"))
	       {   
	    	try {
	    	con=DatabaseConnection.intializeDatabase();
	    	String query="SELECT * FROM student s,blood_finder b" +
	                   " WHERE b.blood_group='A-' and s.USN=b.USN";
			  stmt=con.createStatement();
			  resultSet = stmt.executeQuery(query);
			  out.println("<html><body><b>"+"<table border=\"1\">"+
					   "<caption>BLOOD LIST</caption>"+
					   "<tr>"+
					    "<th scope='col' width='100px'>ID</th>"+
					    "<th scope='col' width='100px'>NAME</th>"+
					    "<th scope='col' width='100px'>BRANCH</th>"+
					    "<th scope='col' width='100px'>SEM</th>"+
					    "<th scope='col' width='100px'>SEC</th>"+
					    "<th scope='col' width='100px'>GENDER</th>"+
					    "<th scope='col' width='100px'>PHONE NO</th>"+
					  "</tr>"+"</tr>"
					  +"</table></b></body></html>");
			  while(resultSet.next())
			  {
				  String empid= resultSet.getString("USN");
				  String empbranch= resultSet.getString("dpt_name");
				  String empname=resultSet.getString("name");
				  String empsem=resultSet.getString("sem");
				  String empsec= resultSet.getString("sec");
				  String empgender= resultSet.getString("gender");
				  String empho= resultSet.getString("phone no");
				  Studentblood bl= new Studentblood();
				  bl.setEmpid(empid);
				  bl.setEmpbranc(empbranch);
				  bl.setEmpname(empname);
				  bl.setEmpsem(empsem);
				  bl.setEmpsec(empsec);
				  bl.setEmpgender(empgender);
				  bl.setEmpho(empho);
				  out.println("<html><body><b>"+"<table border=\"1\">"+
				  "<tr>"+
				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
				  "</tr>"
				  +"</table></b></body></html>");
		}
		  
	    	}catch(ClassNotFoundException e) 
             {
	             e.printStackTrace();
            }
             catch(Exception e)
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
	    else  if(a.equals("5"))
	       {   
	    	try {
	    	con=DatabaseConnection.intializeDatabase();
	    	String query="SELECT * FROM student s,blood_finder b" +
	                   " WHERE b.blood_group='B-' and s.USN=b.USN";
			  stmt=con.createStatement();
			  resultSet = stmt.executeQuery(query);
			  out.println("<html><body><b>"+"<table border=\"1\">"+
					   "<caption>BLOOD LIST</caption>"+
					   "<tr>"+
					    "<th scope='col' width='100px'>ID</th>"+
					    "<th scope='col' width='100px'>NAME</th>"+
					    "<th scope='col' width='100px'>BRANCH</th>"+
					    "<th scope='col' width='100px'>SEM</th>"+
					    "<th scope='col' width='100px'>SEC</th>"+
					    "<th scope='col' width='100px'>GENDER</th>"+
					    "<th scope='col' width='100px'>PHONE NO</th>"+
					  "</tr>"+"</tr>"
					  +"</table></b></body></html>");
			  while(resultSet.next())
			  {
				  String empid= resultSet.getString("USN");
				  String empbranch= resultSet.getString("dpt_name");
				  String empname=resultSet.getString("name");
				  String empsem=resultSet.getString("sem");
				  String empsec= resultSet.getString("sec");
				  String empgender= resultSet.getString("gender");
				  String empho= resultSet.getString("phone no");
				  Studentblood bl= new Studentblood();
				  bl.setEmpid(empid);
				  bl.setEmpbranc(empbranch);
				  bl.setEmpname(empname);
				  bl.setEmpsem(empsem);
				  bl.setEmpsec(empsec);
				  bl.setEmpgender(empgender);
				  bl.setEmpho(empho);
				  out.println("<html><body><b>"+"<table border=\"1\">"+
				  "<tr>"+
				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
				  "</tr>"
				  +"</table></b></body></html>");
		}
		  
	    	}catch(ClassNotFoundException e) 
             {
	             e.printStackTrace();
            }
             catch(Exception e)
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
	    else if(a.equals("6"))
	       {   
	    	try {
	    	con=DatabaseConnection.intializeDatabase();
	    	String query="SELECT * FROM student s,blood_finder b" +
	                   " WHERE b.blood_group='B+' and s.USN=b.USN";
			  stmt=con.createStatement();
			  resultSet = stmt.executeQuery(query);
			  out.println("<html><body><b>"+"<table border=\"1\">"+
					   "<caption>BLOOD LIST</caption>"+
					   "<tr>"+
					    "<th scope='col' width='100px'>ID</th>"+
					    "<th scope='col' width='100px'>NAME</th>"+
					    "<th scope='col' width='100px'>BRANCH</th>"+
					    "<th scope='col' width='100px'>SEM</th>"+
					    "<th scope='col' width='100px'>SEC</th>"+
					    "<th scope='col' width='100px'>GENDER</th>"+
					    "<th scope='col' width='100px'>PHONE NO</th>"+
					  "</tr>"+"</tr>"
					  +"</table></b></body></html>");
			  while(resultSet.next())
			  {
				  String empid= resultSet.getString("USN");
				  String empbranch= resultSet.getString("dpt_name");
				  String empname=resultSet.getString("name");
				  String empsem=resultSet.getString("sem");
				  String empsec= resultSet.getString("sec");
				  String empgender= resultSet.getString("gender");
				  String empho= resultSet.getString("phone no");
				  Studentblood bl= new Studentblood();
				  bl.setEmpid(empid);
				  bl.setEmpbranc(empbranch);
				  bl.setEmpname(empname);
				  bl.setEmpsem(empsem);
				  bl.setEmpsec(empsec);
				  bl.setEmpgender(empgender);
				  bl.setEmpho(empho);
				  out.println("<html><body><b>"+"<table border=\"1\">"+
				  "<tr>"+
				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
				  "</tr>"
				  +"</table></b></body></html>");
		}
		  
	    	}catch(ClassNotFoundException e) 
             {
	             e.printStackTrace();
            }
             catch(Exception e)
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
	    else if(a.equals("7"))
	       {   
	    	try {
	    	con=DatabaseConnection.intializeDatabase();
	    	String query="SELECT * FROM student s,blood_finder b" +
	                   " WHERE b.blood_group='AB-' and s.USN=b.USN";
			  stmt=con.createStatement();
			  resultSet = stmt.executeQuery(query);
			  out.println("<html><body><b>"+"<table border=\"1\">"+
					   "<caption>BLOOD LIST</caption>"+
					   "<tr>"+
					    "<th scope='col' width='100px'>ID</th>"+
					    "<th scope='col' width='100px'>NAME</th>"+
					    "<th scope='col' width='100px'>BRANCH</th>"+
					    "<th scope='col' width='100px'>SEM</th>"+
					    "<th scope='col' width='100px'>SEC</th>"+
					    "<th scope='col' width='100px'>GENDER</th>"+
					    "<th scope='col' width='100px'>PHONE NO</th>"+
					  "</tr>"+"</tr>"
					  +"</table></b></body></html>");
			  while(resultSet.next())
			  {
				  String empid= resultSet.getString("USN");
				  String empbranch= resultSet.getString("dpt_name");
				  String empname=resultSet.getString("name");
				  String empsem=resultSet.getString("sem");
				  String empsec= resultSet.getString("sec");
				  String empgender= resultSet.getString("gender");
				  String empho= resultSet.getString("phone no");
				  Studentblood bl= new Studentblood();
				  bl.setEmpid(empid);
				  bl.setEmpbranc(empbranch);
				  bl.setEmpname(empname);
				  bl.setEmpsem(empsem);
				  bl.setEmpsec(empsec);
				  bl.setEmpgender(empgender);
				  bl.setEmpho(empho);
				  out.println("<html><body><b>"+"<table border=\"1\">"+
				  "<tr>"+
				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
				  "</tr>"
				  +"</table></b></body></html>");
		}
		  
	    	}catch(ClassNotFoundException e) 
             {
	             e.printStackTrace();
            }
             catch(Exception e)
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
	    else if(a.equals("8"))
	       {   
	    	try {
	    	con=DatabaseConnection.intializeDatabase();
	    	String query="SELECT * FROM student s,blood_finder b" +
	                   " WHERE b.blood_group='AB+' and s.USN=b.USN";
			  stmt=con.createStatement();
			  resultSet = stmt.executeQuery(query);
			  out.println("<html><body><b>"+"<table border=\"1\">"+
					   "<caption>BLOOD LIST</caption>"+
					   "<tr>"+
					    "<th scope='col' width='100px'>ID</th>"+
					    "<th scope='col' width='100px'>NAME</th>"+
					    "<th scope='col' width='100px'>BRANCH</th>"+
					    "<th scope='col' width='100px'>SEM</th>"+
					    "<th scope='col' width='100px'>SEC</th>"+
					    "<th scope='col' width='100px'>GENDER</th>"+
					    "<th scope='col' width='100px'>PHONE NO</th>"+
					  "</tr>"+"</tr>"
					  +"</table></b></body></html>");
			  while(resultSet.next())
			  {
				  String empid= resultSet.getString("USN");
				  String empbranch= resultSet.getString("dpt_name");
				  String empname=resultSet.getString("name");
				  String empsem=resultSet.getString("sem");
				  String empsec= resultSet.getString("sec");
				  String empgender= resultSet.getString("gender");
				  String empho= resultSet.getString("phone no");
				  Studentblood bl= new Studentblood();
				  bl.setEmpid(empid);
				  bl.setEmpbranc(empbranch);
				  bl.setEmpname(empname);
				  bl.setEmpsem(empsem);
				  bl.setEmpsec(empsec);
				  bl.setEmpgender(empgender);
				  bl.setEmpho(empho);
				  out.println("<html><body><b>"+"<table border=\"1\">"+
				  "<tr>"+
				  "<td width='100px'>"+bl.getEmpid()+"</td>"+
				  "<td width='100px'>"+bl.getEmpname()+"</td>"+
				  "<td width='100px'>"+bl.getEmpbranc()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsem()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpsec()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpgender()+"</td>"+ 
				  "<td width='100px'>"+bl.getEmpho()+"</td>"+ 
				  "</tr>"
				  +"</table></b></body></html>");
		}
		  
	    	}catch(ClassNotFoundException e) 
             {
	             e.printStackTrace();
            }
             catch(Exception e)
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
	
