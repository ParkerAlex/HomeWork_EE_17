package eu.senla;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {

	  String url = "jdbc:mysql://127.0.0.1:3306/my_bd?characterEncoding=latin1&useConfigs=maxPerformance";
	  String login = "root";
	  String password = "root";
	  
	  
	  public Connection getConnection() {
		  Connection connection = null;
		  
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			   connection = DriverManager.getConnection(url, login, password); 
			  System.out.println("Соединение удалось!)))");
	  
		  } catch(ClassNotFoundException | SQLException e){
			    e.printStackTrace();
			    System.out.println("Соединение НЕудалось!)))");
			 }
	 
                return connection;
    
		  }
	//protected abstract PreparedStatement prepareStatement(String string);
}