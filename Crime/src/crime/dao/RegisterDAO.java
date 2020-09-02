package crime.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import crime.model.*;

public class RegisterDAO {
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
	  
	  public static boolean register(Registermodel reg)
	  {
		
		  try{
			  getConnection();
			  int nor=0;
			  stmt=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?)");
			  stmt.setString(1, reg.getName());
			  stmt.setString(2, reg.getEmail());
			  stmt.setString(3, reg.getPass());
			  stmt.setString(4, reg.getAdds());
			  stmt.setString(5, reg.getPh_no() );
			  stmt.setString(6, reg.getGender());
			  stmt.setString(7, reg.getSec_qn());
			  stmt.setString(8, reg.getSec_ans());
			  stmt.setString(9, reg.getUtype());
			 nor= stmt.executeUpdate();
			 closeConnection();
			   if (nor>0)
			   {
				   return true;
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
