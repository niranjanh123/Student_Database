<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap" rel="stylesheet"> 
    <link rel="stylesheet"href="home.css">
    <link rel="stylesheet"href="style.css">
    <style> 
     * {box-sizing: border-box;}
        body {font-family: Verdana, sans-serif;}
        .mySlides {display: none;}
        img {vertical-align: middle;}
        
        /* Slideshow container */
        .slideshow-container {
          max-width: 1000px;
         position: relative; 
          margin: auto;
        }
        
        /* Caption text */
        .text {
          color: #f2f2f2;
          font-size: 15px;
          padding: 8px 12px;
          position: absolute;
          bottom: 8px;
          width: 100%;
          text-align: center;
        }
        
        /* Number text (1/3 etc) */
        .numbertext {
          color: #f2f2f2;
          font-size: 12px;
          padding: 8px 12px;
          position: absolute;
          top: 0;
        }
        
        /* The dots/bullets/indicators */
        .dot {
          height: 15px;
          width: 15px;
          margin: 0 2px;
          background-color: #bbb;
          border-radius: 50%;
          display: inline-block;
          transition: background-color 0.6s ease;
        }
        
        .active {
          background-color: #717171;
        }
        
        /* Fading animation */
        .fade {
          -webkit-animation-name: fade;
          -webkit-animation-duration: 1.5s;
          animation-name: fade;
          animation-duration: 1.5s;
        }
        
        @-webkit-keyframes fade {
          from {opacity: .4} 
          to {opacity: 1}
        }
        
        @keyframes fade {
          from {opacity: .4} 
          to {opacity: 1}
        }
        
        /* On smaller screens, decrease text size */
        @media only screen and (max-width: 300px) {
          .text {font-size: 11px}
        }
        </style>
