package Entities;

import java.util.Date;

public class Gamer {
	
	private int id;
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	private String nationalityId;
	
	public Gamer(int id, String firstName, String lastName,Date DateOfBirth, String nationalityId) {
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.nationalityId = nationalityId;
		this.DateOfBirth=DateOfBirth;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}


	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	
	
	
	
	
	
	

}
