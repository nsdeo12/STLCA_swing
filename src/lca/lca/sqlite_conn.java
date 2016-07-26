package lca;
import java.sql.*;
import javax.swing.*;
public class sqlite_conn {
	
	Connection conn = null;
	
	public static Connection dbConnector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			 Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
			 JOptionPane.showMessageDialog(null, "connection successful");
			 return conn;
		     
//		     Statement statement = connection.createStatement();
//		      statement.setQueryTimeout(30); 
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
			return null;
		}
	}

}
