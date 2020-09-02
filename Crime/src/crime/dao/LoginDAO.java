package crime.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import crime.model.*;
public class LoginDAO {
	
	private static Connection con; 
	private static PreparedStatement stmt;
	public static void getConnection()
	  {
		  try {
		  Class.forName("com.mysql.jdbc.Driver");   // Driver should be registered
		  con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/crimeDB","root",""); 
		  }
		  catch(SQLException e)
		  {	  e.printStackTrace();	  }
		  catch(Exception e)
		  {	  e.printStackTrace();	  }  	  
		  
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
	  	 
	  public static String login(Registermodel log)
		  {
		      String utype="";;
			  boolean status=false;
			  try {
				  getConnection();
				      
					  stmt=con.prepareStatement("select utype from registration where email=? and pass=?");
					  stmt.setString(1, log .getEmail());
					  stmt.setString(2, log.getPass());
					  ResultSet rs=stmt.executeQuery();  
                      if(rs.next())
                      {
                    	  utype=rs.getString(1); 
                      }
                       					  
					  closeConnection();
					  return utype;
							  
				    }
				  catch(SQLException e)
				  {
				  e.printStackTrace();
				  return utype;
				  }
				  catch(Exception e)
				  {
				  e.printStackTrace();
				  return utype;
				  }  	  	  
				  
			  }

	  }