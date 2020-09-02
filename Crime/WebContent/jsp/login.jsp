<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
    <head>
    <title>Login</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
<body style="background-image: url(../images/Crime5.jpg); background-repeat: no-repeat; background-size: 100%100%">
  <br><br> <br><br><br><br> <br><br>
   
    <div class="login">   
    <form action="../Login" method="get" id="login"> 
<h2>Login Here</h2><br>

             <label>  <strong> Email:</strong></label><br>
        <input placeholder=" Enter registered email" type="text" name="email" id="Name"><br/><br/>         
           
        <label><strong> Password:</strong></label><br>
        <input  placeholder="Enter new password" type="password" name="pass" id="Pass"><br/><br/>
        <input type="submit" value="Login" id="sub"><br><br>
  Not Registered yet??&nbsp;<a href="registration.jsp">Register Here</a><br><br>
         &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
        <a href="for_pass.jsp">Forgot Password?</a>
          <%
		if(request.getAttribute("errormsg")!=null)
			  out.println("<font color=red>"+"<font size=5>"+request.getAttribute("errormsg")+"</font>");
			  
		%>
  
        </form> 
    </div> 
</body>  
</html>
