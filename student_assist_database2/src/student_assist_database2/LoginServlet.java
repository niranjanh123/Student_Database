package student_assist_database2;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String usn01;
	String pass01;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println("Reached here");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		usn01 = req.getParameter("usn");
		pass01 = req.getParameter("pass");
		res.setContentType("text/html;charset=UTF-8");
		   if (validate.checkuser(usn01, pass01)) {
//			   PrintWriter out = res.getWriter();
//			   out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//			   out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
//			   out.println("<script>");
//			   out.println("$(document).ready(function(){");
//			   out.println("swal( 'Welcome' , 'successfull!', 'success');");
//			   out.println("});");
//			   out.println("</script>");
//			   HttpSession session= req.getSession();
//			   res.sendRedirect("Homepage.jsp");
			RequestDispatcher rs = req.getRequestDispatcher("Homepage.jsp");
			rs.forward(req, res);
	   }
			else {
//				   PrintWriter out = res.getWriter();
//				   out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//				   out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
//				   out.println("<script>");
//				   out.println("$(document).ready(function(){");
//				   out.println("swal( 'Incorrect' , ' ', 'error');");
//				   out.println("});");
//				   out.println("</script>");
////				   HttpSession session= req.getSession();
////				   res.sendRedirect("Login.jsp");
			       RequestDispatcher rs = req.getRequestDispatcher("Loginfail.jsp");
			       rs.forward(req, res);
		   }
	}
	
}




//DO NOT SEND ANY NULL VALUES TO JSP
//	req.setAttribute("usn", usn01);
//	req.setAttribute("isPremiumUser", true);
	
	
	
	
	
	
	
	
	
	
	
	
	
//	ArrayList<Student> studentList = new ArrayList<>();
//	for (int i=0;i<100;i++) {
//		Student student = new Student();
//		student.setName("Student " + i);
//		student.setBloodType("O+");
//		student.setUsn("IDT11CS00" + i);
//		studentList.add(student);
	
//	req.setAttribute("studentList", studentList);
//	rs.forward(req, res);
//String url="file:///C:/Users/Niranjan/Documents/Homepage.html";
//File htmlFile = new File(url);
//Desktop.getDesktop().browse(htmlFile.toURI());
//

