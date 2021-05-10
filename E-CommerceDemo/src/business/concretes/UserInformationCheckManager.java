package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.concretes.User;
import business.abstracts.UserInformationCheckService;

public class UserInformationCheckManager implements UserInformationCheckService {

	@Override
	public boolean checkEmail(User user) {
		Pattern p = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(user.getEmail());
		if (m.find())
		    return true;
		else 
			return false;
	} 
	

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()>=2) {
			return true;
		}
		else 	
			return false;
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length()>=2) {
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		else
			return false;
	}

}
