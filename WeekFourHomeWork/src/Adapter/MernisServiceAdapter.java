package Adapter;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer)  {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		
		
		
		try {
			result=client.TCKimlikNoDogrula(Long. parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	

}
}
