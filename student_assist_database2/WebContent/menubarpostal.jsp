<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
<title>HEAD</title>
<link rel="stylesheet"href="maintitlebar.css">
<link rel="stylesheet"href="menubar.css">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap" rel="stylesheet"> 
</head>
<body>
<div class="contain">
        <div class="logodaya">
            <img src="images\logo.png"height="100px"width="100px">
        </div>
    
        <div class="titledaya">
            <h2>Dayananda Sagar Academy of Technology and Management</h2>
        </div>
        <div class="socialgroup" align="center">
             <img src="images\fbb.png" style="width: 30px;height: 30px;"alt="fb"/>
             <img src="images\twitter.png" style="width: 30px;height: 30px;"alt="fb"/>
             <img src="images\googleplus.png" style="width: 30px;height: 30px;"alt="fb"/>
             <img src="images\yt.png" style="width: 30px;height: 30px;"alt="fb"/>
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
            
        </div><br/>

    

            <div class="headerr">
                <nav>
                    <ul>
                        <li><a href="menubarkey.jsp">key contacts</a></li>
                        <li><a href="department_details.jsp">Department Details</a></li>
                        <li><a href="menubarpostal.jsp">postal address</a></li>
                    </ul>
                </nav>
            </div>
            <br/>
            <div class="keycontact">
                    <table border="1" >
                       <tr >
                           <th>ADMISSION OFFICE</th>
                           <th>GENERAL ENQUIRY</th>
                       </tr>
                       <tr>
                           <td >Mrs. Prema David<br/>
                                Assistant Director Admissions<br/>
                                Ph: 9916075170<br/><br/>
                                
                                <strong>DAYANANDA SAGAR INSTITUTIONS</strong><br/><br/>
                                Shavige Malleshwara Hills, Kumaraswamy Layout,<br/>
                                Bangalore 560 078, Karnataka, India.<br/><br/>
                                Tel : +91-80-42161751, 42161750<br/>
                                Fax: +91-80-26660789.</td>
                                <td><br/><br/>Receptionist<br>
                                    Tel : +91-80-26662226, 26665910</td>
                       </tr>
                       <tr>
                           <td >admissions@dayanandasagar.edu</td>
                           <td>-</td>
                       </tr>
                    </table>
                </div>

                <div class="contactsimagesliderkey">
                    <div class="sliderkey">
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
        
                            <div>
                            <img name="slide" width="300" height="280" >
                        </div> 
                </div>
                </div>
                        
                  

        </body>
 </html>