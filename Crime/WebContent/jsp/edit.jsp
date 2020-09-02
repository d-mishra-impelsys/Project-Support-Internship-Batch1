<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
    <head>
    <title>Edit Profile</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
<body style="background-image: url(../images/crime3.jpg); background-repeat: no-repeat; background-size: 100%100%">
   <h1>Edit Profile</h1>
    <div class="edit">   
    <form action="../Edit" method="get" id="edit"> 

             <label>  <strong> Name:</strong></label><br>
        <input placeholder=" Enter name" type="text" name="name" id="Name"><br/><br/>         
           <label> <strong> Email Id:</strong></label><br>
        <input placeholder=" Enter email"  type="text" name="email" id="Email"><br/><br/>
         <label><strong> Address:</strong></label><br>
        <input  placeholder="Enter address" type="text" name="adds" id="Add"><br/><br/>
        <label><strong>Phone No:</strong></label><br>
        
                <input  placeholder="Enter mobile number" type="number" name="ph_no" id="num"><br/><br/>
        <label><strong> Password:</strong></label><br>
        <input  placeholder="Enter new password" type="password" name="pass" id="Pass"><br/><br/>
         <label><strong>  Confirm Password:</strong></label><br>
        <input  placeholder="Enter password again" type="password" name="pass" id="Pass"><br/><br/>
       

       
        <a href="userhome.jsp">  <input type="submit" value="Edit" id="sub"></a>
                        <input type="reset" value="Reset" id="back">
                         <%
		if(request.getAttribute("errormsg")!=null)
			  out.println("<font color=red>"+"<font size=5>"+request.getAttribute("errormsg")+"</font>");
			  
		%>

  
</form> 
    </div> 
</body>  
</html>