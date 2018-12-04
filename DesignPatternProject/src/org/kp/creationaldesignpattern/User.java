package org.kp.creationaldesignpattern;

public class User {
	
	String firstName;
	String lastName;
	int age;
	String phone;
	String address;
	
	private User(UserBuilder userBuilder) {
		
		this.firstName= userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age      = userBuilder.age;
		this.phone    = userBuilder.phone;
		this.address    = userBuilder.address;
	}
	
	
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}



	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	 public static class UserBuilder{
		 
		    String firstName;
			String lastName;
			int age;
			String phone;
			String address;
			
			public UserBuilder() {}
			
			public UserBuilder  firstName(String firstName) {
				this.firstName=firstName;
				return this;
				
			}
			
			public UserBuilder  lastName(String lastName) {
				this.lastName=lastName;
				return this;
				
			}
			
			public UserBuilder age (int age) {
				this.age=age;
				return this;
				
			}
			
			public UserBuilder phone(String phone) {
				this.phone=phone;
				return this;
			}
			
			public UserBuilder address (String address) {
				this.address=address;
				return this;
			}
			
			public User buildUser() {
				User user = new User(this);
				return user;
				
			}
			
			
		 
	 }
	
	 
	
	

}
