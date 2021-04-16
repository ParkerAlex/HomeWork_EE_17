package eu.senla;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoUserImpl extends MyConnection implements Dao{
	
	  Connection connection = getConnection();
	  
	  
	
	@Override
	public void create(User user) {
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (login, password) VALUES (?,?)");
			
			preparedStatement.setString(1, "Bob");
			preparedStatement.setString(2, "0000");
			preparedStatement.execute();
		} catch (SQLException e) {			 
			e.printStackTrace();
		} finally {
//			if (preparedStatement != null) {
//				preparedStatement.close();
//			}
//			if (connection != null) {
//				connection.close();
//			}
		}
		
	}

	@Override
	public User read(String login) {
		
		    User user = new User();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT LOGIN, PASSWORD FROM ADRESSS WHERE LOGIN=?");
			preparedStatement.setString(2, login);
			//preparedStatement.setString("JACK", login);
			
			ResultSet resultSet = preparedStatement.executeQuery();	
			
			user.setLogin(resultSet.getString("LOGIN"));
			user.setPassword(resultSet.getString("PASSWORD"));
			
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {			 
			e.printStackTrace();
		} 
		
		return user;
	}
	

	@Override
	public void update(String login, User newUser) {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET login=?, password=? WHERE id=?");
			preparedStatement.setString(1, "BOB");
			preparedStatement.setString(2, "12345678");
			preparedStatement.setInt(3, 2);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {			 
			e.printStackTrace();
		}
		 
	}

	@Override
	public void delete(String login, String pass) {
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE login=? AND password=?");
			
			preparedStatement.setString(1, "JACK");
			preparedStatement.setString(2, "1234");
			preparedStatement.execute();
		} catch (SQLException e) {			 
			e.printStackTrace();
		}
		
	}
	
	

	@Override
	public List<User> readAll() {
		
		List<User> userList = new ArrayList<>();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			String login;
			String pass;
			  while (resultSet.next()) {
				  User user = new User();
				 
				login = resultSet.getString("login");
				pass = resultSet.getString("password");
				System.out.println("---------------------");
				System.out.println(login + "\n");
				System.out.println(pass + "\n");
				
				user.setLogin(login);
				user.setPassword(pass);
				
				userList.add(user);
			}
			
		} catch (SQLException e) {			 
			e.printStackTrace();
		}
		
		
		return userList;
		
		 
	}



}
