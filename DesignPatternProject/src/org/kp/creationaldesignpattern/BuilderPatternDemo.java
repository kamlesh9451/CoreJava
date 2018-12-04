package org.kp.creationaldesignpattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder()
				       .firstName("Kamlesh")
				       .lastName("Pandey")
				       .age(74)
				       .address("Indirapuram")
				       .phone("9716449763").buildUser();
		
		System.out.println(user);
				  

	}

}
