package Adapters;

import java.rmi.RemoteException;


import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		Long nationalityId = Long.parseLong(customer.nationalityId);
		try {
			result = client.TCKimlikNoDogrula(nationalityId
					,customer.firstName.toUpperCase(),customer.lastName.toUpperCase()
					,customer.DateOfBirth.getYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	
}
