<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Details</title>
<link rel="stylesheet"href="maintitlebar.css">
<link rel="stylesheet"href="menubar.css">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap" rel="stylesheet"> 
</head>
<body>
     
        <div class="contain">
                <div class="logodaya">
                    <img src="images/logo.png" height="100px"width="100px">
                </div>
            
                <div class="titledaya"font-face="Roboto Slab, serif;">
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
                
                <div class="department_details" align="center">
                    <form action="department_details" method="post">
                            <select name="Choose">
                            <option value="1">CSE</option>
                            <option value="2">ISE</option>
                            <option value="3">ECE</option>
                            <option value="4">EEE</option>
                            <option value="5">MECH</option>
                            <option value="6">CIV</option>
                        </select>

	                <br/><br/>

	                   <input type="submit" value="Find" width="100px" height="100px"/>
	                </form>    
                  </div>
</body>
</html>