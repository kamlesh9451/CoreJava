package org.kp;

public class ReturnInCatchAndFinally {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		try {
		int a =10/0;
		}catch(Exception e){
			System.out.println("catch");

			return;
			
		}
		finally {
			System.out.println("finally");
			return ;
		}

	}

}
