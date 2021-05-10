package core.concretes;

import GLogger.GLoggerManager;
import core.abstracts.LoggerService;

public class GLoggerManagerAdapter implements LoggerService{

	@Override
	public void logInSystem(String message) {
		GLoggerManager gloggermanager=new GLoggerManager();
		gloggermanager.logInWithGoogle(message);
		
		
	}

}