</head>
<body class="body">
          <div class="top">
            <img src="images/logo.png"alt=LOGO class="logo1" />
            <h2 class="name">Dayananda Sagar Academy of Technology And Management</h2>
            <!-- <h5 class="dream">LIVE YOUR DREAM!!</h5>  -->
            <div align="center" class="social">
              <img src="images/fbb.png" style="width: 30px;height: 30px;" alt="fb" />
              <img src="images/twitter.png" style="width: 30px;height: 30px;" alt="twitter" />
              <img src="images/googleplus.png" style="width: 30px;height: 30px;" alt="gp" />
              <img src="images/yt.png" style="width: 30px;height: 30px;" alt="yt"/>
                 </div>
      </div>
            <div class="cl"></div>
     
        <header>
           <nav class="topnav">
              <ul>
                 <li class="li1"><a href="Homepage.jsp">HOME</a></li>
                  <li><a href="syllabus_main.jsp">SYLLABUS</a></li>
                   <li><a href="academic_events.jsp">ACADEMIC EVENTS</a></li>
                    <li><a href="bloodfinder.jsp">BLOOD FINDER</a></li>
                    <li><a href="about_page.jsp">ABOUT</a></li>
                    <li><a href="menubar.jsp">CONTACT</a></li>
                    <li><a href="Logout.jsp">LOGOUT</a></li>
              </ul>
           </nav>
           <div class="clear"></div>
           <!-- <marquee>
             <p>welclome To DSATM</p>
           </marquee> -->
       </header>
       <div class="cl2"></div>
       <div class="container">
      
                   <br><br>
                   <hr>
                    <br>
                    <br>

                    <!--another slideview-->
  
                     <div class="slideshow-container">
                    
                    <div class="mySlides fade">
                      <div class="numbertext">1 / 3</div>
                      <img src="images\dsatm1.png" style="width:100%">
                    
                    </div>
                    
                    <div class="mySlides fade">
                      <div class="numbertext">2 / 3</div>
                      <img src="images\dsatm2.png" style="width:100%">
                      
                    </div>
                    
                    <div class="mySlides fade">
                      <div class="numbertext">3 / 3</div>
                      <img src="images\dsatm3.png" style="width:100%">
                    
                    </div> 
 
                    <!-- <div class="mySlides fade">
                            <div class="numbertext">1 / 3</div>
                            <img src="dsatm8.png" style="width:100%">
                            <div class="text">Caption Text</div>
                          </div> 
                           <div class="mySlides fade">
                                <div class="numbertext">1 / 3</div>
                                <img src="dsatm9.png" style="width:100%">
                                <div class="text">Caption Text</div>
                              </div>
                     
                    </div>  -->
                    <br>
                    
                     <div style="text-align:center">
                      <span class="dot"></span> 
                      <span class="dot"></span> 
                      <span class="dot"></span> 
                    </div> 
                    
                     <script>
                    var slideIndex = 0;
                    showSlides();
                    
                    function showSlides() {
                      var i;
                      var slides = document.getElementsByClassName("mySlides");
                      var dots = document.getElementsByClassName("dot");
                      for (i = 0; i < slides.length; i++) {
                        slides[i].style.display = "none";  
                      }
                      slideIndex++;
                      if (slideIndex > slides.length) {slideIndex = 1}    
                      for (i = 0; i < dots.length; i++) {
                        dots[i].className = dots[i].className.replace(" active", "");
                      }
                      slides[slideIndex-1].style.display = "block";  
                      dots[slideIndex-1].className += " active";
                      setTimeout(showSlides, 2000); // Change image every 2 seconds
                    }
                    </script> 
                    
			   <header class="gap1">
           <br>
           <br>
           <hr>
         <!-- <div class="block1"> -->
           <div class="card">

              <div class="image">
                 <img src="images\syllabus.png">
              </div>
              <div class="title">
               <h1>
              SYLLABUS</h1>
              </div>
              <div class="des">
               <p>
              Get the latest syllabus </p>
               <button id="syllabus" onclick="location.href = 'syllabus_main.jsp';">SYLLABUS</button> 
              </div>
              </div>
              <!--cards -->
              
              
              <div class="card">
              
              <div class="image">
                 <img src="images\calendar.png">
              </div>
              <div class="title">
               <h1>
              CALENDAR </h1>
              </div>
              <div class="des">
               <p>
              Calendar of events</p>
              <button id="calendar" onclick="location.href = 'academic_events.jsp';">CALENDAR</button>
              </div>
              </div>
              <!--cards -->
              
              
              <div class="card">
              
              <div class="image">
                 <img src="images\blood.png">
              </div>
              <div class="title">
               <h1>
              BLOOD FINDER</h1>
              </div>
              <div class="des">
               <p>
              Match your Blood Type</p>
              <button id="blood finder" onclick="location.href = 'bloodfinder.jsp';">BLOOD FINDER</button>
              </div>
              </div>
              <!--cards -->
              
              
              <div class="card">
              
              <div class="image">
              <img src="images\about.png">
              </div>
              <div class="title">
             <h1>ABOUT</h1>
              </div>
              <div class="des">
               <p>Obtain complete information about the college and its facilities</p>
              <button onclick="location.href = 'about_page.jsp';" id="myButton" class="float-left submit-button" >ABOUT</button>
              </div>
              </div>
              <!--cards -->
              
              <div class="card">
              
              <div class="image">
              <img src="images\contact.png">
              </div>
              <div class="title">
               <h1>
              CONTACT</h1>
              </div>
              <div class="des">
               <p>
              Contact details of teaching and non teching staff</p>
              <button onclick="location.href = 'menubar.jsp';" id="myButton" class="float-left submit-button" >CONTACT</button>
              </div>
              </div>
              <!--cards -->
              
              <div class="card">
              
              <div class="image">
              <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Gfp-missouri-st-louis-clubhouse-pond-and-scenery.jpg/1199px-Gfp-missouri-st-louis-clubhouse-pond-and-scenery.jpg">
              </div>
              <div class="title">
               <h1>
              LOGOUT</h1>
              </div>
              <div class="des">
               <p>
              Please do visit the website for futher updates on academics.</p>
              <button id="cont" onclick="location.href = 'Logout.jsp';">LOGOUT</button>
              </div>
              </div>
            </header>  
            <!-- Actually div close -->
              <!--cards -->
            <!-- </div> -->
          </div>
        </div>  
        
     <br>
     <br>
     <hr>
     <div class="panelcontainer">
      <div class="panel">
          <div class="DSI">
              <img src="images\dsatm8.png"alt="DSI PIC">
          </div>
          <div class="des1">
             <p>Link to DSI</p>
          </div>
           <button class="button" onclick="location.href ='https://www.dayanandasagar.edu/';">DSI</button>
        
      </div>
      <div class="panel">
        <div class="DSI">
            <img src="images\DSU.png"alt="DSU PIC">
        </div>
        <div class="des1">
          <p>Link to DSU</p>
       </div>
         <button class="button2" onclick="location.href='https://www.dsu.edu.in/';">DSU</button>
    </div>
     </div>
     <br>
     <br>
     <hr>
     <div class="facilities">
       <h3 align="center" class="fac">FACILITIES</h3>
       <div class="facpanal">
          <div class="DSatm">
              <img src="images\dsatm3.png"alt="DSU PIC">
          </div>
          <div class="desvideo">
            <p align="center">Link to VIDEO</p>
         </div>
           <button class="button1" onclick="location.href='https://www.youtube.com/watch?v=0ehqeMhq3L4';">VIDEO</button>
      </div>
      
          <div class="facpanal1">
          
           <ul>
             <li>>LIBRARY</li>
             <li>>FOOD COURT</li>
             <li>>SPORTS COMPLEX</li>
             <li>>AMPHITHEATRE</li>
             <li>>LABORATORY</li>
             <li>>MEDICAL CENTRE</li>
             <li>>HOSTEL</li>
           </ul>
          </div>

     </div>
        <br>
        <br>
        <hr>
		
</body>
</html>