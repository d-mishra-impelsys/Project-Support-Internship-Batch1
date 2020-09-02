package crime.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import crime.model.*;


public class RegcrimeDAO {
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
 public static boolean registercrime(Complaintmodel reg)
{
	
	  try{
		  getConnection();
		  int nor=0;
		  stmt=con.prepareStatement("insert into complaint(com_id, com_type, date, victim_det, location, det_com)  values(?,?,?,?,?,?)");
		  stmt.setInt(1, reg.getCom_id());
		  stmt.setString(2, reg.getCom_type());
		  stmt.setString(3, reg.getDate());
		  stmt.setString(4, reg.getVictim_det());
		  stmt.setString(5, reg.getLocation() );
		  stmt.setString(6, reg.getDet_com());
		 
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
