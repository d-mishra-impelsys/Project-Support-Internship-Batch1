package crime.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import crime.model.Registermodel;

public class EditDAO {
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
	  
	  public static boolean edit(Registermodel edit)
	  {
		 
		  try{
			  getConnection();
			  int nor=0;
			  stmt=con.prepareStatement("update registration set name=?, adds=?, ph_no=?, pass=? where email=?");
			  stmt.setString(1, edit.getName());
			  stmt.setString(2, edit.getAdds());
			  stmt.setString(3, edit.getPh_no() );
			  stmt.setString(4, edit.getPass());
			  stmt.setString(5, edit.getEmail());
			 
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
