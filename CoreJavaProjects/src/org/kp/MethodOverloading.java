package org.kp;

public class MethodOverloading {

	public static void main(String[] args) {
     
		Employee emp = new Employee();
		
		emp.show(10);// pass here null check waht happens
		
		
		
	}

}

class Employee{
	
	int id;
	String name;
	
	public Employee() {
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void show(Employee e) {}
	
	public void show(Object e) {}
	
	public void show(String e) {}
	
	public void show(int i) {}
	
	
}
