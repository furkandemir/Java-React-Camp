import business.abstracts.UserService;
import business.concretes.UserInformationCheckManager;

import business.concretes.UserManager;
import business.concretes.VertificationManager;
import core.concretes.GLoggerManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		UserService userservice=new UserManager(new HibernateUserDao()
				,new UserInformationCheckManager()
				,new VertificationManager()
				,new GLoggerManagerAdapter());

	
	
	User user=new User(1,"furkan","demir","furkan@gmail.com","123456");
	userservice.Register(user);
	
	userservice.Login("furkan@gmail.com", "123456", user);

	
	
	
	}	

}
