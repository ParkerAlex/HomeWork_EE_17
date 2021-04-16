package eu.senla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class Main {
	//public static void main(String[] args) throws ClassNotFoundException {
	
	public static void main(String[] args) {
		
		MyConnection connection = new MyConnection();
		connection.getConnection();
		
		DaoUserImpl daoUserImpl = new DaoUserImpl();
		User user = new User();
		user.setLogin("PARKER");
		user.setPassword("12345");
		
		daoUserImpl.create(user);       //ДОБАВИТЬ
	//	daoUserImpl.delete(user);       //УДАЛИТЬ    ??????
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////			
		List<User> userList = daoUserImpl.readAll();      //ПРОСМОТРЕТЬ
				for (User i:userList) {
					System.out.println(i);
				    }
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 		


        	    }


	}


