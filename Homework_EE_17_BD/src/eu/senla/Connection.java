package eu.senla;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Connection {

	public static final String url = "jdbc:mysql://127.0.0.1:3306/my_bd?characterEncoding=latin1&useConfigs=maxPerformance";
	public static final String username = "root";
	public static final String password = "root";
    public static Connection conn;
    
    
    static {
    try { 
    	  Connection conn = (Connection) DriverManager.getConnection(url, username, password);

		 } catch(SQLException e){
		    e.printStackTrace();
		 }
    
    }
}