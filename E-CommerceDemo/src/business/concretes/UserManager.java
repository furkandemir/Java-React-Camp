package business.concretes;

import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

import Entities.concretes.User;

import business.abstracts.UserInformationCheckService;
import business.abstracts.UserService;
import business.abstracts.VertificationService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.UserDao;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserInformationCheckService userInformationCheckService;
	private VertificationService vertificationService;
	private LoggerService loggerservice;
	
	private List<String> userMailList = new ArrayList<String>();
	
	public UserManager(UserDao userDao,UserInformationCheckService userInformationCheckService,VertificationService vertificationService,LoggerService loggerservice) {
		this.userDao=userDao;
		this.userInformationCheckService=userInformationCheckService;
		this.vertificationService=vertificationService;
		this.loggerservice=loggerservice;
	}

	@Override
	public void Register(User user) {
		if(userInformationCheckService.checkEmail(user)&&
				userInformationCheckService.checkFirstName(user)&&
				userInformationCheckService.checkLastName(user)&&
				userInformationCheckService.checkPassword(user)&&
				!userMailList.contains(user.getEmail())) {
			
			vertificationService.MailVertificate(user);
			userDao.add(user);
			userMailList.add(user.getEmail());
			this.loggerservice.logInSystem("Kullanici eklendi: "+user.getFirstName());
			System.out.println("Kayit basarili sekilde yapilmistir");
		}
		else {
			System.out.println("Kayit basarisiz!! Kayþt bilgilerinizi kontrol edin.");
		}
		
	}

	@Override
	public void Login(String email,String password,User user) {
		if(user.getEmail()==email && user.getPassword()==password) {
			System.out.print("Giris basarili sekilde yapildi...");
		}
		else {
			System.out.println("Giris bilgilerinizi kontrol edin..");
		}
		
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}


}
