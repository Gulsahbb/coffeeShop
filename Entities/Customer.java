package Entities;

import java.time.LocalDate;
import Abstract.IEntity;

public class Customer implements IEntity {
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate DateOfBirth;
	public String nationalityId;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	
	
	
	
	
}
