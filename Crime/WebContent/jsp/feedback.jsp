<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
    <head>
    <title>Feedback Page</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
    </head>
<body style="background-image: url(../images/crime9.jpg); background-repeat: no-repeat; background-size: 100%100%">
  <br><br><br><br><br> <h1>Give Your Feedback</h1>
    <div class="feedback">   
    <form action="../Feedback" method="get" id="feedback">
        <br>
                   <label>  <strong> Email:</strong></label><br>
        <input placeholder=" Enter  registered email" type="text" name="email" id="Email"><br/><br/>         
           
      <h2> <strong>  Feedback on FIR:</strong></h2>
        <input placeholder="write your feedback" type="reason"  id="Pass"><br/><br/>
       &nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;<input type="submit" value="Submit" id="back"><br><br>
  
        </form> 
    </div> 
    
    </body>
</html>