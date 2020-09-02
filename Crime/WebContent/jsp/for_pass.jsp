<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <title>Forgot Password</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
<body style="background-image: url(../images/crime4.jpeg); background-repeat: no-repeat; background-size: 100%100%">
   <br><br> <br><br><br><br>
    <div class="password">   
    <form action="../Password" method="get" id="password"> 
<h2>Change your password here</h2><br>
             <label>  <strong> Email</strong></label><br>
        <input placeholder=" Enter registered email" type="text" name="email" id="Email"><br/><br/>         
       <label><strong>Security Question:</strong></label><br>
            <select name="sec_qn" id="Secqn">  
                <option>mother's name</option>  
                <option>favourite book</option> 
                <option>date of birth</option> 
                <option>favourite actress</option> 
                <option>favourite actor</option>
                            </select>    <br><br>

        <label> <strong>Security answer:</strong></label><br>
             <input  placeholder="Enter your answer" type="text" name="sec_ans" id="Secans"><br/><br/> 
                    <input type="submit" value="Submit" id="sub">&nbsp;
<a href="login.jsp">Goto Login</a>
  <%
		if(request.getAttribute("errormsg")!=null)
			  out.println("<font color=red>"+"<font size=5>"+request.getAttribute("errormsg")+"</font>");
			  
		%>

        </form> 
    </div> 
</body>  
</html>