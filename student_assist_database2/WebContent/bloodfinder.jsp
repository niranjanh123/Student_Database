<%@page import="java.util.List"%>
<%@page import="student_assist_database2.Studentblood"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>BloodFinder</title>
<link rel="stylesheet"href="maintitlebar.css">
<link rel="stylesheet"href="menubar.css">
<link rel="stylesheet"href="bloodfinder.css">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap" rel="stylesheet"> 
</head>
<body>
      <div class="contain">
                <div class="logodaya">
                    <img src="images/logo.png" height="100px"width="100px">
                </div>
            
                <div class="titledaya" font-face="Roboto Slab,serif;">
                    <h2>Dayananda Sagar Academy of Technology and Management</h2>
                </div>
                <div class="socialgroup" align="center">
                     <img src="images/fbb.png" style="width: 30px;height: 30px;"alt="fb"/>
                     <img src="images/twitter.png" style="width: 30px;height: 30px;"alt="fb"/>
                     <img src="images/googleplus.png" style="width: 30px;height: 30px;"alt="fb"/>
                     <img src="images/yt.png" style="width: 30px;height: 30px;"alt="fb"/>
                </div>
                </div>
                <br>
                <br>
                <div class="header" >
                    <ul>
                            <li><a href="Homepage.jsp">HOME</a></li>
                            <li><a href="syllabus_main.jsp">SYLLABUS</a></li>
                             <li><a href="academic_events.jsp">ACADEMIC EVENTS</a></li>
                              <li><a href="bloodfinder.jsp">BLOOD FINDER</a></li>
                              <li><a href="about_page.jsp">ABOUT</a></li>
                              <li><a href="menubar.jsp">CONTACT</a></li>
                              </ul>
                    
                </div>
                <br>
                <br>
                <br>
                <br>
                
                <div class="bloodlist">
                    <h2>
                        SELECT YOUR BLOOD TYPE
                    </h2>
                    <div class="select_blood" align="center">
                    <form action="bloodlist" method="post" class = "form">
                            <select name="Choose">
                            <option value="1">O-</option>
                            <option value="2">O+</option>
                            <option value="3">A-</option>
                            <option value="4">A+</option>
                            <option value="5">B-</option>
                            <option value="6">B+</option>
                            <option value="7">AB-</option>
                            <option value="8">AB+</option>
                            </select>
	                <br/>
	                <br/>
	                   <input type="submit" value="Find"/>
	               </form>    
                    </div>
                </div>
                 <br/>
                 <br/>
             
</body>
</html>