package eu.senla;

import java.util.List;

public interface Dao {
	
	void create (User user);
	User read (String login);
	void update (String login, User newUser);
	void delete (String login, String pass);
	List<User> readAll();

}
