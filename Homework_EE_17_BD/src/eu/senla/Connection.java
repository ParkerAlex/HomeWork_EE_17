package eu.senla;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Connection {

	public static final String url = "jdbc:mysql://127.0.0.1:3306/my_bd?characterEncoding=latin1&useConfigs=maxPerformance";
	public static final String username = "root";
	public static final String password = "root";
    
    
    
    static {
		    try { 
		    	  connection = DriverManager.getConnection(url, username, password);
		
				 } catch(SQLException e){
				    e.printStackTrace();
				 }
    
    }



	protected abstract PreparedStatement prepareStatement(String string);
}