package eu.senla;

import java.sql.PreparedStatement;
import java.util.List;

public class DaoUserImpl implements Dao{

	public static PreparedStatement preparedStatement;
	public static Connection connection;
	
	@Override
	public User create(User user) {
		PreparedStatement stmt = connection.prepareStatement("INSERT INTO users (login, password) VALUES (?,?)");

        stmt.setString(1, "Bob");
        stmt.setString(2, "0000");
        stmt.execute();
		return null;
	}

	@Override
	public User read(String name, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(String name, User newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String name, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
