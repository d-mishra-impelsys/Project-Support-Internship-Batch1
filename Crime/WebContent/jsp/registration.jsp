<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
    <head>
    <title>Registration Form</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
<body style="background-image: url(../images/crime.jpg); background-repeat: no-repeat; background-size: 100%100%">
   <h1>Registration Form</h1>
    <div class="register">   
    <form action="../Register" method="get" id="register"> 
    <h2>Register Here</h2>
             <label>  <strong> Name:</strong></label><br>
        <input placeholder=" Enter name" type="text" name="name" id="Name"><br/><br/>         
           <label> <strong> Email Id:</strong></label><br>
        <input placeholder=" Enter email"  type="text" name="email" id="Email"><br/><br/> 
        <label><strong> Password:</strong></label><br>
        <input  placeholder="Enter new password" type="password" name="pass" id="Pass"><br/><br/>
        <label><strong>  Confirm Password:</strong></label><br>
        <input  placeholder="Enter password again" type="password" name="pass" id="Pass"><br/><br/>
       
        <label><strong> Address:</strong></label><br>
        <input  placeholder="Enter address" type="text" name="adds" id="Add"><br/><br/>
        <label><strong>Phone No:</strong></label><br>
                <input  placeholder="Enter mobile number" type="number" name="ph_no" id="num"><br/><br/>

        <label> <strong>Gender:</strong></label><br>
            <input type="radio" name="gender" value="male" id="Male">Male
            <input type="radio" name="gender" value="female" id="Female">Female
            <input type="radio" name="gender" value="other" id="Other">Other<br><br>                                                        
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
        <a href="login.jsp">  <input type="submit" value="Register" id="sub"></a>
        
          <input type="reset" value="Reset" id="back">
          <%
		if(request.getAttribute("errormsg")!=null)
			  out.println("<font color=red>"+"<font size=5>"+request.getAttribute("errormsg")+"</font>");
			  
		%>
  
</form> 
    </div> 
</body>  
</html>