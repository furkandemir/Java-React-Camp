package business.concretes;

import Entities.concretes.User;
import business.abstracts.VertificationService;

public class VertificationManager implements VertificationService {

	@Override
	public void MailVertificate(User user) {
		System.out.println("Mail dogrulandi: " +user.getEmail());
		
	}

}
