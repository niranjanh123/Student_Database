<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>ABOUT</title>
<link rel="stylesheet"href="about_page.css">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap" rel="stylesheet">
</head>
<body>
    <div class="contain">
    <div class="logodaya">
        <img src="images/logo.png"height="100px"width="100px">
    </div>

    <div class="titledaya" font-face="Roboto Slab, serif;">
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
    <div class="ABOUT_SLIDER">
       <div class="slider">
        <script>
            var i=0;
            var images=[];
            var time=3000;
            images[0]='images/vv.jpg';
            images[1]='images/fi.png';
            images[2]='images/vb.jpg';
            images[3]='images/DSI.jpg';
            images[4]='images/hhistory.png';
            images[5]='images/library.jpg';
            images[6]='images/mech.jpeg';
            images[7]='images/chem.jpg';
            images[8]='images/bat.jpg';
            images[9]='images/lab.jpg';
            images[10]='images/alltogether.jpg';
            images[11]='images/haha.jpg';
            images[12]='images/sanji.jpg';
            function changeImg(){
                document.slide.src = images[i];
                if(i<images.length - 1){
                    i++;
                }else{
                    i=0;
                }
                setTimeout("changeImg()",time);
            }
            window.onload=changeImg;
        </script>
        <img name="slide" width="400" height="280" >
        </div>
        
        <div class="dpt">
          
                <h2>DEPARTMENTS</h2><p1><hr/>
                    <ul><li>Bachelor of Architecture</li>
                        <li> Civil Engineering</li>
                        <li>Computer Science Engineering</li>    
                        <li>Electrical & Electronics Engineering</li>
                        <li>Electronics and Communication Engineering</li>
                        <li>Information Science & Engineering</li>
                        <li>Mechanical Engineering</li>
                        <li>Master of Business Administration</li>
                        <li>Master of Computer Applications</li>
                        <li>Mathematics Department</li>
                        <li>Physics Department</li>
                        <li>Chemistry Department</li></ul></p1>
                </div>
        </div>

        <div class="main_body">
           <div class="vision_mission">
               <h1>Vision & Mission</h1>
               <hr/>
               <img src="images/fi.png" style="width:100%;height:300px;"/>
               <h2>The Pride of Dayananda Sagar Institutions - its Leadership</h2>
               <p1>The pride of DSATM is its Leadership team, Meet our second generation visionaries Leaders who follow the footsteps of our founder Late Sri R. Dayananda Sagar.<br/>
                Thinkers, Planners, Institution builders and medical doctors, enriched with insight gained from hands-on work experience. learning and sharing through interaction with the high and well placed, widely travelled, they bring with them a piece of worldly wisdom in all that they do.<br/>
                A brilliant and dynamic team that DSATM can proudly emulate and call its own.</p1>
            </div>
            <div class="vision">
              <h1>VISION</h1><hr/>
              <p1>
                To strive at creating the institution a center of highest caliber of learning, so as to create an overall intellectual atmosphere with each deriving strength from the other to be the best of engineers, scientists and mathematicians.</p1>
            </div>
            <div class="mission">
                 <h1>MISSION</h1><hr/>
                    <p1><ul><li>To serve its region, state, the nation and globally by preparing students to make meaningful contributions in an increasing complex global society.</li>
                    <li>To encourage, reflection on and evaluation of emerging needs and priorities with state of art infrastructure.</li>
                    <li>To support research and services establishing enhancements in technical, health, economic, human and cultural development.</li>
                    <li>To establish inter disciplinary center of excellence.</li>
                    <li>To increase the number of Doctorate holders to promote research culture on campus.</li></ul></p1>
            </div>
            <div class="values">
        
             <h1>VALUES</h1><hr/>
             <p1>The values that drive DSATM and support its vision:<br/>
             <ul>
             <li>The Pursuit of Excellence - A commitment to strive continuously to improve ourselves and our systems with the aim of becoming the best in our field.</li><br/>
        
             <li>Fairness - A commitment to objectivity and impartiality, to earn the trust and respect of society.</li><br/>
        
             <li>Leadership - A commitment to lead responsively and creatively in educational and research processes.</li><br/>
        
             <li>Integrity and Transparency - A commitment to be ethical, sincere and transparent in all activities and to treat all individuals with dignity and respect.</li><br/>
             </ul></p1>
            </div>
        
    
    </div>
    </body>
    </html>