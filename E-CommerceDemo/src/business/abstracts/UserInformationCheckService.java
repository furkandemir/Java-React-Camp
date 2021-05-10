package business.abstracts;

import Entities.concretes.User;

public interface UserInformationCheckService {
	boolean checkEmail(User user);
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkPassword(User user);
	

}
