package crime.dao;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import crime.model.*;

public class PasswordDAO {
	private static Connection con; 
	private static PreparedStatement stmt;
	public static void getConnection()
	  {
		
		  String JdbcURL = "jdbc:mysql://localhost:3306/crimedb?" + "autoReconnect=true&useSSL=false";
	      String Username = "root";
	      String password = "";
	       con = null;      
	      try 
	      {
	    	 Class.forName("com.mysql.jdbc.Driver");   // Driver should be registered
	         con = DriverManager.getConnection(JdbcURL, Username, password);
	         
	      } 
	      catch (Exception e) 
	      {
	         e.printStackTrace();
	      }
		   
		 
	  }
	  public static void closeConnection()
	  {
		  try{
			  if(con.isClosed()==false)
		          con.close();   // closing the connection
		  }
		  catch(Exception e)
		  { e.printStackTrace();	 }
	  }
	  
	
	
	  public static boolean forgot(Registermodel forg)
	  {
		  boolean status=false;
		  try{
			  getConnection();
			  stmt=con.prepareStatement("select sec_ans from registration where email=? and sec_qn=?");
			  stmt.setString(1, forg.getEmail());
			  stmt.setString(2, forg.getSec_qn());
			  ResultSet rs=stmt.executeQuery();
			  String ans="";
			 // status=rs.next(); 
			  if(rs.next())
			  {
				  ans=rs.getString(1);
				  status=true;
			  }
			  closeConnection();
			if(status=true)
			{
				if(ans.equals(forg.getSec_ans()))
				   return true;
				else
					return false;
			}
			else
				return false;
			    }
			  catch(SQLException e)
			  {
			  e.printStackTrace();
			  return false;
			  }
			  catch(Exception e)
			  {
			  e.printStackTrace();
			  return false;
			  }  	  	  
			  
		  }	 

}
