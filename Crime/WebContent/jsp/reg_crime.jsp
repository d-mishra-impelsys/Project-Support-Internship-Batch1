<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
    <head>
    <title>Registration Form</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
<body style="background-image: url(../images/crime8.jpg); background-repeat: no-repeat; background-size: 100%100%">
<h1>Complaint Registration form</h1><br>
    <div class="regcrime">   
    <form action="../Regcrime" method="get" id="regcrime"> 
    <h2>Register your complaint Here</h2>
     <label><strong>  Complaint ID:</strong></label><br>
        <input type="number" name="com_id" id="Pass"><br/><br/>
             <label>  <strong> Complaint Type:</strong></label><br>
     <select name="com_type" id="Secqn">  
                <option>Robbery</option>  
                <option>Illegal Construction</option> 
                <option>Drink and drive </option> 
                <option>Money fraud</option> 
                <option>Attempt to murder</option>
                            </select>    <br><br>
        <label> <strong>Date:</strong></label><br>
        <input  placeholder="YYYY/MM/DD" type="date" name="date" id="Email"><br/><br/> 
        <label><strong> Victim Details :</strong></label><br>
        <input  placeholder="Enter details" type="text" name="victim_det" id="Pass"><br/><br/>
        <label><strong>  Location:</strong></label><br>
        <input  placeholder="Enter the location" type="text" name="location" id="Pass"><br/><br/>
       
        <label><strong> Details of the complaint:</strong></label><br>
        <input  placeholder="Enter details" type="text" name="det_com" id="Add"><br/><br/>
       
        <a href="userhome.jsp">  <input type="submit" value="Register" id="sub"></a>
        
          <input type="reset" value="Reset" id="back">
               <%
		if(request.getAttribute("errormsg")!=null)
			  out.println("<font color=red>"+"<font size=5>"+request.getAttribute("errormsg")+"</font>");
			  
		%>
  
</form> 
    </div> 
</body>  
</html>