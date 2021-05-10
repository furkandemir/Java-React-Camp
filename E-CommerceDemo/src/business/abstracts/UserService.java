package business.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserService {
	public void Register(User user);
	public void Login(String email,String password,User user);
	List<User> getAll();
	
	

}
