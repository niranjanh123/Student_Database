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
public class departmentfinder extends HttpServlet {
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
	     if(a.equals("1")) {
	    	 try {
	 	    	con=DatabaseConnection.intializeDatabase();
	 	    	String query="SELECT staff_name,dpt_name,phone_no FROM staff" +
	 	                   " WHERE dpt_name='CSE'";
	 			  stmt=con.createStatement();
	 			  resultSet = stmt.executeQuery(query);
	 			 out.println("<html><body><b>"+"<table border=\"1\">"
					      +"<caption>STAFF LIST</caption>"+
					      "<tr>"+
						    "<th scope='col' width='150px'>DEPARTMENT NAME</th>"+
						    "<th scope='col' width='150px'>NAME</th>"+
						    "<th scope='col' width='150px'>PHONE NO</th>"+
					      "</tr>"+"</table></b></body></html>");
	 			 while(resultSet.next())
				  {
				      Stafflist sf = new Stafflist();
				      sf.setStaffname(resultSet.getString("staff_name"));
				      sf.setDptname(resultSet.getString("dpt_name"));
				      sf.setPhone_no(resultSet.getString("phone_no"));
				      out.println("<html><body><b>"+"<table border=\"1\">"+	
				      "<tr width='150px'>"+
					  "<td width='150px'>"+sf.getDptname()+"</td>"+
					  "<td width='150px'>"+sf.getStaffname()+"</td>"+
					  "<td width='150px'>"+sf.getPhone_no()+"</td>"+ 
					  "</tr>"
					  +"</table></b></body></html>");
				  }
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }
    }
	     else if(a.equals("2")) {
	    	 try {
		 	    	con=DatabaseConnection.intializeDatabase();
		 	    	String query="SELECT staff_name,dpt_name,phone_no FROM staff" +
		 	                   " WHERE dpt_name='ISE'";
		 			  stmt=con.createStatement();
		 			  resultSet = stmt.executeQuery(query);
		 			 out.println("<html><body><b>"+"<table border=\"1\">"
						      +"<caption>STAFF LIST</caption>"+
						      "<tr>"+
							    "<th scope='col' width='150px'>DEPARTMENT NAME</th>"+
							    "<th scope='col' width='150px'>NAME</th>"+
							    "<th scope='col' width='150px'>PHONE NO</th>"+
						      "</tr>"+"</table></b></body></html>");
		 			 while(resultSet.next())
					  {
					      Stafflist sf = new Stafflist();
					      sf.setStaffname(resultSet.getString("staff_name"));
					      sf.setDptname(resultSet.getString("dpt_name"));
					      sf.setPhone_no(resultSet.getString("phone_no"));
					      out.println("<html><body><b>"+"<table border=\"1\">"+	
					      "<tr width='150px'>"+
						  "<td width='150px'>"+sf.getDptname()+"</td>"+
						  "<td width='150px'>"+sf.getStaffname()+"</td>"+
						  "<td width='150px'>"+sf.getPhone_no()+"</td>"+ 
						  "</tr>"
						  +"</table></b></body></html>");
					  }
		     }catch(Exception e) {
		    	 e.printStackTrace();
		     }
	    }
	     else if(a.equals("3")) {
	    	 try {
		 	    	con=DatabaseConnection.intializeDatabase();
		 	    	String query="SELECT staff_name,dpt_name,phone_no FROM staff" +
		 	                   " WHERE dpt_name='ECE'";
		 			  stmt=con.createStatement();
		 			  resultSet = stmt.executeQuery(query);
		 			 out.println("<html><body><b>"+"<table border=\"1\">"
						      +"<caption>STAFF LIST</caption>"+
						      "<tr>"+
							    "<th scope='col' width='150px'>DEPARTMENT NAME</th>"+
							    "<th scope='col' width='150px'>NAME</th>"+
							    "<th scope='col' width='150px'>PHONE NO</th>"+
						      "</tr>"+"</table></b></body></html>");
		 			 while(resultSet.next())
					  {
					      Stafflist sf = new Stafflist();
					      sf.setStaffname(resultSet.getString("staff_name"));
					      sf.setDptname(resultSet.getString("dpt_name"));
					      sf.setPhone_no(resultSet.getString("phone_no"));
					      out.println("<html><body><b>"+"<table border=\"1\">"+	
					      "<tr width='150px'>"+
						  "<td width='150px'>"+sf.getDptname()+"</td>"+
						  "<td width='150px'>"+sf.getStaffname()+"</td>"+
						  "<td width='150px'>"+sf.getPhone_no()+"</td>"+ 
						  "</tr>"
						  +"</table></b></body></html>");
					  }
		     }catch(Exception e) {
		    	 e.printStackTrace();
		     }
	    }
	     else if(a.equals("4")) {
	    	 try {
		 	    	con=DatabaseConnection.intializeDatabase();
		 	    	String query="SELECT staff_name,dpt_name,phone_no FROM staff" +
		 	                   " WHERE dpt_name='EEE'";
		 			  stmt=con.createStatement();
		 			  resultSet = stmt.executeQuery(query);
		 			 out.println("<html><body><b>"+"<table border=\"1\">"
						      +"<caption>STAFF LIST</caption>"+
						      "<tr>"+
							    "<th scope='col' width='150px'>DEPARTMENT NAME</th>"+
							    "<th scope='col' width='150px'>NAME</th>"+
							    "<th scope='col' width='150px'>PHONE NO</th>"+
						      "</tr>"+"</table></b></body></html>");
		 			 while(resultSet.next())
					  {
					      Stafflist sf = new Stafflist();
					      sf.setStaffname(resultSet.getString("staff_name"));
					      sf.setDptname(resultSet.getString("dpt_name"));
					      sf.setPhone_no(resultSet.getString("phone_no"));
					      out.println("<html><body><b>"+"<table border=\"1\">"+	
					      "<tr width='150px'>"+
						  "<td width='150px'>"+sf.getDptname()+"</td>"+
						  "<td width='150px'>"+sf.getStaffname()+"</td>"+
						  "<td width='150px'>"+sf.getPhone_no()+"</td>"+ 
						  "</tr>"
						  +"</table></b></body></html>");
					  }
		     }catch(Exception e) {
		    	 e.printStackTrace();
		     }
	    }
	     else if(a.equals("5")) {
	    	 try {
		 	    	con=DatabaseConnection.intializeDatabase();
		 	    	String query="SELECT staff_name,dpt_name,phone_no FROM staff" +
		 	                   " WHERE dpt_name='MECH'";
		 			  stmt=con.createStatement();
		 			  resultSet = stmt.executeQuery(query);
		 			 out.println("<html><body><b>"+"<table border=\"1\">"
						      +"<caption>STAFF LIST</caption>"+
						      "<tr>"+
							    "<th scope='col' width='150px'>DEPARTMENT NAME</th>"+
							    "<th scope='col' width='150px'>NAME</th>"+
							    "<th scope='col' width='150px'>PHONE NO</th>"+
						      "</tr>"+"</table></b></body></html>");
		 			 while(resultSet.next())
					  {
					      Stafflist sf = new Stafflist();
					      sf.setStaffname(resultSet.getString("staff_name"));
					      sf.setDptname(resultSet.getString("dpt_name"));
					      sf.setPhone_no(resultSet.getString("phone_no"));
					      out.println("<html><body><b>"+"<table border=\"1\">"+	
					      "<tr width='150px'>"+
						  "<td width='150px'>"+sf.getDptname()+"</td>"+
						  "<td width='150px'>"+sf.getStaffname()+"</td>"+
						  "<td width='150px'>"+sf.getPhone_no()+"</td>"+ 
						  "</tr>"
						  +"</table></b></body></html>");
					  }
		     }catch(Exception e) {
		    	 e.printStackTrace();
		     }
	    }
	     else if(a.equals("6")) {
	    	 try {
		 	    	con=DatabaseConnection.intializeDatabase();
		 	    	String query="SELECT staff_name,dpt_name,phone_no FROM staff" +
		 	                   " WHERE dpt_name='CIV'";
		 			  stmt=con.createStatement();
		 			  resultSet = stmt.executeQuery(query);
		 			 out.println("<html><body><b>"+"<table border=\"1\">"
						      +"<caption>STAFF LIST</caption>"+
						      "<tr>"+
							    "<th scope='col' width='125px'>DEPARTMENT NAME</th>"+
							    "<th scope='col' width='125px'>NAME</th>"+
							    "<th scope='col' width='125px'>PHONE NO</th>"+
						      "</tr>"+"</table></b></body></html>");
		 			 while(resultSet.next())
					  {
					      Stafflist sf = new Stafflist();
					      sf.setStaffname(resultSet.getString("staff_name"));
					      sf.setDptname(resultSet.getString("dpt_name"));
					      sf.setPhone_no(resultSet.getString("phone_no"));
					      out.println("<html><body><b>"+"<table border=\"1\">"+	
					      "<tr>"+
						  "<td width='125px'>"+sf.getDptname()+"</td>"+
						  "<td width='125px'>"+sf.getStaffname()+"</td>"+
						  "<td width='125px'>"+sf.getPhone_no()+"</td>"+ 
						  "</tr>"
						  +"</table></b></body></html>");
					  }
		     }catch(Exception e) {
		    	 e.printStackTrace();
		     }
	    }
  }
}
