package Entities.concretes;

import Entities.abstracts.Entity;

public class User implements Entity {
	private int Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	public User(int id, String firstName, String lastName, String email, String password) {
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
		

}
