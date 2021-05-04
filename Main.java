import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.firstName = "Gülþah";
		customer1.lastName = "Baþkurt";
		customer1.DateOfBirth = LocalDate.of(2001, 5, 5);
		customer1.nationalityId = "34561020528";
		
		customerManager.save(customer1);
	}

}
