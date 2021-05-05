package Adapters;


import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ICustomerCheckService  {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy() ;
		boolean result=true;
		
		try {
			result=client.TCKimlikNoDogrula(Long. parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear());
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

