package dataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	User get(int id);
	User getMail(String Email);
	
	

}
