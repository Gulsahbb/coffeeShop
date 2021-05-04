package Concrete;

import Abstract.BaseCustomerManager;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)){
			System.out.println("saved to db " + customer.firstName);
		}
		else {
			System.out.println("NOT a valid person");
		}
		
	}
	
}
